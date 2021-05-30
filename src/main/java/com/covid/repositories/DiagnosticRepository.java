package com.covid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entities.Diagnostic;

public interface DiagnosticRepository extends JpaRepository<Diagnostic, Integer>{

}
