package com.barretoyajima.toten.controller;

import com.barretoyajima.toten.model.Ficha;
import com.barretoyajima.toten.service.FichaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value= "/criar-senha")
public class FichaController {

    @Autowired
    private FichaService fichaService;

    @RequestMapping(value = "/{digital}", method = { RequestMethod.GET })
    public Ficha criar(@PathVariable String digital){
        return this.fichaService.create(digital);
    }


}
