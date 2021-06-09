package com.covid.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.entities.Hopital;
import com.covid.entities.Room;
import com.covid.entities.SejourHospitalier;
import com.covid.repositories.HopitalRepository;
import com.covid.repositories.RoomRepository;
import com.covid.repositories.SejourHospitalierRepository;
import com.covid.services.dto.SejourDTO;

@Service
public class HopitalServiceImpl implements HopitalService{

	@Autowired
	private HopitalRepository hopitalRepo;

	@Autowired
	private RoomRepository roomRepo;
	
	@Autowired
	private SejourHospitalierRepository sejourHospitalierRepo;
	
	
	@Override
	public Hopital addHopital(Hopital hopital) {
		return this.hopitalRepo.save(hopital);
	}

	@Override
	public Room addRoom(Room room) {
		return this.roomRepo.save(room);
	}

	@Override
	public SejourHospitalier addSejourHospitalier(SejourHospitalier sejourHospitalier) {
		return this.sejourHospitalierRepo.save(sejourHospitalier);
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
	public void deleteSejourHospitalier(SejourHospitalier sejourHospitalier) {
		this.sejourHospitalierRepo.delete(sejourHospitalier);
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
	public List<SejourDTO> getAllSejourHospitalier() {
		List<SejourDTO> sejours = new ArrayList<>();
		this.sejourHospitalierRepo.findAll().stream().forEach(s->sejours.add(new SejourDTO(1, 
				s.getDiagnostic().getPatient().getPrenom(), 
				s.getDiagnostic().getPatient().getNom(),
				s.getDiagnostic().getPatient().getCin(), 
				s.getRoom().getHopital().getNomHopital(), 
				s.getRoom().getIdRoom(), 
				s.getDebutSejour(), 
				s.getFinSejour())));
		return sejours;
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
	public SejourHospitalier getSejourHospitalier(Integer id) {
		return this.sejourHospitalierRepo.findById(id).orElseThrow(()->new RuntimeException("SejourHospitalier not found with id "+ id));
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
	public List<SejourHospitalier> getSejourByNameHopitalAndVille(String nomHopital, String ville) {
		return this.sejourHospitalierRepo.getSejourByNameHopital(nomHopital,ville);
	}

	@Override
	public List<Hopital> findHopitalByVille(String nameHopital) {
		return this.hopitalRepo.getHopitalByName(nameHopital);
	}

}
