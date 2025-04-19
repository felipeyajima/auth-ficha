package com.barretoyajima.cadastrosus.service.impl;

import com.barretoyajima.cadastrosus.controller.exception.ControllerNotFoundException;
import com.barretoyajima.cadastrosus.model.Pessoa;
import com.barretoyajima.cadastrosus.repository.PessoaRepository;
import com.barretoyajima.cadastrosus.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PessoaServiceImpl implements PessoaService {


    private final PessoaRepository pessoaRepository;

    @Autowired
    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public Page<Pessoa> findAll(Pageable pageable) {
        return this.pessoaRepository.findAll(pageable);
    }

    @Override
    public Pessoa findById(UUID id) {
        return this.pessoaRepository.findById(id)
                .orElseThrow(() -> new ControllerNotFoundException("Pessoa não encontrada"));
    }

    @Override
    public Pessoa create(Pessoa pessoa) {
        return this.pessoaRepository.save(pessoa);
    }

    @Override
    public void update(Pessoa pessoa) {
        this.pessoaRepository.save(pessoa);
    }

    @Override
    public void deleteById(UUID id) {
        this.pessoaRepository.deleteById(id);
    }

    @Override
    public Pessoa findByCpf(String cpf) {
        return this.pessoaRepository.findByCpf(cpf)
                .orElseThrow(()-> new ControllerNotFoundException("Pessoa nao encontrada"));
    }

}
