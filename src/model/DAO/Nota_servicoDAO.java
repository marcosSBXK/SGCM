package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Nota_servico;
public class Nota_servicoDAO extends GenericDAO<Nota_servico>{
	public static void createNota_servico(Nota_servico nota_servico) {
		String query = "INSERT INTO nota_servico(idNota, codPaciente, tipo, dataa, horario) VALUES (?, ?, ?, ?, ?);";
		if (create(query, nota_servico.getIdNota(), nota_servico.getIdPaciente(), 
						  nota_servico.getTipo(), nota_servico.getData(),
						  nota_servico.getHorario())) {
			System.out.println(" Nota_servico salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar nota_servico!");
		}
	}
	
	public static Nota_servico readNota_servico(int idNota) {
		String query = "SELECT * FROM nota_servico WHERE idNota = " + idNota + ";";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			if (rset.next()) {
				Nota_servico nota_servico = new Nota_servico(
												 rset.getInt("idNota"),
												 rset.getInt("codPaciente"),
												 rset.getString("cpfPaciente"),
												 rset.getString("nomePaciente"),
												 rset.getString("telPaciente"));
				return nota_servico;
			}
			else {
				Nota_servico nota_servico = new Nota_servico();
				return nota_servico;
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
	
	public static ArrayList<Nota_servico> readTodasNota_servicos(){
		String query = "SELECT * FROM nota_servico";
		ArrayList<Nota_servico> nota_servicos = new ArrayList<Nota_servico>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Nota_servico nota_servico = new Nota_servico(
												 rset.getInt("idNota"),
												 rset.getInt("codPaciente"),
												 rset.getString("cpfPaciente"),
												 rset.getString("nomePaciente"),
												 rset.getString("telPaciente"));
				nota_servicos.add(nota_servico);
			}
			return nota_servicos;
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