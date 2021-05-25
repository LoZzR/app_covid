package com.covid.entities;

import java.time.LocalDate;

public class Posologie {

	private Integer idPosologie;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private Integer nbrPriseJour;
	
	public Posologie() {
		
	}

	public Posologie(LocalDate dateDebut, LocalDate dateFin, Integer nbrPriseJour) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nbrPriseJour = nbrPriseJour;
	}

	public Integer getIdPosologie() {
		return idPosologie;
	}

	public void setIdPosologie(Integer idPosologie) {
		this.idPosologie = idPosologie;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public Integer getNbrPriseJour() {
		return nbrPriseJour;
	}

	public void setNbrPriseJour(Integer nbrPriseJour) {
		this.nbrPriseJour = nbrPriseJour;
	}

	@Override
	public String toString() {
		return "Posologie [idPosologie=" + idPosologie + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", nbrPriseJour=" + nbrPriseJour + "]";
	}
	
}
