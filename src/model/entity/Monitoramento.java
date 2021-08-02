package model.entity;

public class Monitoramento {
	private String cameras;
	private String data;
	private String hora;
	private boolean status;
	
	public Monitoramento(String idMonitoramento, String cameras, String data, String hora, boolean status) {
		this.cameras = cameras;
		this.data = data;
		this.hora = hora;
		this.status = status;
	}
	
	public Monitoramento(Monitoramento monitoramento) {
		this.cameras = monitoramento.cameras;
		this.data = monitoramento.data;
		this.hora = monitoramento.hora;
		this.status = monitoramento.status;
	}

	public String getCameras() {
		return cameras;
	}
	public void setCameras(String cameras) {
		this.cameras = cameras;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}