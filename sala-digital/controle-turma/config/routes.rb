Rails.application.routes.draw do
  post '/turmas', to: 'turma#create'
end
