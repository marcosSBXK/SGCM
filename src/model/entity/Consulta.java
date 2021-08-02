package model.entity;

public class Consulta {
	private int idConsulta;
	private double valorConsulta;
	private String especialidade;
	
	public Consulta() {
		this.idConsulta = 0;
		this.valorConsulta = 0;
		this.especialidade = "";
	}
	
	public Consulta(double valorConsulta, String especialidade) {
		this.valorConsulta = valorConsulta;
		this.especialidade = especialidade;
	}
	
	public Consulta(int idConsulta, double valorConsulta, String especialidade) {
		this.idConsulta = idConsulta;
		this.valorConsulta = valorConsulta;
		this.especialidade = especialidade;
	}
	
	public Consulta(Consulta consulta) {
		this.idConsulta = consulta.idConsulta;
		this.valorConsulta = consulta.valorConsulta;
		this.especialidade = consulta.especialidade;
	}

	public int getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}