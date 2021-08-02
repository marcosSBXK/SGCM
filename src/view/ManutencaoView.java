package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Manutencao;

public class ManutencaoView {
static Scanner entra = new Scanner(System.in);
	
	public static Manutencao salvarManutencao() {
		String elevador;
		String data;
		String validade;
		System.out.println("\n Cadastrar manutencao:");
		System.out.print(" Elevador: ");
		elevador = entra.nextLine();
		System.out.print(" Data: ");
		data = entra.nextLine();
		System.out.print(" Validade: ");
		validade = entra.nextLine();
		Manutencao manutencao = new Manutencao(elevador, data, validade);
		return manutencao;
	}
	
	public static void listarTodasManutencaos(ArrayList<Manutencao> lista) {
		System.out.println("\n\t\t      Listagem de manutencao");
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tElevador\t Data\t\t Validade");
        System.out.println("-------------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
        	Manutencao manutencao = lista.get(i);
        	System.out.printf("\t%s\t\t %s  \t%s\n",
        			manutencao.getElevador(), manutencao.getData(), 
        			manutencao.getValidade());
        }
	}
}