package com.covid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entities.Symptome;

public interface SymptomeRepository extends JpaRepository<Symptome, Integer>{

}
