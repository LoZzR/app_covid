package com.covid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entities.Posologie;

public interface PosologieRepository extends JpaRepository<Posologie, Integer>{

}
