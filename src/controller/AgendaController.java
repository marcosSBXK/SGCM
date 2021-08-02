package controller;

import java.util.ArrayList;
import model.DAO.AgendaDAO;
import model.entity.Agenda;
import view.AgendaView;

public class AgendaController {
	public static void salvarAgenda() {
		Agenda agenda = new Agenda(AgendaView.salvarAgenda());
		AgendaDAO.createAgenda(agenda);
	}
	public static void listarTodasAgendas() {
		ArrayList<Agenda> lista = AgendaDAO.readTodasAgendas();
		AgendaView.listarTodasAgendas(lista);
	}
}