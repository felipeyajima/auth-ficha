package com.barretoyajima.fichas_sus.repository;

import com.barretoyajima.fichas_sus.model.Ficha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FichaRepository extends JpaRepository<Ficha, Long> {
}
