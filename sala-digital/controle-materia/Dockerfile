FROM ruby:2.5.1
RUN apt-get update -qq && apt-get install -y build-essential libpq-dev nodejs
RUN mkdir /controle-materia
WORKDIR /controle-materia
COPY Gemfile /controle-materia/Gemfile
COPY Gemfile.lock /controle-materia/Gemfile.lock
RUN bundle install
COPY . /controle-materia