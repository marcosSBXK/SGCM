package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Limpeza;

public class LimpezaView {
static Scanner entra = new Scanner(System.in);
	
	public static Limpeza salvarLimpeza() {
		String banheiros;
		String quartos;
		String corredores;
		String recepcao;
		String externo;
		String escritorio;
		System.out.println("\n Cadastrar limpeza:");
		System.out.print(" Banheiros: ");
		banheiros = entra.nextLine();
		System.out.print(" Quartos: ");
		quartos = entra.nextLine();
		System.out.print(" Corredores: ");
		corredores = entra.nextLine();
		System.out.print(" Recepcao: ");
		recepcao = entra.nextLine();
		System.out.print(" Externo: ");
		externo = entra.nextLine();
		System.out.print(" Escritorio: ");
		escritorio = entra.nextLine();
		Limpeza limpeza = new Limpeza(banheiros, quartos, corredores,
									  recepcao, externo, escritorio);
		return limpeza;
	}
	
	public static void listarTodasLimpezas(ArrayList<Limpeza> lista) {
		System.out.println("\n\t\t\t        Listagem de limpeza");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(" Banheiros     Quartos     Corredores     Recepcao     Externo     Escritorio");
        System.out.println("----------------------------------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
        	Limpeza limpeza = lista.get(i);
        	System.out.printf("    %s\t\t %s\t       %s\t     %s\t\t %s\t       %s\n",
        			limpeza.getBanheiros(), limpeza.getQuartos(),
        			limpeza.getCorredores(), limpeza.getRecepcao(),
        			limpeza.getExterno(), limpeza.getEscritorio());
        }
	}
}