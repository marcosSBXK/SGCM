package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Consulta;

public class ConsultaDAO extends GenericDAO<Consulta>{
	public static void createConsulta(Consulta consulta) {
		String query = "INSERT INTO consulta(idConsulta, valorConsulta, especialidade) VALUES (?, ?, ?);";
		if (create(query, consulta.getIdConsulta(), consulta.getValorConsulta(), 
						  consulta.getEspecialidade())) {
			System.out.println(" Consulta salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar consulta!");
		}
	}
	
	public static Consulta readConsulta(int idConsulta) {
		String query = "SELECT * FROM consulta WHERE idConsulta = " + idConsulta + ";";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			if (rset.next()) {
				Consulta consulta = new Consulta(
												 rset.getInt("idConsulta"),
												 rset.getInt("valorConsulta"),
												 rset.getString("especialidade"));
				return consulta;
			}
			else {
				Consulta consulta = new Consulta();
				return consulta;
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
	
	public static ArrayList<Consulta> readTodasConsultas(){
		String query = "SELECT * FROM consulta";
		ArrayList<Consulta> consultas = new ArrayList<Consulta>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Consulta consulta = new Consulta(
						 rset.getInt("idConsulta"),
						 rset.getInt("valorConsulta"),
						 rset.getString("especialidade"));
				consultas.add(consulta);
			}
			return consultas;
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