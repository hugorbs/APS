class CreateProfessors < ActiveRecord::Migration[5.2]
  def change
    create_table :professors do |t|
      t.string :nome
      t.string :login
      t.string :senha
      t.string :siape
      t.string :cargo

      t.timestamps
    end
  end
end
