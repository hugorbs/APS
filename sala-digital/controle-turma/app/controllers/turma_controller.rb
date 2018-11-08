class TurmaController < ApplicationController
  def create
    @turma = Turma.new(turma_params)

    if @turma.save
      render json: @turma, status: :created
    else
      render json: @turma.errors, status: :unprocessable_entity
    end
  end

  def turma_params
    params.require(:turma).permit(:codigo, :materia_id, alunos_attributes: [:external_id], professores_attributes: [:external_id])
  end
end