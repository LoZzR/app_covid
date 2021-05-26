package com.covid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicament {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_MEDOC")
	private Integer idMedoc;
	
	@Column(name = "DESCRIPTION_MEDOC")
	private String descriptionMedoc;
	
	public Medicament() {
		
	}

	public Medicament(String descriptionMedoc) {
		this.descriptionMedoc = descriptionMedoc;
	}

	public Integer getIdMedoc() {
		return idMedoc;
	}

	public void setIdMedoc(Integer idMedoc) {
		this.idMedoc = idMedoc;
	}

	public String getDescriptionMedoc() {
		return descriptionMedoc;
	}

	public void setDescriptionMedoc(String descriptionMedoc) {
		this.descriptionMedoc = descriptionMedoc;
	}

	@Override
	public String toString() {
		return "Medicament [idMedoc=" + idMedoc + ", descriptionMedoc=" + descriptionMedoc + "]";
	}

}
