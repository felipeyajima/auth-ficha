package com.barretoyajima.gov_fingerprint.repository;

import com.barretoyajima.gov_fingerprint.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface PessoaRepository extends JpaRepository<Pessoa, UUID> {

    Optional<Pessoa> findFirstByDireitoIndicador(String fingerPrint);

}
