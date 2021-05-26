package com.covid.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_PATIENT")
	private Integer idPatient;
	
	@Column(name = "CIN")
	private String cin;
	
	@Column(name = "DATE_NAISSANCE")
	private LocalDate dateNaissance;
	
	@Column(name = "NOM")
	private String nom;
	
	@Column(name = "PRENOM")
	private String prenom;
	
	@Column(name = "TEL")
	private String tel;
	
	@Column(name = "ADRESSE")
	private String adresse;
	
	@OneToMany(mappedBy = "patient", fetch=FetchType.LAZY)
	private List<Diagnostic> diagnostics;
	
	public Patient() {
		
	}

	public Patient(String cin, LocalDate dateNaissance, String nom, String prenom, String tel,
			String adresse) {
		this.cin = cin;
		this.dateNaissance = dateNaissance;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
	}

	public Integer getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(Integer idPatient) {
		this.idPatient = idPatient;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Diagnostic> getDiagnostics() {
		return diagnostics;
	}

	public void setDiagnostics(List<Diagnostic> diagnostics) {
		this.diagnostics = diagnostics;
	}

	@Override
	public String toString() {
		return "Patient [idPatient=" + idPatient + ", cin=" + cin + ", dateNaissance=" + dateNaissance + ", nom=" + nom
				+ ", prenom=" + prenom + ", tel=" + tel + ", adresse=" + adresse + "]";
	}
	
}
