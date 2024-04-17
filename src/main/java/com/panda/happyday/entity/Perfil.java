package com.panda.happyday.entity;


import javax.persistence.*;

@Entity
@Table( name = "PERFIL")
public class Perfil{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_PERFIL" )
    private Long id;

    @Column (name = "PERFIL" )
    private  String perfil;


    public Perfil() {

    }


    public Perfil(Long id, String perfil) {
        this.id = id;
        this.perfil = perfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}