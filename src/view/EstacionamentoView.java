package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Estacionamento;

public class EstacionamentoView {
static Scanner entra = new Scanner(System.in);
	
	public static Estacionamento salvarEstacionamento() {
		String horaEntrada;
		String horaSaida;
		String placaVeiculo;
		int numVagas;
		System.out.println("\n Cadastrar estacionamento:");
		System.out.print(" Hora de entrada: ");
		horaEntrada = entra.nextLine();
		System.out.print(" Hora de saida: ");
		horaSaida = entra.nextLine();
		System.out.print(" Placa do veiculo: ");
		placaVeiculo = entra.nextLine();
		System.out.print(" Numero de vagas: ");
		numVagas = entra.nextInt();
		Estacionamento estacionamento = new Estacionamento(horaEntrada, horaSaida, placaVeiculo, numVagas);
		return estacionamento;
	}
	
	public static void listarTodosEstacionamentos(ArrayList<Estacionamento> lista) {
		System.out.println("\n\t\t\t        Listagem de estacionamento");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("\tH. entrada\t H. saida\tPlaca do veiculo\tNumero de vagas");
        System.out.println("--------------------------------------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
        	Estacionamento estacionamento = lista.get(i);
        	System.out.printf("\t   %s\t  %-10.10s\t    %-10.10s\t\t      %d\n",
        			estacionamento.getHoraEntrada(), estacionamento.getHoraSaida(), 
        			estacionamento.getPlacaVeiculo(), estacionamento.getNumVagas());
        }
	}
}