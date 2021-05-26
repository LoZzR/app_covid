package com.covid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Room {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_ROOM")
	private Integer idRoom;
	
	@Column(name = "TYPE")
	private String type;

	@Column(name = "ETAT")
	private String etat;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_HOPITAL")
	private Hopital hopital;
	
	public Room() {
		
	}

	public Room(String type, String etat) {
		this.type = type;
		this.etat = etat;
	}

	public Integer getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(Integer idRoom) {
		this.idRoom = idRoom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Hopital getHopital() {
		return hopital;
	}

	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}

	@Override
	public String toString() {
		return "Room [idRoom=" + idRoom + ", type=" + type + ", etat=" + etat + "]";
	}
	
}
