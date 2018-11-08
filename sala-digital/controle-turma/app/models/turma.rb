class Turma < ApplicationRecord
  has_many :alunos
  has_many :professores, class_name: 'Professor'
  accepts_nested_attributes_for :professores, :allow_destroy => true
  accepts_nested_attributes_for :alunos, :allow_destroy => true
end
