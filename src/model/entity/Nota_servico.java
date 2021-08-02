package model.entity;

public class Nota_servico {
	private int idNota;
	private int idPaciente;
	private String tipo;
	private String data;
	private String horario;
	private static int id = 1;
	
	public Nota_servico() {
		this.idNota = 0;
		this.idPaciente = 0;
		this.tipo = "";
		this.data = "";
		this.horario = "";
	}
	
	public Nota_servico(int idPaciente, String tipo, String data, String horario) {
		this.idNota = id;
		this.idPaciente = idPaciente;
		this.tipo = tipo;
		this.data = data;
		this.horario = horario;
		id++;
	}

	public Nota_servico(int idNota, int idPaciente, String tipo, String data, String horario) {
		this.idNota = idNota;
		this.idPaciente = idPaciente;
		this.tipo = tipo;
		this.data = data;
		this.horario = horario;
	}
	
	public Nota_servico(Nota_servico nota_servico) {
		this.idNota = nota_servico.idNota;
		this.idPaciente = nota_servico.idPaciente;
		this.tipo = nota_servico.tipo;
		this.data = nota_servico.data;
		this.horario = nota_servico.horario;
	}
	
	public int getIdNota() {
		return idNota;
	}
	public void setIdNota(int idNota) {
		this.idNota = idNota;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setCpfPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
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
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
}