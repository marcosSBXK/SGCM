package controller;

import java.util.ArrayList;
import model.DAO.AmbienteDAO;
import model.entity.Ambiente;
import view.AmbienteView;

public class AmbienteController {
	public static void salvarAmbiente() {
		Ambiente ambiente = new Ambiente(AmbienteView.salvarAmbiente());
		AmbienteDAO.createAmbiente(ambiente);
	}
	
	public static void listarTodosAmbientes() {
		ArrayList<Ambiente> lista = AmbienteDAO.readTodosAmbientes();
		AmbienteView.listarTodosAmbientes(lista);
	}
}