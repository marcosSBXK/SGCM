package controller;

import java.util.ArrayList;
import model.DAO.LixoDAO;
import model.entity.Lixo;
import view.LixoView;

public class LixoController {
	public static void salvarLixo() {
		Lixo lixo = new Lixo(LixoView.salvarLixo());
		LixoDAO.createLixo(lixo);
	}
	
	public static void listarTodosLixos() {
		ArrayList<Lixo> lista = LixoDAO.readTodosLixos();
		LixoView.listarTodosLixos(lista);
	}
}