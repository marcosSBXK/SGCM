package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Ambiente;

public class AmbienteDAO extends GenericDAO<Ambiente> {
	public static void createAmbiente(Ambiente ambiente) {
		String query = "INSERT INTO ambiente(localidade, condicoes, condicoesEquip) VALUES (?, ?, ?);";
		if (create(query, ambiente.getLocal(), ambiente.getCondicoes(), 
				ambiente.getCondicoesEquip())) {
			System.out.println(" Ambiente salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar ambiente!");
		}
	}
	
	public static ArrayList<Ambiente> readTodosAmbientes(){
		String query = "SELECT * FROM ambiente";
		ArrayList<Ambiente> ambientes = new ArrayList<Ambiente>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Ambiente ambiente = new Ambiente(rset.getString("localidade"),
									 rset.getString("condicoes"),
									 rset.getString("condicoesEquip"));
				ambientes.add(ambiente);
			}
			return ambientes;
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