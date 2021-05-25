package com.covid.entities;

public class Symptome {

	private Integer idSymptome;
	private String descriptionSympome;
	
	public Symptome() {
		
	}

	public Symptome(String descriptionSympome) {
		super();
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
