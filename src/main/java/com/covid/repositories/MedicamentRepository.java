package com.covid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entities.Medicament;

public interface MedicamentRepository  extends JpaRepository<Medicament, Integer>{

}
