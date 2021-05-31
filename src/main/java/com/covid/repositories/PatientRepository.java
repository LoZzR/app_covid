package com.covid.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.covid.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

	@Query("select p from Patient p where p.sexe =:sexe")
	List<Patient> getPatientBySexe(@Param("sexe")String sexe);

	@Query("select p from Patient p where p.adresse like CONCAT('%',:ville,'%')")
	List<Patient> getPatientByVille(@Param("ville")String ville);
}
