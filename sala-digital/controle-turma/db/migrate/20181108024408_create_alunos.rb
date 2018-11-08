class CreateAlunos < ActiveRecord::Migration[5.2]
  def change
    create_table :alunos do |t|
      t.string :external_id
      t.references :turma, foreign_key: true

      t.timestamps
    end
  end
end
