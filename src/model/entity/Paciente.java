package model.entity;

public class Paciente {
	private int codPaciente;
	private String cpfPaciente;
	private String nomePaciente;
	private String telPaciente;
	private static int cod = 1;
	
	public Paciente() {
		this.codPaciente = 0;
		this.cpfPaciente = "";
		this.nomePaciente = "";
		this.telPaciente = "";
	}
	
	public Paciente(String cpfPaciente, String nomePaciente, String telPaciente) {
		this.codPaciente = cod;
		this.cpfPaciente = cpfPaciente;
		this.nomePaciente = nomePaciente;
		this.telPaciente = telPaciente;
		cod++;
	}
	
	public Paciente(int codPaciente, String cpfPaciente, String nomePaciente, String telPaciente) {
		this.codPaciente = codPaciente;
		this.cpfPaciente = cpfPaciente;
		this.nomePaciente = nomePaciente;
		this.telPaciente = telPaciente;
	}
	
	public Paciente(Paciente paciente) {
		this.codPaciente = paciente.codPaciente;
		this.cpfPaciente = paciente.cpfPaciente;
		this.nomePaciente = paciente.nomePaciente;
		this.telPaciente = paciente.telPaciente;
	}
	
	public int getCodPaciente() {
		return codPaciente;
	}
	public void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
	}
	public String getCpfPaciente() {
		return cpfPaciente;
	}
	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getTelPaciente() {
		return telPaciente;
	}
	public void setTelPaciente(String telPaciente) {
		this.telPaciente = telPaciente;
	}
}