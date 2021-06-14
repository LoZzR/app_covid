package com.covid.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covid.entities.Hopital;
import com.covid.entities.Room;
import com.covid.services.HopitalService;
import com.covid.services.dto.SejourDTO;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/hopitals")
public class HopitalController {

	@Autowired
	private HopitalService hopitalService;
	
	@GetMapping("/sejours")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public List<SejourDTO> getAllSejour(@RequestParam(value = "nomHopital", required = false) String nomHopital,
			@RequestParam(value = "ville", required = false) String ville){
		
		if(nomHopital == null & ville == null) return this.hopitalService.getAllSejourHospitalier();
		else if(nomHopital == null) return this.hopitalService.getSejourByVille(ville);
		else if (ville == null) return this.hopitalService.getSejourByNameHopital(nomHopital);
		else return this.hopitalService.getSejourByNameHopitalAndVille(nomHopital,ville);
	}
	
	@GetMapping("")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public List<Hopital> getAllHopitalByVille(@RequestParam(value = "ville", required = false) String ville){
		if(ville == null ) return this.hopitalService.getAllHopital();
		return this.hopitalService.getAllHopitalByVille(ville);
	}
	
	@GetMapping("/rooms")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public List<Room> getAllRoomByHopital(@RequestParam(value = "hopital", required = true) String hopital, @RequestParam(value = "ville", required = true) String ville){
		return this.hopitalService.getAllRoomByHopitalNameAndVille(hopital, ville);
	}
}
