package model.entity;

public class Recepcionista {
	private int idRecepcionista;
	private String nomeRecepcionista;
	private String senhaRecepcionista;
	private static int id = 1;
	
	public Recepcionista() {
		this.idRecepcionista = 0;
		this.nomeRecepcionista = "";
		this.senhaRecepcionista = "";
	}
	
	public Recepcionista(String nomeRecepcionista, String senhaRecepcionista) {
		this.idRecepcionista = id;
		this.nomeRecepcionista = nomeRecepcionista;
		this.senhaRecepcionista = senhaRecepcionista;
		id++;
	}
	
	public Recepcionista(int idRecepcionista, String nomeRecepcionista, String senhaRecep) {
		this.idRecepcionista = idRecepcionista;
		this.nomeRecepcionista = nomeRecepcionista;
		this.senhaRecepcionista = senhaRecep;
	}
	
	public Recepcionista(Recepcionista recepcionista) {
		this.idRecepcionista = recepcionista.idRecepcionista;
		this.nomeRecepcionista = recepcionista.nomeRecepcionista;
		this.senhaRecepcionista = recepcionista.senhaRecepcionista;
	}
	
	public int getIdRecepcionista() {
		return idRecepcionista;
	}
	public void setIdRecepcionista(int idRecepcionista) {
		this.idRecepcionista = idRecepcionista;
	}
	public String getNomeRecepcionista() {
		return nomeRecepcionista;
	}
	public void setNomeRecepcionista(String nomeRecepcionista) {
		this.nomeRecepcionista = nomeRecepcionista;
	}
	public String getSenhaRecepcionista() {
		return senhaRecepcionista;
	}
	public void setSenhaRecepcionista(String senhaRecepcionista) {
		this.senhaRecepcionista = senhaRecepcionista;
	}
}