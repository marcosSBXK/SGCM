package model.entity;

public class Consumo {
	private String agua;
	private String energia;
	private String data;
	
	public Consumo(String agua, String energia, String data) {
		this.agua = agua;
		this.energia = energia;
		this.data = data;
	}
	
	public Consumo(Consumo consumo) {
		this.agua = consumo.agua;
		this.energia = consumo.energia;
		this.data = consumo.data;
	}
	
	public String getAgua() {
		return agua;
	}
	public void setAgua(String agua) {
		this.agua = agua;
	}
	public String getEnergia() {
		return energia;
	}
	public void setEnergia(String energia) {
		this.energia = energia;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}