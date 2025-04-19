package com.barretoyajima.toten.integration;

public class FichaMedicaRequest {

    private String dataAbertura;
    private String namePaciente;
    private String cpf;
    private String dataNasc;
    private String telefoneContato;
    private String endereco;
    private String cns;
    private String queixa;

    public FichaMedicaRequest() {
    }

    public FichaMedicaRequest(String dataAbertura, String namePaciente, String cpf, String dataNasc, String telefoneContato, String endereco, String cns, String queixa) {
        this.dataAbertura = dataAbertura;
        this.namePaciente = namePaciente;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.telefoneContato = telefoneContato;
        this.endereco = endereco;
        this.cns = cns;
        this.queixa = queixa;
    }


    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getNamePaciente() {
        return namePaciente;
    }

    public void setNamePaciente(String namePaciente) {
        this.namePaciente = namePaciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
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

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }
}
