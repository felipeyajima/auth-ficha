package com.barretoyajima.toten.repository;

import com.barretoyajima.toten.model.Ficha;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FichaRepository extends JpaRepository<Ficha, UUID> {
}
