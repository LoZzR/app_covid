package com.covid;

import java.time.LocalDate;
import java.time.Month;

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
	
		
		System.out.println("############################################ FIN ############################################");
	}
}
