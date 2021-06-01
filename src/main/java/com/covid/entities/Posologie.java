package com.covid.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Posologie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_POSOLOGIE")
	private Integer idPosologie;
	
	@Column(name = "DATE_DEBUT")
	private LocalDate dateDebut;
	
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	
	@Column(name = "NBR_PRISE_JOUR")
	private Integer nbrPriseJour;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_MEDOC")
	private Medicament medicament;
	
	public Posologie() {
		
	}

	public Posologie(LocalDate dateDebut, LocalDate dateFin, Integer nbrPriseJour) {
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

	public Medicament getMedicament() {
		return medicament;
	}

	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}

	@Override
	public String toString() {
		return "Posologie [idPosologie=" + idPosologie + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", nbrPriseJour=" + nbrPriseJour + "]";
	}
	
}
