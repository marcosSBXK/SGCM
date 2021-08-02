package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Consulta;

public class ConsultaView {
static Scanner entra = new Scanner(System.in);
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
	
	public static int getIdConsulta() {
		System.out.print(" Digite o codigo da consulta: ");
		int codFunc = entra.nextInt();
		return codFunc;
	}
	
	public static Consulta salvarConsulta() {
		int idConsulta;
		double valorConsulta;
		String especialidade;
		System.out.println("\n Cadastrar consulta:");
		System.out.print(" Codigo da consulta: ");
		idConsulta = entra.nextInt();
		clearBuffer(entra);
		System.out.print(" valorConsulta: ");
		valorConsulta = entra.nextDouble();
		clearBuffer(entra);
		System.out.print(" Especialidade: ");
		especialidade = entra.nextLine();
		Consulta consulta = new Consulta(idConsulta, valorConsulta, especialidade);
		return consulta;
	}
	
	public static void exibirConsulta(Consulta consulta) {
        System.out.println("\n\t\t                  Consulta");
        System.out.println("\n\tCod. Consulta\t     Valor\t     Especialidade");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("\t     %d\t\t     %-10.10s        %-25.25s\n",
                consulta.getIdConsulta(), consulta.getValorConsulta(), 
                consulta.getEspecialidade());
    }

    public static void listarTodasConsultas(ArrayList<Consulta> lista) {
        System.out.println("\n\t\t      Listagem de consulta");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\n\tCod. Consulta\t     Valor\t     Especialidade");
        System.out.println("-------------------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
            Consulta consulta = lista.get(i);
            System.out.printf("\t     %d\t\t     %-10.10s        %-25.25s\n",
                    consulta.getIdConsulta(), consulta.getValorConsulta(), 
                    consulta.getEspecialidade());
        }
    }
}