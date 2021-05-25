package com.covid.entities;

public class Hopital {

	private Integer idHopital;
	private String nomHopital;
	private String ville;
	
	public Hopital() {
		
	}

	public Hopital(String nomHopital, String ville) {
		super();
		this.nomHopital = nomHopital;
		this.ville = ville;
	}

	public Integer getIdHopital() {
		return idHopital;
	}

	public void setIdHopital(Integer idHopital) {
		this.idHopital = idHopital;
	}

	public String getNomHopital() {
		return nomHopital;
	}

	public void setNomHopital(String nomHopital) {
		this.nomHopital = nomHopital;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Hopital [idHopital=" + idHopital + ", nomHopital=" + nomHopital + ", ville=" + ville + "]";
	}
	
}
