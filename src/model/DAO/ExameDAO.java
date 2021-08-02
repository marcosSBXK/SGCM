package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Exame;

public class ExameDAO extends GenericDAO<Exame>{
	public static void createExame(Exame exame) {
		String query = "INSERT INTO exame(idExame, requisitos, valorExame, especialidade) VALUES (?, ?, ?, ?);";
		if (create(query, exame.getIdExame(), exame.getRequisitos(), 
				exame.getValorExame(), exame.getDataResultado())) {
			System.out.println(" Exame salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar exame!");
		}
	}
	
	public static Exame readExame(int idExame) {
		String query = "SELECT * FROM exame WHERE idNota = " + idExame + ";";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			if (rset.next()) {
				Exame exame = new Exame(
						 rset.getInt("idExame"),
						 rset.getString("requisitos"),
						 rset.getDouble("valorExame"),
						 rset.getString("especialidade"));
				return exame;
			}
			else {
				Exame exame = new Exame();
				return exame;
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
	
	public static ArrayList<Exame> readTodosExames(){
		String query = "SELECT * FROM exame";
		ArrayList<Exame> exames = new ArrayList<Exame>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Exame exame = new Exame(
						 rset.getInt("idExame"),
						 rset.getString("requisitos"),
						 rset.getDouble("valorExame"),
						 rset.getString("especialidade"));
				exames.add(exame);
			}
			return exames;
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