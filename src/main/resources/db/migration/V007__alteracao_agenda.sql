alter table agenda add column id_usuarios bigint;

alter table agenda add constraint id_usuarios_agendafk foreign key (id_usuarios) references usuarios (id_usuarios);