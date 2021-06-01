package com.covid.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.entities.SejourHospitalier;
import com.covid.services.HopitalService;

@RestController
@RequestMapping("/api/hopitals")
public class HopitalController {

	@Autowired
	private HopitalService hopitalService;
	
	@GetMapping("/sejour")
	public List<SejourHospitalier> getAllSejour(){
		return this.hopitalService.getAllSejourHospitalier();
	}
}
