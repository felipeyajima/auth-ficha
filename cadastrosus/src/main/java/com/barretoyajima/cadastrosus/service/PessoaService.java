package com.barretoyajima.cadastrosus.service;

import com.barretoyajima.cadastrosus.model.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface PessoaService {

    Page<Pessoa> findAll(Pageable pageable);

    public Pessoa findById(UUID id);

    public Pessoa create(Pessoa pessoa);

    public void update(Pessoa pessoa);

    public void deleteById(UUID id);

    public Pessoa findByCpf(String cpf);
}
