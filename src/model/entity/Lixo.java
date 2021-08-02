package model.entity;

public class Lixo {
	private String dia;
	private String descarte;
	private String reciclavel;
	
	public Lixo(String dia, String descarte, String reciclavel) {
		this.dia = dia;
		this.descarte = descarte;
		this.reciclavel = reciclavel;
	}
	
	public Lixo(Lixo lixo) {
		this.dia = lixo.dia;
		this.descarte = lixo.descarte;
		this.reciclavel = lixo.reciclavel;
	}
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getDescarte() {
		return descarte;
	}
	public void setDescarte(String descarte) {
		this.descarte = descarte;
	}
	public String getReciclavel() {
		return reciclavel;
	}
	public void setReciclavel(String reciclavel) {
		this.reciclavel = reciclavel;
	}
}