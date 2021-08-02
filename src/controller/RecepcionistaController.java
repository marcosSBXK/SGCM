package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.RecepcionistaDAO;
import model.entity.Recepcionista;
import view.RecepcionistaView;

public class RecepcionistaController {
	public static void salvarRecepcionista() {
		Recepcionista recepcionista = new Recepcionista(RecepcionistaView.salvarRecepcionista());
		RecepcionistaDAO.createRecepcionista(recepcionista);
	}
	
	public static void buscarRecepcionista() {
		Recepcionista recepcionista = new Recepcionista(RecepcionistaDAO.readRecepcionista(RecepcionistaView.getIdRecepcionista()));
		RecepcionistaView.exibirRecepcionista(recepcionista);
	}
	
	public static void listarTodosRecepcionistas() {
		ArrayList<Recepcionista> lista = RecepcionistaDAO.readTodosRecepcionistas();
		RecepcionistaView.listarTodosRecepcionistas(lista);
	}
	
	public static void atualizarRecepcionista() {
		Recepcionista recepcionista = new Recepcionista(RecepcionistaView.atualizarRecepcionista());
		RecepcionistaDAO.updateRecepcionista(recepcionista);
	}
	
	public static void apagarRecepcionista() throws SQLException {
		RecepcionistaDAO.deleteRecepcionista(RecepcionistaView.getIdRecepcionista());
	}
	
	public static boolean login() {
		return RecepcionistaView.loginRecepcionista(RecepcionistaDAO.readTodosRecepcionistas());
	}
}