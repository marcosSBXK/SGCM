package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.PacienteDAO;
import model.entity.Paciente;
import view.PacienteView;

public class PacienteController {
	public static void salvarPaciente() {
		Paciente paciente = new Paciente(PacienteView.salvarPaciente());
		PacienteDAO.createPaciente(paciente);
	}
	
	public static void buscarPaciente() {
		Paciente paciente = new Paciente(PacienteDAO.readPaciente(PacienteView.getCodPaciente()));
		PacienteView.exibirPaciente(paciente);
	}
	
	public static void listarTodosPacientes() {
		ArrayList<Paciente> lista = PacienteDAO.readTodosPacientes();
		PacienteView.listarTodosPacientes(lista);
	}
	
	public static void atualizarPaciente() {
		Paciente paciente = new Paciente(PacienteView.atualizarPaciente());
		PacienteDAO.updatePaciente(paciente);
	}
	
	public static void apagarPaciente() throws SQLException {
		PacienteDAO.deletePaciente(PacienteView.getCodPaciente());
	}
}