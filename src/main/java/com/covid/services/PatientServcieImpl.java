package com.covid.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.entities.Diagnostic;
import com.covid.entities.Patient;
import com.covid.repositories.DiagnosticRepository;
import com.covid.repositories.PatientRepository;

@Service
public class PatientServcieImpl implements PatientService{

	@Autowired
	private PatientRepository patientRepo;
	
	@Autowired
	private DiagnosticRepository diagnosticRepo;

	@Override
	public Patient addPatient(Patient patient) {
		return this.patientRepo.save(patient);
	}

	@Override
	public Diagnostic addDiagnostic(Diagnostic diagnostic) {
		return this.diagnosticRepo.save(diagnostic);
	}
	
	@Override
	public void deletePatient(Patient patient) {
		this.patientRepo.delete(patient);
	}

	@Override
	public void deleteDiagnostic(Diagnostic diagnostic) {
		this.diagnosticRepo.delete(diagnostic);
	}

	@Override
	public List<Patient> getAllPatient() {
		return this.patientRepo.findAll();
	}

	@Override
	public List<Diagnostic> getAllDiagnostic() {
		return this.diagnosticRepo.findAll();
	}

	@Override
	public Patient getPatient(Integer id) {
		return this.patientRepo.findById(id).orElseThrow(()->new RuntimeException("Patient not found with id "+ id));
	}

	@Override
	public Diagnostic getDiagnostic(Integer id) {
		return this.diagnosticRepo.findById(id).orElseThrow(()->new RuntimeException("Diagnostic not found with id "+ id));
	}

	@Override
	public List<Patient> getAllPatientBySexe(String sexe) {
		return this.patientRepo.getPatientBySexe(sexe);
	}

	@Override
	public List<Patient> getAllPatientByVille(String ville) {
		return this.patientRepo.getPatientByVille(ville);
	}

	@Override
	public List<Patient> getAllPatientBySexeAndVille(String sexe, String ville) {
		return this.patientRepo.getPatientBySexeAndVille(sexe, ville);
	}

	@Override
	public List<Patient> getAllPatientByEtatFinal(boolean etatFinal) {
		return this.diagnosticRepo.getPatientByEtatFinal(etatFinal);
	}

	@Override
	public List<Patient> getAllPatientByEtatAndSexe(boolean etatFinal, String sexe) {
		return this.diagnosticRepo.getPatientByEtatAndSexe(etatFinal, sexe);
	}

	@Override
	public List<Patient> getAllPatientByEtatAndVille(boolean etatFinal, String ville) {
		return this.diagnosticRepo.getPatientByEtatAndVille(etatFinal, ville);
	}

	@Override
	public List<Patient> getAllPatientByEtatAndSexeAndVille(boolean etatFinal, String sexe, String ville) {
		return this.diagnosticRepo.getPatientByEtatAndSexeAndVille(etatFinal, sexe, ville);
	}
}
