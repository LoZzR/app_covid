package com.covid.services;

import java.util.List;

import com.covid.entities.Medicament;
import com.covid.entities.Posologie;
import com.covid.entities.Symptome;

public interface MedicamentService {

	public Medicament addMedicament(Medicament medicament);
	public Posologie addPosologie(Posologie posologie);
	public Symptome addSymptome(Symptome symptome);
	public void deleteMedicament(Medicament medicament);
	public void deletePosologie(Posologie posologie);
	public void deleteSymptome(Symptome symptome);
	public List<Medicament> getAllMedicament();
	public List<Posologie> getAllPosologie();
	public List<Symptome> getAllSymptome();
	public Medicament getMedicament(Integer id);
	public Posologie getPosologie(Integer id);
	public Symptome getSymptome(Integer id);
}
