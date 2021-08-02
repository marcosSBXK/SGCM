package model.entity;

public class Prevencao_incendio {
	private String extintorInmetro;
	private int qtdExtintores;
	private String validade;
	private String inspecao;
	private boolean status;
	
	public Prevencao_incendio(String idIncendios, String extintorInmetro, int qtdExtintores, String validade,
			String inspecao, boolean status) {
		this.extintorInmetro = extintorInmetro;
		this.qtdExtintores = qtdExtintores;
		this.validade = validade;
		this.inspecao = inspecao;
		this.status = status;
	}
	
	public Prevencao_incendio(Prevencao_incendio prevencao_incendio) {
		this.extintorInmetro = prevencao_incendio.extintorInmetro;
		this.qtdExtintores = prevencao_incendio.qtdExtintores;
		this.validade = prevencao_incendio.validade;
		this.inspecao = prevencao_incendio.inspecao;
		this.status = prevencao_incendio.status;
	}
	
	public String getExtintorInmetro() {
		return extintorInmetro;
	}
	public void setExtintorInmetro(String extintorInmetro) {
		this.extintorInmetro = extintorInmetro;
	}
	public int getQtdExtintores() {
		return qtdExtintores;
	}
	public void setQtdExtintores(int qtdExtintores) {
		this.qtdExtintores = qtdExtintores;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getInspecao() {
		return inspecao;
	}
	public void setInspecao(String inspecao) {
		this.inspecao = inspecao;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}