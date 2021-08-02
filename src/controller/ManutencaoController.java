package controller;

import java.util.ArrayList;
import model.DAO.ManutencaoDAO;
import model.entity.Manutencao;
import view.ManutencaoView;

public class ManutencaoController {
	public static void salvarManutencao() {
		Manutencao manutencao = new Manutencao(ManutencaoView.salvarManutencao());
		ManutencaoDAO.createManutencao(manutencao);
	}
	
	public static void listarTodasManutencoes() {
		ArrayList<Manutencao> lista = ManutencaoDAO.readTodasManutencaos();
		ManutencaoView.listarTodasManutencaos(lista);
	}
}