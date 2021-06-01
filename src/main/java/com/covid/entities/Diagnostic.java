package com.covid.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Diagnostic {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_DIAGNOSTIC")
	private Integer idDiagnostic;
	
	@Column(name = "DATE_CONTAMINATION")
	private LocalDate dateContamination;
	
	@Column(name = "DATE_DIAGNOSTIC")
	private LocalDate dateDiagnostic;
	
	@Column(name = "DATE_CLOTURE")
	private LocalDate dateCloture;
	
	@Column(name = "ETAT_FINAL")
	private boolean etatFinal;
	
	@JsonIgnore
	@OneToMany
	@JoinColumn(name="ID_DIAGNOSTIC")
	private List<Posologie> posoligies;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="ID_PATIENT")
	private Patient patient;
	
	@JsonIgnore
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="diagnostic_symptome", joinColumns=@JoinColumn(name="ID_DIAGNOSTIC"), inverseJoinColumns=@JoinColumn(name="ID_SYMPTOME"))
	private List<Symptome> symptomes;
	
	public Diagnostic() {
		
	}

	public Diagnostic(LocalDate dateContamination, LocalDate dateDiagnostic, LocalDate dateCloture, boolean etatFinal) {
		this.dateContamination = dateContamination;
		this.dateDiagnostic = dateDiagnostic;
		this.dateCloture = dateCloture;
		this.etatFinal = etatFinal;
	}

	public Integer getIdDiagnostic() {
		return idDiagnostic;
	}

	public void setIdDiagnostic(Integer idDiagnostic) {
		this.idDiagnostic = idDiagnostic;
	}

	public LocalDate getDateContamination() {
		return dateContamination;
	}

	public void setDateContamination(LocalDate dateContamination) {
		this.dateContamination = dateContamination;
	}

	public LocalDate getDateDiagnostic() {
		return dateDiagnostic;
	}

	public void setDateDiagnostic(LocalDate dateDiagnostic) {
		this.dateDiagnostic = dateDiagnostic;
	}

	public LocalDate getDateCloture() {
		return dateCloture;
	}

	public void setDateCloture(LocalDate dateCloture) {
		this.dateCloture = dateCloture;
	}

	public boolean isEtatFinal() {
		return etatFinal;
	}

	public void setEtatFinal(boolean etatFinal) {
		this.etatFinal = etatFinal;
	}

	public List<Posologie> getPosoligies() {
		return posoligies;
	}

	public void setPosoligies(List<Posologie> posoligies) {
		this.posoligies = posoligies;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public List<Symptome> getSymptomes() {
		return symptomes;
	}

	public void setSymptomes(List<Symptome> symptomes) {
		this.symptomes = symptomes;
	}

	@Override
	public String toString() {
		return "Diagnostic [idDiagnostic=" + idDiagnostic + ", dateContamination=" + dateContamination
				+ ", dateDiagnostic=" + dateDiagnostic + ", dateCloture=" + dateCloture + ", etatFinal=" + etatFinal
				+ "]";
	}
	
}
