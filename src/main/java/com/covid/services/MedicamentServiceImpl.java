package com.covid.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.covid.entities.Medicament;
import com.covid.entities.Posologie;
import com.covid.entities.Symptome;
import com.covid.repositories.MedicamentRepository;
import com.covid.repositories.PosologieRepository;
import com.covid.repositories.SymptomeRepository;

public class MedicamentServiceImpl implements MedicamentService{

	@Autowired
	private PosologieRepository posologieRepo;
	
	@Autowired
	private SymptomeRepository symptomeRepo;
	
	@Autowired
	private MedicamentRepository medicamentRepo;

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
	
}
