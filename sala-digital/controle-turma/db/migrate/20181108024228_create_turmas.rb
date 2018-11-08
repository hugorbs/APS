class CreateTurmas < ActiveRecord::Migration[5.2]
  def change
    create_table :turmas do |t|
      t.integer :codigo
      t.integer :materia_id

      t.timestamps
    end
  end
end
