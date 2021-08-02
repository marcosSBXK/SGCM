package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Nota_servico;

public class Nota_servicoView {
static Scanner entra = new Scanner(System.in);
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
	
	public static int getIdNota() {
		System.out.print(" Digite o codigo da nota de servico: ");
		int codFunc = entra.nextInt();
		return codFunc;
	}
	
	public static Nota_servico salvarNota_servico() {
		int idPaciente;
		String tipo;
		String data;
		String horario;
		System.out.println("\n Cadastrar nota de servico:");
		System.out.print(" Codigo do paciente: ");
		idPaciente = entra.nextInt();
		clearBuffer(entra);
		System.out.print(" Tipo: ");
		tipo = entra.nextLine();
		System.out.print(" Data: ");
		data = entra.nextLine();
		System.out.print(" Horario: ");
		horario = entra.nextLine();
		Nota_servico nota_servico = new Nota_servico(idPaciente, tipo, data, horario);
		return nota_servico;
	}
	
	public static void exibirNota_servico(Nota_servico nota_servico) {
		System.out.println("\nCod. Paciente\t Nome\t\t\t Telefone");
        System.out.println("-------------------------------------------------------------");
        System.out.printf(" %d\t\t %-20.20s \t %-10.10s\n",
        		nota_servico.getIdNota(), nota_servico.getIdPaciente(), 
        		nota_servico.getTipo(), nota_servico.getData(),
        		nota_servico.getHorario());
	}
	
	public static void listarTodasNota_servicos(ArrayList<Nota_servico> lista) {
		System.out.println("\n\t\t Listagem de paciente");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Cod. Paciente\t Nome\t\t\t Telefone");
        System.out.println("-------------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
        	Nota_servico nota_servico = lista.get(i);
        	System.out.printf(" %d\t\t %-20.20s \t %-10.10s\n",
        			nota_servico.getIdNota(), nota_servico.getIdPaciente(), 
            		nota_servico.getTipo(), nota_servico.getData(),
            		nota_servico.getHorario());
        }
	}
}