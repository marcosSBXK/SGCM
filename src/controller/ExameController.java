package controller;

import java.util.ArrayList;
import model.DAO.ExameDAO;
import model.entity.Exame;
import view.ExameView;

public class ExameController {
	public static void salvarExame() {
		Exame exame = new Exame(ExameView.salvarExame());
		ExameDAO.createExame(exame);
	}
	
	public static void buscarExame() {
		Exame exame = new Exame(ExameDAO.readExame(ExameView.getIdExame()));
		ExameView.exibirExame(exame);
	}
	
	public static void listarTodosExames() {
		ArrayList<Exame> lista = ExameDAO.readTodosExames();
		ExameView.listarTodosExames(lista);
	}
}