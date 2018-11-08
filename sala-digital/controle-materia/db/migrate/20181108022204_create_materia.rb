class CreateMateria < ActiveRecord::Migration[5.2]
  def change
    create_table :materia do |t|
      t.integer :cod_materia
      t.string :ementa
      t.string :nome

      t.timestamps
    end
  end
end
