package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Correio;

public class CorreioView {
static Scanner entra = new Scanner(System.in);
	
	public static Correio salvarCorreio() {
		String tipo;
		String dataEnvio;
		String dataRecebimento;
		System.out.println("\n Cadastrar correio:");
		System.out.print(" Tipo: ");
		tipo = entra.nextLine();
		System.out.print(" Data de envio: ");
		dataEnvio = entra.nextLine();
		System.out.print(" Data de recebimento: ");
		dataRecebimento = entra.nextLine();
		Correio correio = new Correio(tipo, dataEnvio, dataRecebimento);
		return correio;
	}

	public static void listarTodosCorreios(ArrayList<Correio> lista) {
		System.out.println("\n\t\t      Listagem de correio");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\tTipo\t Data de envio\t\t Data de recebimento");
        System.out.println("---------------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
        	Correio correio = lista.get(i);
        	System.out.printf("\t%s\t %s\t\t %s\n",
        			correio.getTipo(), correio.getDataEnvio(), 
        			correio.getDataRecebimento());
        }
	}
}