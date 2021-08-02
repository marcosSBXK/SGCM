package controller;

import java.util.ArrayList;
import model.DAO.ConsultaDAO;
import model.entity.Consulta;
import view.ConsultaView;

public class ConsultaController {
	public static void salvarConsulta() {
		Consulta consulta = new Consulta(ConsultaView.salvarConsulta());
		ConsultaDAO.createConsulta(consulta);
	}
	
	public static void buscarConsulta() {
		Consulta consulta = new Consulta(ConsultaDAO.readConsulta(ConsultaView.getIdConsulta()));
		ConsultaView.exibirConsulta(consulta);
	}
	
	public static void listarTodasConsultas() {
		ArrayList<Consulta> lista = ConsultaDAO.readTodasConsultas();
		ConsultaView.listarTodasConsultas(lista);
	}
}