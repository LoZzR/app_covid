package com.covid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Symptome {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_SYMPTOME")
	private Integer idSymptome;
	
	@Column(name = "DESCRIPTION_SYMPTOME")
	private String descriptionSympome;
	
	public Symptome() {
		
	}

	public Symptome(String descriptionSympome) {
		this.descriptionSympome = descriptionSympome;
	}

	public Integer getIdSymptome() {
		return idSymptome;
	}

	public void setIdSymptome(Integer idSymptome) {
		this.idSymptome = idSymptome;
	}

	public String getDescriptionSympome() {
		return descriptionSympome;
	}

	public void setDescriptionSympome(String descriptionSympome) {
		this.descriptionSympome = descriptionSympome;
	}

	@Override
	public String toString() {
		return "Symptome [idSymptome=" + idSymptome + ", descriptionSympome=" + descriptionSympome + "]";
	}
	
}
