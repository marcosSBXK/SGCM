package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entity.Recepcionista;

public class RecepcionistaDAO extends GenericDAO<Recepcionista>{
	public static void createRecepcionista(Recepcionista recepcionista) {
		String query = "INSERT INTO recepcionista(nomeRecepcionista, senhaRecepcionista) VALUES (?, ?);";
		if (create(query, recepcionista.getNomeRecepcionista(), recepcionista.getSenhaRecepcionista())) {
			System.out.println(" Recepcionista salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar recepcionista!");
		}
	}
	
	public static Recepcionista readRecepcionista(int idRecepcionista) {
		String query = "SELECT * FROM recepcionista WHERE idRecepcionista = " + idRecepcionista + ";";
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			if (rset.next()) {
				Recepcionista recepcionista = new Recepcionista(rset.getInt("idRecepcionista"),
																rset.getString("nomeRecepcionista"),
																rset.getString("senhaRecepcionista"));
				return recepcionista;
			}
			else {
				Recepcionista recepcionista = new Recepcionista();
				return recepcionista;
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
	
	public static ArrayList<Recepcionista> readTodosRecepcionistas(){
		String query = "SELECT * FROM recepcionista";
		ArrayList<Recepcionista> recepcionistas = new ArrayList<Recepcionista>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Recepcionista recepcionista = new Recepcionista(rset.getInt("idRecepcionista"),
																rset.getString("nomeRecepcionista"),
																rset.getString("senhaRecepcionista"));
				recepcionistas.add(recepcionista);
			}
			return recepcionistas;
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
	
	public static void updateRecepcionista(Recepcionista recepcionista) {
		String query = "UPDATE recepcionista set nomeRecepcionista = ?, senhaRecepcionista = ? where idRecepcionista = ?;";
		if (update(query, recepcionista.getNomeRecepcionista(), recepcionista.getSenhaRecepcionista(), 
						  recepcionista.getIdRecepcionista())) {
			System.out.println(" Recepcionista atualizado com sucesso!");
		}
		else {
			System.out.println(" Erro ao atualizar recepcionista!");
		}
	}
	
	public static void deleteRecepcionista(int codRecepcionista) throws SQLException {
		String query = "DELETE FROM recepcionista WHERE idRecepcionista = " + codRecepcionista + ";";
		if (delete(query)) {
			System.out.println(" Recepcionista apagado com sucesso!");
		}
		else {
			System.out.println(" Erro ao apagar recepcionista!");
		}
	}
}