package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Ambiente;

public class AmbienteView {
static Scanner entra = new Scanner(System.in);
	
	public static Ambiente salvarAmbiente() {
		String local;
		String condicoes;
		String condicoesEquip;
		System.out.println("\n Cadastrar ambiente:");
		System.out.print(" Local: ");
		local = entra.nextLine();
		System.out.print(" Condicoes: ");
		condicoes = entra.nextLine();
		System.out.print(" Condicoes Equipamentos: ");
		condicoesEquip = entra.nextLine();
		Ambiente ambiente = new Ambiente(local, condicoes, condicoesEquip);
		return ambiente;
	}

	public static void listarTodosAmbientes(ArrayList<Ambiente> lista) {
		System.out.println("\n\t\t      Listagem de ambiente");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\tLocal\t Condicoes\tCondicoes Equip.");
        System.out.println("---------------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
        	Ambiente ambiente = lista.get(i);
        	System.out.printf("\t%s\t %s \t\t%s\n",
        			ambiente.getLocal(), ambiente.getCondicoes(), 
        			ambiente.getCondicoesEquip());
        }
	}
}