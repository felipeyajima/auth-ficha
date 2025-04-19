package com.barretoyajima.toten.model;

import jakarta.persistence.*;


import java.util.UUID;

@Entity
@Table(name="fichas")
public class Ficha {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Long senha;
    private String dataCriacao;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getSenha() {
        return senha;
    }

    public void setSenha(Long senha) {
        this.senha = senha;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
