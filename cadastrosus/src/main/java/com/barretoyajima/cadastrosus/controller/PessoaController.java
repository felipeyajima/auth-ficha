package com.barretoyajima.cadastrosus.controller;

import com.barretoyajima.cadastrosus.model.Pessoa;
import com.barretoyajima.cadastrosus.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value= "/pessoas-sus")
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

    @RequestMapping(value = "/findByCpf/{cpf}", method = { RequestMethod.GET })
    public Pessoa obterPorCpf(@PathVariable String cpf){
        return this.pessoaService.findByCpf(cpf);
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
}
