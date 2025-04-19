package com.barretoyajima.fichas_sus.controller;

import com.barretoyajima.fichas_sus.model.Ficha;
import com.barretoyajima.fichas_sus.service.FichaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value= "/fichas")
public class FichaController {

    @Autowired
    private FichaService fichaService;


    @RequestMapping(method = { RequestMethod.GET })
    public ResponseEntity<Page<Ficha>> obterTodos(Pageable pageable){
        Page<Ficha> fichas = this.fichaService.findAll(pageable);
        return ResponseEntity.ok(fichas);
    }

    @RequestMapping(value = "/{id}", method = { RequestMethod.GET })
    public Ficha obterPorId(@PathVariable Long id){
        return this.fichaService.findById(id);
    }

    @PostMapping
    public Ficha criar(@RequestBody Ficha ficha){
        return this.fichaService.create(ficha);
    }

    @PutMapping
    public void atualizar(@RequestBody Ficha ficha){
        this.fichaService.update(ficha);
    }

    @RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
    public void deleteFicha(@PathVariable Long id){
        this.fichaService.deleteById(id);
    }

}
