package com.covid.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.entities.Diagnostic;
import com.covid.entities.Hopital;
import com.covid.entities.Medicament;
import com.covid.entities.Patient;
import com.covid.entities.Posologie;
import com.covid.entities.Room;
import com.covid.entities.SejourHospitalier;
import com.covid.entities.Symptome;
import com.covid.repositories.DiagnosticRepository;
import com.covid.repositories.HopitalRepository;
import com.covid.repositories.MedicamentRepository;
import com.covid.repositories.PatientRepository;
import com.covid.repositories.PosologieRepository;
import com.covid.repositories.RoomRepository;
import com.covid.repositories.SejourHospitalierRepository;
import com.covid.repositories.SymptomeRepository;

@Service
public class HopitalServiceImpl implements HopitalService{

	@Autowired
	private HopitalRepository hopitalRepo;

	@Autowired
	private RoomRepository roomRepo;

	@Autowired
	private PatientRepository patientRepo;
	
	@Autowired
	private DiagnosticRepository diagnosticRepo;
	
	@Autowired
	private SejourHospitalierRepository sejourHospitalierRepo;
	
	@Autowired
	private PosologieRepository posologieRepo;
	
	@Autowired
	private SymptomeRepository symptomeRepo;
	
	@Autowired
	private MedicamentRepository medicamentRepo;
	
	@Override
	public Hopital addHopital(Hopital hopital) {
		return this.hopitalRepo.save(hopital);
	}

	@Override
	public Room addRoom(Room room) {
		return this.roomRepo.save(room);
	}

	@Override
	public Patient addPatient(Patient patient) {
		return this.patientRepo.save(patient);
	}

	@Override
	public Diagnostic addDiagnostic(Diagnostic diagnostic) {
		return this.diagnosticRepo.save(diagnostic);
	}

	@Override
	public SejourHospitalier addSejourHospitalier(SejourHospitalier sejourHospitalier) {
		return this.sejourHospitalierRepo.save(sejourHospitalier);
	}

	@Override
	public Medicament addMedicament(Medicament medicament) {
		return this.medicamentRepo.save(medicament);
	}

	@Override
	public Posologie addPosologie(Posologie posologie) {
		return this.posologieRepo.save(posologie);
	}

	@Override
	public Symptome addSymptome(Symptome symptome) {
		return this.symptomeRepo.save(symptome);
	}

	@Override
	public void deleteHopital(Hopital hopital) {
		this.hopitalRepo.delete(hopital);
	}

	@Override
	public void deleteRoom(Room room) {
		this.roomRepo.delete(room);
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
	public void deleteSejourHospitalier(SejourHospitalier sejourHospitalier) {
		this.sejourHospitalierRepo.delete(sejourHospitalier);
	}

	@Override
	public void deleteMedicament(Medicament medicament) {
		this.medicamentRepo.delete(medicament);
	}

	@Override
	public void deletePosologie(Posologie posologie) {
		this.posologieRepo.delete(posologie);
	}

	@Override
	public void deleteSymptome(Symptome symptome) {
		this.symptomeRepo.delete(symptome);
	}

	@Override
	public List<Hopital> getAllHopital() {
		return this.hopitalRepo.findAll();
	}

	@Override
	public List<Room> getAllRoom() {
		return this.roomRepo.findAll();
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
	public List<SejourHospitalier> getAllSejourHospitalier() {
		return this.sejourHospitalierRepo.findAll();
	}

	@Override
	public List<Medicament> getAllMedicament() {
		return this.medicamentRepo.findAll();
	}

	@Override
	public List<Posologie> getAllPosologie() {
		return this.posologieRepo.findAll();
	}

	@Override
	public List<Symptome> getAllSymptome() {
		return this.symptomeRepo.findAll();
	}

	@Override
	public Hopital getHopital(Integer id) {
		return this.hopitalRepo.findById(id).orElseThrow(()->new RuntimeException("Hopital not found with id "+ id));
	}

	@Override
	public Room getRoom(Integer id) {
		return this.roomRepo.findById(id).orElseThrow(()->new RuntimeException("Room not found with id "+ id));
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
	public SejourHospitalier getSejourHospitalier(Integer id) {
		return this.sejourHospitalierRepo.findById(id).orElseThrow(()->new RuntimeException("SejourHospitalier not found with id "+ id));
	}

	@Override
	public Medicament getMedicament(Integer id) {
		return this.medicamentRepo.findById(id).orElseThrow(()->new RuntimeException("Medicament not found with id "+ id));
	}

	@Override
	public Posologie getPosologie(Integer id) {
		return this.posologieRepo.findById(id).orElseThrow(()->new RuntimeException("Posologie not found with id "+ id));
	}

	@Override
	public Symptome getSymptome(Integer id) {
		return this.symptomeRepo.findById(id).orElseThrow(()->new RuntimeException("Symptome not found with id "+ id));
	}

	@Override
	public List<SejourHospitalier> getSejourByVille(String ville) {
		return this.sejourHospitalierRepo.getSejourByVille(ville);
	}

	@Override
	public List<SejourHospitalier> getSejourByNameHopital(String nomHopital) {
		return this.sejourHospitalierRepo.getSejourByNameHopital(nomHopital);
	}

	@Override
	public List<Hopital> findHopitalByVille(String nameHopital) {
		return this.hopitalRepo.getHopitalByName(nameHopital);
	}

	@Override
	public List<Patient> getAllPatientBySexe(String sexe) {
		return this.patientRepo.getPatientBySexe(sexe);
	}

	@Override
	public List<Patient> getAllPatientByVille(String ville) {
		return this.patientRepo.getPatientByVille(ville);
	}

}
