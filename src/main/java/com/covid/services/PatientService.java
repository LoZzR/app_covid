package com.covid.services;

import java.util.List;

import com.covid.entities.Diagnostic;
import com.covid.entities.Patient;

public interface PatientService {

	public Patient addPatient(Patient patient);
	public Diagnostic addDiagnostic(Diagnostic diagnostic);
	public void deletePatient(Patient patient);
	public void deleteDiagnostic(Diagnostic diagnostic);
	public List<Patient> getAllPatient();
	public List<Diagnostic> getAllDiagnostic();
	public Patient getPatient(Integer id);
	public Diagnostic getDiagnostic(Integer id);
	public List<Patient> getAllPatientBySexe(String sexe);
	public List<Patient> getAllPatientByVille(String ville);
	public List<Patient> getAllPatientBySexeAndVille(String sexe, String ville);
	public List<Patient> getAllPatientByEtatFinal(boolean etatFinal);
	public List<Patient> getAllPatientByEtatAndSexe(boolean etatFinal, String sexe);
	public List<Patient> getAllPatientByEtatAndVille(boolean etatFinal, String ville);
	public List<Patient> getAllPatientByEtatAndSexeAndVille(boolean etatFinal, String sexe, String ville);
}
