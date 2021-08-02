package model.entity;

public class Seguros {
	private String tipo;
	private String data;
	private String validade;
	private String preco;
	private boolean status;
	
	public Seguros(String idSeguros, String tipo, String data, String validade, String preco, boolean status) {
		this.tipo = tipo;
		this.data = data;
		this.validade = validade;
		this.preco = preco;
		this.status = status;
	}

	public Seguros(Seguros seguros) {
		this.tipo = seguros.tipo;
		this.data = seguros.data;
		this.validade = seguros.validade;
		this.preco = seguros.preco;
		this.status = seguros.status;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}