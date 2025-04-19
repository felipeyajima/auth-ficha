package com.barretoyajima.toten.integration;

import java.util.UUID;

public class PessoaCadastroSusResponse {

    private UUID id;
    private String name;
    private String cpf;
    private String nasc;
    private String tipoSanguineo;
    private String telefoneContato;
    private String endereco;
    private String cns;

    public PessoaCadastroSusResponse() {
    }

    public PessoaCadastroSusResponse(UUID id, String name, String cpf, String nasc, String tipoSanguineo, String telefoneContato, String endereco, String cns) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.nasc = nasc;
        this.tipoSanguineo = tipoSanguineo;
        this.telefoneContato = telefoneContato;
        this.endereco = endereco;
        this.cns = cns;
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

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

}
