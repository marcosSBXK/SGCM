package model.entity;

public class Exame {
	private int idExame;
	private String requisitos;
	private double valorExame;
	private String dataResultado;
	
	public Exame() {
		this.requisitos = "";
		this.valorExame = 0;
		this.dataResultado = "";
	}
	
	public Exame(int idExame, String requisitos, double valorExame, String dataResultado) {
		this.idExame = idExame;
		this.requisitos = requisitos;
		this.valorExame = valorExame;
		this.dataResultado = dataResultado;
	}
	
	public Exame(Exame exame) {
		this.idExame = exame.idExame;
		this.requisitos = exame.requisitos;
		this.valorExame = exame.valorExame;
		this.dataResultado = exame.dataResultado;
	}
	
	public int getIdExame() {
		return idExame;
	}
	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}
	public String getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	public double getValorExame() {
		return valorExame;
	}
	public void setValorExame(double valorExame) {
		this.valorExame = valorExame;
	}
	public String getDataResultado() {
		return dataResultado;
	}
	public void setDataResultado(String dataResultado) {
		this.dataResultado = dataResultado;
	}
}