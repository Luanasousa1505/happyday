package com.panda.happyday.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "AGENDA")
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_AGENDA" )
    private Long id;

    @Column(name = "DATA_CRIACAO" )
    private Timestamp dataCriacao;

    @Column(name = "DATA_HORA_INICIO" )
    private Timestamp dataHoraInicio;

    @Column(name = "DATA_HORA_FIM" )
    private Timestamp dataHoraFim;

    @Column(name = "TIPO_ATIVIDADE" )
    private String tipoAtividade;

    @Column(name = "STATUS_CONCLUSAO" )
    private String statusConclusao;

    @Column(name = "PORCENTAGEM_CONCLUSAO" )
    private Double porcentagemConclusao;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIOS")
    private Usuarios usuarios;


    public Agenda(Long id, Timestamp dataCriacao, Timestamp dataHoraInicio, Timestamp dataHoraFim, String tipoAtividade, String statusConclusao, Double porcentagemConclusao, Usuarios usuarios) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.tipoAtividade = tipoAtividade;
        this.statusConclusao = statusConclusao;
        this.porcentagemConclusao = porcentagemConclusao;
        this.usuarios = usuarios;
    }

    public Agenda(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Timestamp dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Timestamp getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Timestamp dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public Timestamp getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(Timestamp dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public String getStatusConclusao() {
        return statusConclusao;
    }

    public void setStatusConclusao(String statusConclusao) {
        this.statusConclusao = statusConclusao;
    }

    public Double getPorcentagemConclusao() {
        return porcentagemConclusao;
    }

    public void setPorcentagemConclusao(Double porcentagemConclusao) {
        this.porcentagemConclusao = porcentagemConclusao;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}



