FROM ruby:2.5.1
RUN apt-get update -qq && apt-get install -y build-essential libpq-dev nodejs
RUN mkdir /controle-acesso
WORKDIR /controle-acesso
COPY Gemfile /controle-acesso/Gemfile
COPY Gemfile.lock /controle-acesso/Gemfile.lock
RUN bundle install
COPY . /controle-acesso