package com.covid.services.dto;

import java.time.LocalDate;

public class SejourDTO {

	private int idSejour;
	private String firstNamePatient;
	private String lastNamePatient;
	private String cin;
	private String hospitalName;
	private int roomNumbe;
	private LocalDate startSejour;
	private LocalDate endSejour;
	
	public SejourDTO(int idSejour, String firstNamePatient, String lastNamePatient, String cin, String hospitalName,
			int roomNumbe, LocalDate startSejour, LocalDate endSejour) {
		super();
		this.idSejour = idSejour;
		this.firstNamePatient = firstNamePatient;
		this.lastNamePatient = lastNamePatient;
		this.cin = cin;
		this.hospitalName = hospitalName;
		this.roomNumbe = roomNumbe;
		this.startSejour = startSejour;
		this.endSejour = endSejour;
	}

	public int getIdSejour() {
		return idSejour;
	}

	public void setIdSejour(int idSejour) {
		this.idSejour = idSejour;
	}

	public String getFirstNamePatient() {
		return firstNamePatient;
	}

	public void setFirstNamePatient(String firstNamePatient) {
		this.firstNamePatient = firstNamePatient;
	}

	public String getLastNamePatient() {
		return lastNamePatient;
	}

	public void setLastNamePatient(String lastNamePatient) {
		this.lastNamePatient = lastNamePatient;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public int getRoomNumbe() {
		return roomNumbe;
	}

	public void setRoomNumbe(int roomNumbe) {
		this.roomNumbe = roomNumbe;
	}

	public LocalDate getStartSejour() {
		return startSejour;
	}

	public void setStartSejour(LocalDate startSejour) {
		this.startSejour = startSejour;
	}

	public LocalDate getEndSejour() {
		return endSejour;
	}

	public void setEndSejour(LocalDate endSejour) {
		this.endSejour = endSejour;
	}
	
	
	
}
