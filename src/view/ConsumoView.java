package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Consumo;

public class ConsumoView {
static Scanner entra = new Scanner(System.in);
	
	public static Consumo salvarConsumo() {
		String agua;
		String energia;
		String data;
		System.out.println("\n Cadastrar consumo:");
		System.out.print(" Agua: ");
		agua = entra.nextLine();
		System.out.print(" Energia: ");
		energia = entra.nextLine();
		System.out.print(" Data: ");
		data = entra.nextLine();
		Consumo consumo = new Consumo(agua, energia, data);
		return consumo;
	}

	public static void listarTodosConsumos(ArrayList<Consumo> lista) {
		System.out.println("\n\t\t     Listagem de consumo");
        System.out.println("--------------------------------------------------------");
        System.out.println("\tAgua\t\t Energia\t   Data");
        System.out.println("--------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
        	Consumo consumo = lista.get(i);
        	System.out.printf("\t%s\t %s \t%s\n",
        			consumo.getAgua(), consumo.getEnergia(), 
        			consumo.getData());
        }
	}
}