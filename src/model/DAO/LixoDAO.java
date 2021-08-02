package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Lixo;

public class LixoDAO extends GenericDAO<Lixo> {
	public static void createLixo(Lixo lixo) {
		String query = "INSERT INTO lixo(dia, descarte, reciclavel) VALUES (?, ?, ?);";
		if (create(query, lixo.getDia(), lixo.getDescarte(), 
				lixo.getReciclavel())) {
			System.out.println(" Lixo salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar lixo!");
		}
	}
	
	public static ArrayList<Lixo> readTodosLixos(){
		String query = "SELECT * FROM lixo";
		ArrayList<Lixo> lixos = new ArrayList<Lixo>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Lixo lixo = new Lixo(rset.getString("dia"),
									 rset.getString("descarte"),
									 rset.getString("reciclavel"));
				lixos.add(lixo);
			}
			return lixos;
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