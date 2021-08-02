package controller;

import java.util.ArrayList;
import model.DAO.Nota_servicoDAO;
import model.entity.Nota_servico;
import view.Nota_servicoView;

public class Nota_servicoController {
	public static void salvarNota_servico() {
		Nota_servico nota_servico = new Nota_servico(Nota_servicoView.salvarNota_servico());
		Nota_servicoDAO.createNota_servico(nota_servico);
	}
	
	public static void buscarNota_servico() {
		Nota_servico nota_servico = new Nota_servico(Nota_servicoDAO.readNota_servico(Nota_servicoView.getIdNota()));
		Nota_servicoView.exibirNota_servico(nota_servico);
	}
	
	public static void listarTodasNota_servicos() {
		ArrayList<Nota_servico> lista = Nota_servicoDAO.readTodasNota_servicos();
		Nota_servicoView.listarTodasNota_servicos(lista);
	}
}