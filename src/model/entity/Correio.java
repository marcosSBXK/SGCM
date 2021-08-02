package model.entity;

public class Correio {
	private String tipo;
	private String dataEnvio;
	private String dataRecebimento;
	
	public Correio(String tipo, String dataEnvio, String dataRecebimento) {
		this.tipo = tipo;
		this.dataEnvio = dataEnvio;
		this.dataRecebimento = dataRecebimento;
	}

	public Correio(Correio correio) {
		this.tipo = correio.tipo;
		this.dataEnvio = correio.dataEnvio;
		this.dataRecebimento = correio.dataRecebimento;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(String dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	public String getDataRecebimento() {
		return dataRecebimento;
	}
	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
}