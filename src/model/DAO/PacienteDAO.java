package model.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entity.Paciente;

public class PacienteDAO extends GenericDAO<Paciente>{
	public static void createPaciente(Paciente paciente) {
		String query = "INSERT INTO paciente(codPaciente, cpfPaciente, nomePaciente, telPaciente) VALUES (?, ?, ?, ?);";
		if (create(query, paciente.getCodPaciente(), paciente.getCpfPaciente(), 
						  paciente.getNomePaciente(), paciente.getTelPaciente())) {
			System.out.println(" Paciente salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar paciente!");
		}
	}
	
	public static Paciente readPaciente(int codPaciente) {
		String query = "SELECT * FROM paciente WHERE codPaciente = " + codPaciente + ";";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			if (rset.next()) {
				Paciente paciente = new Paciente(rset.getInt("codPaciente"),
												 rset.getString("cpfPaciente"),
												 rset.getString("nomePaciente"),
												 rset.getString("telPaciente"));
				return paciente;
			}
			else {
				Paciente paciente = new Paciente();
				return paciente;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset!=null) {
					rset.close();
				}
				if (pstm!=null) {
					pstm.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static ArrayList<Paciente> readTodosPacientes(){
		String query = "SELECT * FROM paciente";
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Paciente paciente = new Paciente(rset.getInt("codPaciente"),
												 rset.getString("cpfPaciente"),
												 rset.getString("nomePaciente"),
												 rset.getString("telPaciente"));
				pacientes.add(paciente);
			}
			return pacientes;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rset!=null) {
					rset.close();
				}
				if (pstm!=null) {
					pstm.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static void updatePaciente(Paciente paciente) {
		String query = "UPDATE paciente set cpfPaciente = ?, nomePaciente = ?, telPaciente = ? where codPaciente = ?;";
		if (update(query, paciente.getCpfPaciente(), paciente.getNomePaciente(), 
						  paciente.getTelPaciente(), paciente.getCodPaciente())) {
			System.out.println(" Paciente atualizado com sucesso!");
		}
		else {
			System.out.println(" Erro ao atualizar paciente!");
		}
	}
	
	public static void deletePaciente(int codPaciente) throws SQLException {
		String query = "DELETE FROM paciente WHERE codPaciente = " + codPaciente + ";";
		if (delete(query)) {
			System.out.println(" Paciente apagado com sucesso!");
		}
		else {
			System.out.println(" Erro ao apagar paciente!");
		}
	}
}