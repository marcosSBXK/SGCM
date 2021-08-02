package controller;

import java.util.ArrayList;
import model.DAO.LimpezaDAO;
import model.entity.Limpeza;
import view.LimpezaView;

public class LimpezaController {
	public static void salvarLimpeza() {
		Limpeza limpeza = new Limpeza(LimpezaView.salvarLimpeza());
		LimpezaDAO.createLimpeza(limpeza);
	}
	
	public static void listarTodasLimpezas() {
		ArrayList<Limpeza> lista = LimpezaDAO.readTodasLimpezas();
		LimpezaView.listarTodasLimpezas(lista);
	}
}