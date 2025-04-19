package com.barretoyajima.toten.integration;

public class PessoaFingerPrintResponse {

    private String name;
    private String cpf;


    public PessoaFingerPrintResponse() {
    }

    public PessoaFingerPrintResponse(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
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
}
