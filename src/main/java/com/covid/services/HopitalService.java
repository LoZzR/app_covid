package com.covid.services;

import java.util.List;

import com.covid.entities.Diagnostic;
import com.covid.entities.Hopital;
import com.covid.entities.Medicament;
import com.covid.entities.Patient;
import com.covid.entities.Posologie;
import com.covid.entities.Room;
import com.covid.entities.SejourHospitalier;
import com.covid.entities.Symptome;

public interface HopitalService {

	//Add/Modify methods
	public Hopital addHopital(Hopital hopital);
	public Room addRoom(Room rom);
	public Patient addPatient(Patient patient);
	public Diagnostic addDiagnostic(Diagnostic diagnostic);
	public SejourHospitalier addSejourHospitalier(SejourHospitalier sejourHospitalier);
	public Medicament addMedicament(Medicament medicament);
	public Posologie addPosologie(Posologie posologie);
	public Symptome addSymptome(Symptome symptome);
	
	//Delete methods
	public void deleteHopital(Hopital hopital);
	public void deleteRoom(Room rom);
	public void deletePatient(Patient patient);
	public void deleteDiagnostic(Diagnostic diagnostic);
	public void deleteSejourHospitalier(SejourHospitalier sejourHospitalier);
	public void deleteMedicament(Medicament medicament);
	public void deletePosologie(Posologie posologie);
	public void deleteSymptome(Symptome symptome);
	
	//findAll methods
	public List<Hopital> getAllHopital();
	public List<Room> getAllRoom();
	public List<Patient> getAllPatient();
	public List<Diagnostic> getAllDiagnostic();
	public List<SejourHospitalier> getAllSejourHospitalier();
	public List<Medicament> getAllMedicament();
	public List<Posologie> getAllPosologie();
	public List<Symptome> getAllSymptome();
	
	//findById methods
	public Hopital getHopital(Integer id);
	public Room getRoom(Integer id);
	public Patient getPatient(Integer id);
	public Diagnostic getDiagnostic(Integer id);
	public SejourHospitalier getSejourHospitalier(Integer id);
	public Medicament getMedicament(Integer id);
	public Posologie getPosologie(Integer id);
	public Symptome getSymptome(Integer id);
	
	//Method utils
	public List<SejourHospitalier> getSejourByVille(String ville);
	public List<SejourHospitalier> getSejourByNameHopital(String nomHopital);
	public List <Hopital> findHopitalByVille(String nameHopital);
	public List<Patient> getAllPatientBySexe(String sexe);
	public List<Patient> getAllPatientByVille(String ville);
	public List<Patient> getAllPatientBySexeAndVille(String sexe, String ville);
	public List<Patient> getAllPatientByEtatFinal(boolean etatFinal);
	public List<Patient> getAllPatientByEtatAndSexe(boolean etatFinal, String sexe);
	public List<Patient> getAllPatientByEtatAndVille(boolean etatFinal, String ville);
	public List<Patient> getAllPatientByEtatAndSexeAndVille(boolean etatFinal, String sexe, String ville);
}
