package com.barretoyajima.toten.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cadastro-sus-api")
public interface PessoaCadastroSusClient {

    @GetMapping(value = "/pessoas-sus/findByCpf/{cpf}")
    PessoaCadastroSusResponse getPessoaSusCpf(@PathVariable String cpf);

}
