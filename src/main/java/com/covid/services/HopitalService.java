package com.covid.services;

import java.util.List;

import com.covid.entities.Hopital;
import com.covid.entities.Room;
import com.covid.entities.SejourHospitalier;
import com.covid.services.dto.SejourDTO;

public interface HopitalService {

	public Hopital addHopital(Hopital hopital);
	public Room addRoom(Room rom);
	public SejourHospitalier addSejourHospitalier(SejourHospitalier sejourHospitalier);
	
	public void deleteHopital(Hopital hopital);
	public void deleteRoom(Room rom);
	public void deleteSejourHospitalier(SejourHospitalier sejourHospitalier);
	
	public List<Hopital> getAllHopital();
	public List<Room> getAllRoom();
	public List<SejourDTO> getAllSejourHospitalier();
	public List<SejourDTO> getSejourByNameHopitalAndVille(String nomHopital, String ville);
	
	public Hopital getHopital(Integer id);
	public Room getRoom(Integer id);
	public SejourHospitalier getSejourHospitalier(Integer id);
	
	public List<SejourDTO> getSejourByVille(String ville);
	public List<SejourDTO> getSejourByNameHopital(String nomHopital);
	public List <Hopital> findHopitalByVille(String nameHopital);
}
