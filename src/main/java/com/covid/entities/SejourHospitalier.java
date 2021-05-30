package com.covid.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class SejourHospitalier {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_SEJOUR")
	private Integer idSejour;

	@Column(name = "DEBUT_SEJOUR")
	private LocalDate debutSejour;

	@Column(name = "FIN_SEJOUR")
	private LocalDate finSejour;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="ID_ROOM")
	private Room room;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_DIAGNOSTIC")
    private Diagnostic diagnostic;
	
	public SejourHospitalier() {
		
	}

	public SejourHospitalier(LocalDate debutSejour, LocalDate finSejour) {
		super();
		this.debutSejour = debutSejour;
		this.finSejour = finSejour;
	}

	public Integer getIdSejour() {
		return idSejour;
	}

	public void setIdSejour(Integer idSejour) {
		this.idSejour = idSejour;
	}

	public LocalDate getDebutSejour() {
		return debutSejour;
	}

	public void setDebutSejour(LocalDate debutSejour) {
		this.debutSejour = debutSejour;
	}

	public LocalDate getFinSejour() {
		return finSejour;
	}

	public void setFinSejour(LocalDate finSejour) {
		this.finSejour = finSejour;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Diagnostic getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(Diagnostic diagnostic) {
		this.diagnostic = diagnostic;
	}

	@Override
	public String toString() {
		return "SejourHospitalier [idSejour=" + idSejour + ", debutSejour=" + debutSejour + ", finSejour=" + finSejour
				+ "]";
	}
	
}
