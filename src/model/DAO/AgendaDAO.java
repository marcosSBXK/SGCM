package model.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Agenda;

public class AgendaDAO extends GenericDAO<Agenda> {
	public static void createAgenda(Agenda agenda) {
		String query = "INSERT INTO agenda(idAgenda, tipo, codPaciente, idNota) VALUES (?, ?, ?, ?);";
		if (create(query, agenda.getIdA(), agenda.getTipo(), 
				agenda.getCodPaciente(), agenda.getIdNota())) {
			System.out.println(" Agenda salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar agenda!");
		}
	}
	
	public static ArrayList<Agenda> readTodasAgendas(){
		String query = "SELECT * FROM agenda";
		ArrayList<Agenda> agendas = new ArrayList<Agenda>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Agenda agenda = new Agenda(rset.getInt("idAgenda"),
										   rset.getString("tipo"),
										   rset.getInt("codPaciente"),
										   rset.getInt("idNota"));
				agendas.add(agenda);
			}
			return agendas;
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
}