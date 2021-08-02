package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Limpeza;

public class LimpezaDAO extends GenericDAO<Limpeza> {
	public static void createLimpeza(Limpeza limpeza) {
		String query = "INSERT INTO limpeza(banheiro, quarto, corredor, recepcao, ";
			   query += "externo, escritorio) VALUES (?, ?, ?, ?, ?, ?);";
		if (create(query, limpeza.getBanheiros(), limpeza.getQuartos(),
    					  limpeza.getCorredores(), limpeza.getRecepcao(),
    					  limpeza.getExterno(), limpeza.getEscritorio())) {
			System.out.println(" Limpeza salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar limpeza!");
		}
	}
	
	public static ArrayList<Limpeza> readTodasLimpezas(){
		String query = "SELECT * FROM limpeza";
		ArrayList<Limpeza> limpezas = new ArrayList<Limpeza>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Limpeza limpeza = new Limpeza(rset.getString("banheiro"),
									 	   	  rset.getString("quarto"),
									 	   	  rset.getString("corredor"),
									 	   	  rset.getString("recepcao"),
									 	   	  rset.getString("externo"),
									 	   	  rset.getString("escritorio"));
				limpezas.add(limpeza);
			}
			return limpezas;
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