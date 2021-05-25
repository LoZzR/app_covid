package com.covid.entities;

import java.time.LocalDate;

public class Patient {

	private Integer idPatient;
	private String cin;
	private LocalDate dateNaissance;
	private String nom;
	private String prenom;
	private String tel;
	private String adresse;
	
	public Patient() {
		
	}

	public Patient(Integer idPatient, String cin, LocalDate dateNaissance, String nom, String prenom, String tel,
			String adresse) {
		super();
		this.idPatient = idPatient;
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

	@Override
	public String toString() {
		return "Patient [idPatient=" + idPatient + ", cin=" + cin + ", dateNaissance=" + dateNaissance + ", nom=" + nom
				+ ", prenom=" + prenom + ", tel=" + tel + ", adresse=" + adresse + "]";
	}
	
}
