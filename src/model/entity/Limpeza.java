package model.entity;

public class Limpeza {
	private String banheiros;
	private String quartos;
	private String corredores;
	private String recepcao;
	private String externo;
	private String escritorio;
	
	public Limpeza(String banheiros, String quartos, String corredores, String recepcao,
			String externo, String escritorio) {
		this.banheiros = banheiros;
		this.quartos = quartos;
		this.corredores = corredores;
		this.recepcao = recepcao;
		this.externo = externo;
		this.escritorio = escritorio;
	}

	public Limpeza(Limpeza limpeza) {
		this.banheiros = limpeza.banheiros;
		this.quartos = limpeza.quartos;
		this.corredores = limpeza.corredores;
		this.recepcao = limpeza.recepcao;
		this.externo = limpeza.externo;
		this.escritorio = limpeza.escritorio;
	}
	
	public String getBanheiros() {
		return banheiros;
	}
	public void setBanheiros(String banheiros) {
		this.banheiros = banheiros;
	}
	public String getQuartos() {
		return quartos;
	}
	public void setQuartos(String quartos) {
		this.quartos = quartos;
	}
	public String getCorredores() {
		return corredores;
	}
	public void setCorredores(String corredores) {
		this.corredores = corredores;
	}
	public String getRecepcao() {
		return recepcao;
	}
	public void setRecepcao(String recepcao) {
		this.recepcao = recepcao;
	}
	public String getExterno() {
		return externo;
	}
	public void setExterno(String externo) {
		this.externo = externo;
	}
	public String getEscritorio() {
		return escritorio;
	}
	public void setEscritorio(String escritorio) {
		this.escritorio = escritorio;
	}
}