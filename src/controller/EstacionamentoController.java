package controller;

import java.util.ArrayList;
import model.DAO.EstacionamentoDAO;
import model.entity.Estacionamento;
import view.EstacionamentoView;

public class EstacionamentoController {
	public static void salvarEstacionamento() {
		Estacionamento estacionamento = new Estacionamento(EstacionamentoView.salvarEstacionamento());
		EstacionamentoDAO.createEstacionamento(estacionamento);
	}
	
	public static void listarTodosEstacionamentos() {
		ArrayList<Estacionamento> lista = EstacionamentoDAO.readTodosEstacionamentos();
		EstacionamentoView.listarTodosEstacionamentos(lista);
	}
}