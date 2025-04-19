package com.barretoyajima.toten.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "fingerprint-api")
public interface PessoaFingerPrintClient {
    @GetMapping(value = "/pessoas-gov-fingerprint/direito-indicador/{digital}")
    PessoaFingerPrintResponse getPessoaFingerPrint(@PathVariable String digital);
}
