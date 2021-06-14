package com.covid.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.entities.Patient;
import com.covid.services.PatientService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/patients")
public class PatientHopital {

	@Autowired
	private PatientService patientService;
	
	@GetMapping("")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public List<Patient> getAllPatient(){
		return this.patientService.getAllPatient();
	}
	@PostMapping("")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public Patient addPatient(@RequestBody Patient patient) {
		return this.patientService.addPatient(patient);
	}
}
