package model.entity;

public class Agenda {
	private int idA;
	private String tipo;
	private int codPaciente;
	private int idNota;
	
	public Agenda() {
		this.idA = 0;
		this.tipo = "";
		this.codPaciente = 0;
		this.idNota = 0;
	}

	public Agenda(String tipo, int codPaciente, int idNota) {
		this.tipo = tipo;
		this.codPaciente = codPaciente;
		this.idNota = idNota;
	}
	
	public Agenda(int idA, String tipo, int codPaciente, int idNota) {
		this.idA = idA;
		this.tipo = tipo;
		this.codPaciente = codPaciente;
		this.idNota = idNota;
	}
	
	public Agenda(Agenda agenda) {
		this.idA = agenda.idA;
		this.tipo = agenda.tipo;
		this.codPaciente = agenda.codPaciente;
		this.idNota = agenda.idNota;
	}

	public int getIdA() {
		return idA;
	}
	public void setIdA(int idA) {
		this.idA = idA;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCodPaciente() {
		return codPaciente;
	}
	public void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
	}
	public int getIdNota() {
		return idNota;
	}
	public void setIdNota(int idNota) {
		this.idNota = idNota;
	}
}