# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table usuario (
  id                            integer auto_increment not null,
  tipo_usuario                  integer not null,
  email                         varchar(255),
  senha                         varchar(255),
  constraint pk_usuario primary key (id)
);


# --- !Downs

drop table if exists usuario;

