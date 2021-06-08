package com.covid.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covid.entities.SejourHospitalier;
import com.covid.services.HopitalService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/hopitals")
public class HopitalController {

	@Autowired
	private HopitalService hopitalService;
	
	@GetMapping("/sejours")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public List<SejourHospitalier> getAllSejour(@RequestParam(value = "nomHopital", required = false) String nomHopital,
			@RequestParam(value = "ville", required = false) String ville){
		
		if(nomHopital == null & ville == null) return this.hopitalService.getAllSejourHospitalier();
		else if(nomHopital == null) return this.hopitalService.getSejourByVille(ville);
		else if (ville == null) return this.hopitalService.getSejourByNameHopital(nomHopital);
		else return this.hopitalService.getSejourByNameHopitalAndVille(nomHopital,ville);
	}
}
