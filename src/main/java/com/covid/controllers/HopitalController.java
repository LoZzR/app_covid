package com.covid.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
		throw new RuntimeException("Not Yet implemented !");
	}
}
