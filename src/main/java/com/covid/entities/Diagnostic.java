package com.covid.entities;

import java.time.LocalDate;

public class Diagnostic {

	private Integer idDiagnostic;
	private LocalDate dateContamination;
	private LocalDate dateDiagnostic;
	private LocalDate dateCloture;
	private boolean etatFinal;
	
	public Diagnostic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Diagnostic(LocalDate dateContamination, LocalDate dateDiagnostic, LocalDate dateCloture, boolean etatFinal) {
		super();
		this.dateContamination = dateContamination;
		this.dateDiagnostic = dateDiagnostic;
		this.dateCloture = dateCloture;
		this.etatFinal = etatFinal;
	}

	public Integer getIdDiagnostic() {
		return idDiagnostic;
	}

	public void setIdDiagnostic(Integer idDiagnostic) {
		this.idDiagnostic = idDiagnostic;
	}

	public LocalDate getDateContamination() {
		return dateContamination;
	}

	public void setDateContamination(LocalDate dateContamination) {
		this.dateContamination = dateContamination;
	}

	public LocalDate getDateDiagnostic() {
		return dateDiagnostic;
	}

	public void setDateDiagnostic(LocalDate dateDiagnostic) {
		this.dateDiagnostic = dateDiagnostic;
	}

	public LocalDate getDateCloture() {
		return dateCloture;
	}

	public void setDateCloture(LocalDate dateCloture) {
		this.dateCloture = dateCloture;
	}

	public boolean isEtatFinal() {
		return etatFinal;
	}

	public void setEtatFinal(boolean etatFinal) {
		this.etatFinal = etatFinal;
	}

	@Override
	public String toString() {
		return "Diagnostic [idDiagnostic=" + idDiagnostic + ", dateContamination=" + dateContamination
				+ ", dateDiagnostic=" + dateDiagnostic + ", dateCloture=" + dateCloture + ", etatFinal=" + etatFinal
				+ "]";
	}
	
}
