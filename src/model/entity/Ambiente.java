package model.entity;

public class Ambiente {
	private String local;
	private String condicoes;
	private String condicoesEquip;
	
	public Ambiente(String local, String condicoes, String condicoesEquip) {
		this.local = local;
		this.condicoes = condicoes;
		this.condicoesEquip = condicoesEquip;
	}
	
	public Ambiente(Ambiente ambiente) {
		this.local = ambiente.local;
		this.condicoes = ambiente.condicoes;
		this.condicoesEquip = ambiente.condicoesEquip;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getCondicoes() {
		return condicoes;
	}
	public void setCondicoes(String condicoes) {
		this.condicoes = condicoes;
	}
	public String getCondicoesEquip() {
		return condicoesEquip;
	}
	public void setCondicosEquip(String condicoesEquip) {
		this.condicoesEquip = condicoesEquip;
	}
}