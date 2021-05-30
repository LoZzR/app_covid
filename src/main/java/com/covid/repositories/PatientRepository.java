package com.covid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
