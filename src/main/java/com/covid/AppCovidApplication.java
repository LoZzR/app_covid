package com.covid;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.covid.entities.Diagnostic;
import com.covid.entities.Hopital;
import com.covid.entities.Patient;
import com.covid.entities.Room;
import com.covid.entities.SejourHospitalier;
import com.covid.services.HopitalService;

@SpringBootApplication
public class AppCovidApplication {

	@Autowired
	private HopitalService hopitalService;
	public static void main(String[] args) {
		SpringApplication.run(AppCovidApplication.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("############################################ DEBUT ############################################");
	
		List<Patient> menPatients = this.hopitalService.getAllPatientBySexe("M");
		List<Patient> womenPatients = this.hopitalService.getAllPatientBySexe("F");
		List<Patient> patients = this.hopitalService.getAllPatient();
		
		int menPourCent = menPatients.size()/patients.size() * 100;
		int womenPourCent = womenPatients.size()/patients.size() * 100;
		
		System.out.println("##########################################Pourcentage des hommes : ################" + menPourCent);
		
		System.out.println("##########################################Pourcentage des femmes : ################" + womenPourCent);
		
		System.out.println("############################################ FIN ############################################");
	}
}
