package com.covid.entities;

public class Medicament {
	
	private Integer idMedoc;
	private String descriptionMedoc;
	
	public Medicament() {
		
	}

	public Medicament(String descriptionMedoc) {
		super();
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
