package com.covid.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Hopital {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_HOPITAL")
	private Integer idHopital;
	
	@Column(name = "NOM_HOPITAL")
	private String nomHopital;
	
	@Column(name = "VILLE")
	private String ville;
	
	@JsonIgnore
	@OneToMany(mappedBy = "hopital", fetch=FetchType.LAZY)
	private List<Room> rooms;
	
	public Hopital() {
		
	}

	public Hopital(String nomHopital, String ville) {
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

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Hopital [idHopital=" + idHopital + ", nomHopital=" + nomHopital + ", ville=" + ville + "]";
	}
	
}
