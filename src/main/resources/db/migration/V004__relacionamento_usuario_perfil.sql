create table usuarios_perfil(
    id_usuarios bigint,
    id_perfil bigint
);

alter table usuarios_perfil add constraint id_usuario_perfil_fk foreign key (id_usuarios) references usuarios (id_usuarios);
alter table usuarios_perfil add constraint id_perfil_usuarios_fk foreign key (id_perfil) references perfil (id_perfil);