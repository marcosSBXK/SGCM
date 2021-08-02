package model.entity;

public class Servico {
	private String tipo;
	private String descricao;
	private String crmMedico;
	private String especialidade;
	
	public Servico(String tipo, String descricao, String crmMedico, String especialidade) {
		this.tipo = tipo;
		this.descricao = descricao;
		this.crmMedico = crmMedico;
		this.especialidade = especialidade;
	}

	public Servico(Servico servico) {
		this.tipo = servico.tipo;
		this.descricao = servico.descricao;
		this.crmMedico = servico.crmMedico;
		this.especialidade = servico.especialidade;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCrmMedico() {
		return crmMedico;
	}
	public void setCrmMedico(String crmMedico) {
		this.crmMedico = crmMedico;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}