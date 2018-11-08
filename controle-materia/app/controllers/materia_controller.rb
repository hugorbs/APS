class MateriaController < ApplicationController
  before_action :set_materia, only: [:show, :update, :destroy]

  def index
    @materia = Materia.all

    render json: @materia
  end

  def show
    render json: @materia
  end

  def create
    @materia = Materia.new(materia_params)

    if @materia.save
      render json: @materia, status: :created, location: @materia
    else
      render json: @materia.errors, status: :unprocessable_entity
    end
  end

  def update
    if @materia.update(materia_params)
      render json: @materia
    else
      render json: @materia.errors, status: :unprocessable_entity
    end
  end

  def destroy
    @materia.destroy
  end

  private
    def set_materia
      @materia = Materia.find(params[:id])
    end

    def materia_params
      params.require(:materia).permit(:cod_materia, :ementa, :nome)
    end
end
