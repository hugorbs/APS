import Sequelize from 'sequelize';
import Person from '../data/person.model';

const sequelize =  new Sequelize({
  database: 'some_db',
  dialect: 'postgres',
  username: 'postgres',
  password: 'test_pass',
  host: 'db-materia',
  port: 5432,
  storage: 'postgres',
});

// sequelize.addModels([Person]);
// sequelize.addModels(['../data']);

class Dao {

  db: Sequelize.Model<any, any>;
  constructor() {
    console.log('setting dao');
    this.db = sequelize.define(Person.modelName, Person.attributes, Person.options);
    this.db.sync();
  }

  async getAll() {
    return (await this.db.findAll()) || [];
  }

  async create(person: Object) {
    console.log('try create');
    console.log(JSON.stringify(person));
    await this.db.create(person);
  }
}

export = Dao;