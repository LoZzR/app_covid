package com.covid.entities;

public class Room {

	private Integer idRoom;
	private String type;
	private String etat;
	
	public Room() {
		
	}

	public Room(String type, String etat) {
		super();
		this.type = type;
		this.etat = etat;
	}

	public Room(Integer idRoom, String type, String etat) {
		super();
		this.idRoom = idRoom;
		this.type = type;
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Room [idRoom=" + idRoom + ", type=" + type + ", etat=" + etat + "]";
	}
	
}
