package com.barretoyajima.toten.service;

import com.barretoyajima.toten.integration.*;
import com.barretoyajima.toten.model.Ficha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FichaService {

    @Autowired
    private PessoaFingerPrintClient pessoaFingerPrintClient;

    @Autowired
    private PessoaCadastroSusClient pessoaCadastroSusClient;

    @Autowired
    private FichaMedicaClient fichaMedicaClient;

    public Ficha create(String digital){

        // CHAMANDO API FINGERPRINT
        System.out.println("chamando api do governo");
        PessoaFingerPrintResponse pessoa = pessoaFingerPrintClient.getPessoaFingerPrint(digital);
        System.out.println(pessoa.getName());

        // CHAMANDO CADASTRO DO SUS
        System.out.println("chamando api de cadastro do sus");
        PessoaCadastroSusResponse pessoaSus = pessoaCadastroSusClient.getPessoaSusCpf(pessoa.getCpf());
        System.out.println(pessoaSus.getCns());


        FichaMedicaRequest fichaMedicaRequest = new FichaMedicaRequest();
        fichaMedicaRequest.setCpf(pessoaSus.getCpf());
        fichaMedicaRequest.setNamePaciente(pessoaSus.getName());
        fichaMedicaRequest.setCns(pessoaSus.getCns());
        fichaMedicaRequest.setEndereco(pessoaSus.getEndereco());
        fichaMedicaRequest.setDataAbertura(LocalDateTime.now().toString());
        fichaMedicaRequest.setQueixa("dor de barriga");
        fichaMedicaRequest.setTelefoneContato(pessoaSus.getTelefoneContato());

        System.out.println("chamando api de ficha para criacao");
        FichaMedicaResponse fichaMedicaResponse = fichaMedicaClient.criarFicha(fichaMedicaRequest);


        Ficha ficha = new Ficha();
        ficha.setSenha(fichaMedicaResponse.getSenha());
        ficha.setDataCriacao(fichaMedicaResponse.getDataAbertura());
        return ficha;

    }

}
