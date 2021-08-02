package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Exame;

public class ExameView {
static Scanner entra = new Scanner(System.in);
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
	
	public static int getIdExame() {
		System.out.print(" Digite o codigo da nota de servico: ");
		int codFunc = entra.nextInt();
		return codFunc;
	}
	
	public static Exame salvarExame() {
		int idExame;
		String requisitos;
		double valorExame;
		String dataResultado;
		System.out.println("\n Cadastrar nota de servico:");
		System.out.print(" Codigo do exame: ");
		idExame = entra.nextInt();
		clearBuffer(entra);
		System.out.print(" Requisitos: ");
		requisitos = entra.nextLine();
		System.out.print(" Valor do exame: ");
		valorExame = entra.nextDouble();
		clearBuffer(entra);
		System.out.print(" Data do resultado: ");
		dataResultado = entra.nextLine();
		Exame exame = new Exame(idExame, requisitos, valorExame, dataResultado);
		return exame;
	}
	
	public static void exibirExame(Exame exame) {
        System.out.println("\n\t\t\t\t Listagem de Exames");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("\n\tCod. Exame\t Requisitos\t\t Valor         Especialidade");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("\t     %d\t\t%-25.25s%-10.10s\t%-20.20s\n",
                exame.getIdExame(), exame.getRequisitos(), 
                exame.getValorExame(), exame.getDataResultado());
    }
	
	public static void listarTodosExames(ArrayList<Exame> lista) {
        System.out.println("\n\t\t\t\t Listagem de Exames");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("\n\tCod. Exame\t Requisitos\t\t Valor         Especialidade");
        System.out.println("-------------------------------------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
            Exame exame = lista.get(i);
            System.out.printf("\t     %d\t\t%-25.25s%-10.10s\t%-20.20s\n",
                    exame.getIdExame(), exame.getRequisitos(), 
                    exame.getValorExame(), exame.getDataResultado());
        }
    }
}