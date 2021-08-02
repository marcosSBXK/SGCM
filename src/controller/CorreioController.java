package controller;

import java.util.ArrayList;
import model.DAO.CorreioDAO;
import model.entity.Correio;
import view.CorreioView;

public class CorreioController {
	public static void salvarCorreio() {
		Correio correio = new Correio(CorreioView.salvarCorreio());
		CorreioDAO.createCorreio(correio);
	}
	
	public static void listarTodosCorreios() {
		ArrayList<Correio> lista = CorreioDAO.readTodosCorreios();
		CorreioView.listarTodosCorreios(lista);
	}
}