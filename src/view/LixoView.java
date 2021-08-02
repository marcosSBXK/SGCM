package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Lixo;

public class LixoView {
	static Scanner entra = new Scanner(System.in);
	
	public static Lixo salvarLixo() {
		String dia;
		String descarte;
		String reciclavel;
		System.out.println("\n Cadastrar lixo:");
		System.out.print(" Dia: ");
		dia = entra.nextLine();
		System.out.print(" Descarte: ");
		descarte = entra.nextLine();
		System.out.print(" Reciclavel: ");
		reciclavel = entra.nextLine();
		Lixo lixo = new Lixo(dia, descarte, reciclavel);
		return lixo;
	}
	
	public static void listarTodosLixos(ArrayList<Lixo> lista) {
		System.out.println("\n\t\t      Listagem de lixo");
        System.out.println("------------------------------------------------------------");
        System.out.println("\tDia\t\tDescarte\t Reciclavel");
        System.out.println("------------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
        	Lixo lixo = lista.get(i);
        	System.out.printf("\t%s\t%s\t\t %s\n",
        			lixo.getDia(), lixo.getDescarte(), 
        			lixo.getReciclavel());
        }
	}
}