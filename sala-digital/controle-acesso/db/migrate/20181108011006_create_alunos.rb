class CreateAlunos < ActiveRecord::Migration[5.2]
  def change
    create_table :alunos do |t|
      t.string :matricula
      t.string :nome
      t.string :login
      t.string :senha

      t.timestamps
    end
  end
end
