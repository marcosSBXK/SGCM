package model.entity;

public class Manutencao {
	private int idManutencao;
	private String elevador;
	private String data;
	private String validade;
	private static int id = 1;
	
	public Manutencao(String elevador, String data, String validade) {
		this.idManutencao = id;
		this.elevador = elevador;
		this.data = data;
		this.validade = validade;
		id++;
	}
	
	public Manutencao(Manutencao manutencao) {
		this.idManutencao = manutencao.idManutencao;
		this.elevador = manutencao.elevador;
		this.data = manutencao.data;
		this.validade = manutencao.validade;
	}
	
	public int getIdManutencao() {
		return idManutencao;
	}
	public void setIdManutencao(int idManutencao) {
		this.idManutencao = idManutencao;
	}
	public String getElevador() {
		return elevador;
	}
	public void setElevador(String elevador) {
		this.elevador = elevador;
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
}