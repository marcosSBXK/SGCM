package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Estacionamento;

public class EstacionamentoDAO extends GenericDAO<Estacionamento> {
	public static void createEstacionamento(Estacionamento estacionamento) {
		String query = "INSERT INTO estacionamento(horaEntrada, horaSaida, placaVeiculo, numVagas) VALUES (?, ?, ?, ?);";
		if (create(query, estacionamento.getHoraEntrada(), estacionamento.getHoraSaida(), 
				estacionamento.getPlacaVeiculo(), estacionamento.getNumVagas())) {
			System.out.println(" Estacionamento salvo com sucesso!");
		}
		else {
			System.out.println(" Erro ao salvar estacionamento!");
		}
	}
	
	public static ArrayList<Estacionamento> readTodosEstacionamentos(){
		String query = "SELECT * FROM estacionamento";
		ArrayList<Estacionamento> estacionamentos = new ArrayList<Estacionamento>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try {
			conn = ConnectionFactory.createConnectionToMySQL();	
			pstm = conn.prepareStatement(query);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Estacionamento estacionamento = new Estacionamento(
												rset.getString("horaEntrada"),
												rset.getString("horaSaida"),
												rset.getString("placaVeiculo"),
												rset.getInt("numVagas"));
				estacionamentos.add(estacionamento);
			}
			return estacionamentos;
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
}