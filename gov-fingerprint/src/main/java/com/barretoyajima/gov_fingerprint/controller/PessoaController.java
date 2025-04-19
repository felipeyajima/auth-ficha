package com.barretoyajima.gov_fingerprint.controller;

import com.barretoyajima.gov_fingerprint.model.Pessoa;
import com.barretoyajima.gov_fingerprint.model.PessoaDTO;
import com.barretoyajima.gov_fingerprint.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value= "/pessoas-gov-fingerprint")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<Page<Pessoa>> obterTodos(Pageable pageable){
        Page<Pessoa> pessoas = this.pessoaService.findAll(pageable);
        return ResponseEntity.ok(pessoas);
    }

    @RequestMapping(value = "/{uuid}", method = { RequestMethod.GET })
    public Pessoa obterPorId(@PathVariable UUID id){
        return this.pessoaService.findById(id);
    }

    @PostMapping
    public Pessoa criar(@RequestBody Pessoa pessoa){
        return this.pessoaService.create(pessoa);
    }

    @PutMapping
    public void atualizar(@RequestBody Pessoa pessoa){
        this.pessoaService.update(pessoa);
    }

    @RequestMapping(value = "/{uuid}", method = { RequestMethod.DELETE })
    public void deletePessoa(@PathVariable UUID id){
        this.pessoaService.deleteById(id);
    }

    @GetMapping("/direito-indicador/{digital}")
    public PessoaDTO obterPorDigital(@PathVariable String digital){
        return this.pessoaService.obterPorDigital(digital);
    }

}
