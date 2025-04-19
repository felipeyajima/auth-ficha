package com.barretoyajima.fichas_sus.service;

import com.barretoyajima.fichas_sus.model.Ficha;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface FichaService {

    Page<Ficha> findAll(Pageable pageable);

    public Ficha findById(Long id);

    public Ficha create(Ficha ficha);

    public void update(Ficha ficha);

    public void deleteById(Long id);
}
