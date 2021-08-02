package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Manutencao;

public class ManutencaoDAO extends GenericDAO<Manutencao> {
	public static void createManutencao(Manutencao manutencao) {
		String query = "INSERT INTO manutencao(elevador, dataa, validade) VALUES (?, ?, ?);";
		if (create(query, manutencao.getElevador(), manutencao.getData(), 
				manutencao.getValidade())) {
			System.out.println(" Manutencao salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar manutencao!");
		}
	}

	public static ArrayList<Manutencao> readTodasManutencaos(){
		String query = "SELECT * FROM manutencao";
		ArrayList<Manutencao> manutencaos = new ArrayList<Manutencao>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Manutencao manutencao = new Manutencao(
									 rset.getString("elevador"),
									 rset.getString("dataa"),
									 rset.getString("validade"));
				manutencaos.add(manutencao);
			}
			return manutencaos;
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
