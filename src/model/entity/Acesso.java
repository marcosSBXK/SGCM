package model.entity;

public class Acesso {
	private String data;
	private String RG;
	private String nome;
	private boolean status;
	
	public Acesso(String data, String rG, String nome, boolean status) {
		this.data = data;
		this.RG = rG;
		this.nome = nome;
		this.status = status;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}