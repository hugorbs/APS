FROM ruby:2.5.1
RUN apt-get update -qq && apt-get install -y build-essential libpq-dev nodejs
RUN mkdir /controle-turma
WORKDIR /controle-turma
COPY Gemfile /controle-turma/Gemfile
COPY Gemfile.lock /controle-turma/Gemfile.lock
RUN bundle install
COPY . /controle-turma