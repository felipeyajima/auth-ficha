package com.barretoyajima.fichas_sus.service.impl;

import com.barretoyajima.fichas_sus.controller.exception.ControllerNotFoundException;
import com.barretoyajima.fichas_sus.model.Ficha;
import com.barretoyajima.fichas_sus.repository.FichaRepository;
import com.barretoyajima.fichas_sus.service.FichaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FichaServiceImpl implements FichaService {

    private final FichaRepository fichaRepository;

    @Autowired
    public FichaServiceImpl(FichaRepository fichaRepository) {
        this.fichaRepository = fichaRepository;
    }

    @Override
    public Page<Ficha> findAll(Pageable pageable) {
        return this.fichaRepository.findAll(pageable);
    }

    @Override
    public Ficha findById(Long id) {
        return this.fichaRepository.findById(id)
                .orElseThrow(() -> new ControllerNotFoundException("ficha não encontrada"));
    }

    @Override
    public Ficha create(Ficha ficha) {
        return this.fichaRepository.save(ficha);
    }

    @Override
    public void update(Ficha ficha) {
        this.fichaRepository.save(ficha);
    }

    @Override
    public void deleteById(Long id) {
        this.fichaRepository.deleteById(id);
    }


}
