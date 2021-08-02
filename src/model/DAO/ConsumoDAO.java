package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Consumo;

public class ConsumoDAO extends GenericDAO<Consumo> {
	public static void createConsumo(Consumo consumo) {
		String query = "INSERT INTO consumo(agua, energia, dataa) VALUES (?, ?, ?);";
		if (create(query, consumo.getAgua(), consumo.getEnergia(), 
				consumo.getData())) {
			System.out.println(" Consumo salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar consumo!");
		}
	}
	
	public static ArrayList<Consumo> readTodosConsumos(){
		String query = "SELECT * FROM consumo";
		ArrayList<Consumo> consumos = new ArrayList<Consumo>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Consumo consumo = new Consumo(rset.getString("agua"),
									 rset.getString("energia"),
									 rset.getString("dataa"));
				consumos.add(consumo);
			}
			return consumos;
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