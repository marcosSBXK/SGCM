package controller;

import java.util.ArrayList;
import model.DAO.ConsumoDAO;
import model.entity.Consumo;
import view.ConsumoView;

public class ConsumoController {
	public static void salvarConsumo() {
		Consumo consumo = new Consumo(ConsumoView.salvarConsumo());
		ConsumoDAO.createConsumo(consumo);
	}
	
	public static void listarTodosConsumos() {
		ArrayList<Consumo> lista = ConsumoDAO.readTodosConsumos();
		ConsumoView.listarTodosConsumos(lista);
	}
}