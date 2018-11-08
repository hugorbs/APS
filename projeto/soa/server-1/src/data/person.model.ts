import { Table, Column, Model, Sequelize } from 'sequelize-typescript';

const attributes = {
  codMateria: {
    type: Sequelize.INTEGER,
    allowNull: false,
    primaryKey: true,
  },
  nome: {
    type: Sequelize.STRING(25),
    allowNull: false,
  },
  ementa: {
    type: Sequelize.STRING(50),
    allowNull: false,
  },
  preRequisitos: {
    type: Sequelize.ARRAY(Sequelize.INTEGER),
    allowNull: false,
  }
};

const options = {
  timestamps: false,
  paranoid: false,
  underscored: false,
  freezeTableName: true,
  tableName: 'Person',
  version: false,
}

export = {
  modelName: 'Person',
  attributes: attributes,
  options: options,
};