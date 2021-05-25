package com.covid.entities;

import java.time.LocalDate;

public class SejourHospitalier {

	private Integer idSejour;
	private LocalDate debutSejour;
	private LocalDate finSejour;
	
	public SejourHospitalier() {
		
	}

	public SejourHospitalier(LocalDate debutSejour, LocalDate finSejour) {
		super();
		this.debutSejour = debutSejour;
		this.finSejour = finSejour;
	}

	public Integer getIdSejour() {
		return idSejour;
	}

	public void setIdSejour(Integer idSejour) {
		this.idSejour = idSejour;
	}

	public LocalDate getDebutSejour() {
		return debutSejour;
	}

	public void setDebutSejour(LocalDate debutSejour) {
		this.debutSejour = debutSejour;
	}

	public LocalDate getFinSejour() {
		return finSejour;
	}

	public void setFinSejour(LocalDate finSejour) {
		this.finSejour = finSejour;
	}

	@Override
	public String toString() {
		return "SejourHospitalier [idSejour=" + idSejour + ", debutSejour=" + debutSejour + ", finSejour=" + finSejour
				+ "]";
	}
	
}
