package com.barretoyajima.gov_fingerprint.service;

import com.barretoyajima.gov_fingerprint.model.Pessoa;
import com.barretoyajima.gov_fingerprint.model.PessoaDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface PessoaService {

    Page<Pessoa> findAll(Pageable pageable);

    public Pessoa findById(UUID id);

    public Pessoa create(Pessoa pessoa);

    public void update(Pessoa pessoa);

    public void deleteById(UUID id);

    public PessoaDTO obterPorDigital(String digital);

    public PessoaDTO toDto(Pessoa pessoa);

}
