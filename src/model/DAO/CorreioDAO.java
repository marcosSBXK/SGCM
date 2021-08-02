package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Correio;

public class CorreioDAO extends GenericDAO<Correio> {
	public static void createCorreio(Correio correio) {
		String query = "INSERT INTO correio(tipo, dataEnvio, dataReceb) VALUES (?, ?, ?);";
		if (create(query, correio.getTipo(), correio.getDataEnvio(), 
				correio.getDataRecebimento())) {
			System.out.println(" Correio salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar correio!");
		}
	}
	
	public static ArrayList<Correio> readTodosCorreios(){
		String query = "SELECT * FROM correio";
		ArrayList<Correio> correios = new ArrayList<Correio>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Correio correio = new Correio(rset.getString("tipo"),
									 		  rset.getString("dataEnvio"),
									 		  rset.getString("dataReceb"));
				correios.add(correio);
			}
			return correios;
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