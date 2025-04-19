package com.barretoyajima.gov_fingerprint.service.impl;

import com.barretoyajima.gov_fingerprint.controller.exception.ControllerNotFoundException;
import com.barretoyajima.gov_fingerprint.model.Pessoa;
import com.barretoyajima.gov_fingerprint.model.PessoaDTO;
import com.barretoyajima.gov_fingerprint.repository.PessoaRepository;
import com.barretoyajima.gov_fingerprint.service.PessoaService;
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
    public PessoaDTO obterPorDigital(String digital) {
        Pessoa pessoa = pessoaRepository
                .findFirstByDireitoIndicador(digital)
                .orElseThrow(()-> new ControllerNotFoundException("pessoa nao encontrada a partir da digital"));
        return toDto(pessoa);
    }

    @Override
    public PessoaDTO toDto(Pessoa pessoa) {
        return new PessoaDTO(
            pessoa.getName(),
            pessoa.getCpf()
        );
    }
}
