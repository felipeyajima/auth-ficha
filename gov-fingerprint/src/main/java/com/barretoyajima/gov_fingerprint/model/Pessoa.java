package com.barretoyajima.gov_fingerprint.model;

import jakarta.persistence.*;


import java.util.UUID;

@Entity
@Table(name="pessoas")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String cpf;

    private String esquerdoPolegar;
    private String esquerdoIndicador;
    private String esquerdoMedio;
    private String esquerdoAnelar;
    private String esquerdoMinimo;

    private String diretoPolegar;
    private String direitoIndicador;
    private String direitoMedio;
    private String direitoAnelar;
    private String direitoMinimo;


    public Pessoa() {
    }

    public Pessoa(UUID id, String name, String cpf, String esquerdoPolegar, String esquerdoIndicador, String esquerdoMedio, String esquerdoAnelar, String esquerdoMinimo, String diretoPolegar, String direitoIndicador, String direitoMedio, String direitoAnelar, String direitoMinimo) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.esquerdoPolegar = esquerdoPolegar;
        this.esquerdoIndicador = esquerdoIndicador;
        this.esquerdoMedio = esquerdoMedio;
        this.esquerdoAnelar = esquerdoAnelar;
        this.esquerdoMinimo = esquerdoMinimo;
        this.diretoPolegar = diretoPolegar;
        this.direitoIndicador = direitoIndicador;
        this.direitoMedio = direitoMedio;
        this.direitoAnelar = direitoAnelar;
        this.direitoMinimo = direitoMinimo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEsquerdoPolegar() {
        return esquerdoPolegar;
    }

    public void setEsquerdoPolegar(String esquerdoPolegar) {
        this.esquerdoPolegar = esquerdoPolegar;
    }

    public String getEsquerdoIndicador() {
        return esquerdoIndicador;
    }

    public void setEsquerdoIndicador(String esquerdoIndicador) {
        this.esquerdoIndicador = esquerdoIndicador;
    }

    public String getEsquerdoMedio() {
        return esquerdoMedio;
    }

    public void setEsquerdoMedio(String esquerdoMedio) {
        this.esquerdoMedio = esquerdoMedio;
    }

    public String getEsquerdoAnelar() {
        return esquerdoAnelar;
    }

    public void setEsquerdoAnelar(String esquerdoAnelar) {
        this.esquerdoAnelar = esquerdoAnelar;
    }

    public String getEsquerdoMinimo() {
        return esquerdoMinimo;
    }

    public void setEsquerdoMinimo(String esquerdoMinimo) {
        this.esquerdoMinimo = esquerdoMinimo;
    }

    public String getDiretoPolegar() {
        return diretoPolegar;
    }

    public void setDiretoPolegar(String diretoPolegar) {
        this.diretoPolegar = diretoPolegar;
    }

    public String getDireitoIndicador() {
        return direitoIndicador;
    }

    public void setDireitoIndicador(String direitoIndicador) {
        this.direitoIndicador = direitoIndicador;
    }

    public String getDireitoMedio() {
        return direitoMedio;
    }

    public void setDireitoMedio(String direitoMedio) {
        this.direitoMedio = direitoMedio;
    }

    public String getDireitoAnelar() {
        return direitoAnelar;
    }

    public void setDireitoAnelar(String direitoAnelar) {
        this.direitoAnelar = direitoAnelar;
    }

    public String getDireitoMinimo() {
        return direitoMinimo;
    }

    public void setDireitoMinimo(String direitoMinimo) {
        this.direitoMinimo = direitoMinimo;
    }
}
