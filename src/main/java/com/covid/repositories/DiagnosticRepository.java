package com.covid.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.covid.entities.Diagnostic;
import com.covid.entities.Patient;

public interface DiagnosticRepository extends JpaRepository<Diagnostic, Integer>{

	@Query("select d.patient from Diagnostic d where d.etatFinal = :etatFinal")
	public List<Patient> getPatientByEtatFinal(@Param("etatFinal")boolean etatFinal);

	@Query("select d.patient from Diagnostic d where d.etatFinal = :etatFinal and d.patient.sexe = :sexe")
	public List<Patient> getPatientByEtatAndSexe(@Param("etatFinal")boolean etatFinal, @Param("sexe")String sexe);

	@Query("select d.patient from Diagnostic d where d.etatFinal = :etatFinal and d.patient.adresse like CONCAT('%',:ville,'%')")
	public List<Patient> getPatientByEtatAndVille(@Param("etatFinal")boolean etatFinal, @Param("ville")String ville);

	@Query("select d.patient from Diagnostic d where d.etatFinal = :etatFinal and d.patient.sexe = :sexe and d.patient.adresse like CONCAT('%',:ville,'%')")
	public List<Patient> getPatientByEtatAndSexeAndVille(@Param("etatFinal")boolean etatFinal, @Param("sexe")String sexe, @Param("ville")String ville);
} 
