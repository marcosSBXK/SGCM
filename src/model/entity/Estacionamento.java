package model.entity;

public class Estacionamento {
	private String horaEntrada;
	private String horaSaida;
	private String placaVeiculo;
	private int numVagas;
	
	public Estacionamento(String horaEntrada, String horaSaida, String placaVeiculo, int numVagas) {
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.placaVeiculo = placaVeiculo;
		this.numVagas = numVagas;
	}
	
	public Estacionamento(Estacionamento estacionamento) {
		this.horaEntrada = estacionamento.horaEntrada;
		this.horaSaida = estacionamento.horaSaida;
		this.placaVeiculo = estacionamento.placaVeiculo;
		this.numVagas = estacionamento.numVagas;
	}
	
	public String getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public String getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public int getNumVagas() {
		return numVagas;
	}
	public void setNumVagas(int numVagas) {
		this.numVagas = numVagas;
	}
}