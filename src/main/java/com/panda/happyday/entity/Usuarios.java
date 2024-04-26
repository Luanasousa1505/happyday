package com.panda.happyday.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "USUARIOS")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_USUARIOS" )
    private Long id;

    @Column (name = "NOME" )
    private String nome;

    @Column (name = "EMAIL" )
    private String email;

    @Column (name = "SENHA" )
    private String senha;

    @OneToMany
    @JoinTable(
            name = "USUARIOS_PERFIL",
            joinColumns = @JoinColumn( name = "ID_USUARIOS"),
            inverseJoinColumns = @JoinColumn( name = "ID_PERFIL")
    )
    private List<Perfil> perfis = new ArrayList<>();

    public Usuarios() {

    }

    public Usuarios(Long id, String nome, String email, String senha, List<Perfil> perfis) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfis = perfis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<Perfil> perfis) {
        this.perfis = perfis;
    }
}
