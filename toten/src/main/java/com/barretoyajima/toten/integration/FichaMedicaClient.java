package com.barretoyajima.toten.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "ficha-api")
public interface FichaMedicaClient {

    @PostMapping(value = "/fichas", consumes = "application/json")
    FichaMedicaResponse criarFicha(@RequestBody FichaMedicaRequest request);

}
