package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Paciente;

public class PacienteView {
	static Scanner entra = new Scanner(System.in);
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
	
	public static int getCodPaciente() {
		System.out.print(" Digite o codigo do paciente: ");
		int codFunc = entra.nextInt();
		return codFunc;
	}
	
	public static Paciente salvarPaciente() {
		String cpf;
		String nome;
		String tel;
		System.out.println("\n Cadastrar paciente:");
		System.out.print(" CPF: ");
		cpf = entra.nextLine();
		System.out.print(" Nome: ");
		nome = entra.nextLine();
		System.out.print(" Telefone: ");
		tel = entra.nextLine();
		Paciente paciente = new Paciente(cpf, nome, tel);
		return paciente;
	}
	
	public static void exibirPaciente(Paciente paciente) {
        System.out.println("\n\t\t\t  Paciente");
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tCod. Paciente\t Nome\t\t Telefone");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("\t      %d\t\t %-15.15s%-10.10s\n",
                paciente.getCodPaciente(), paciente.getNomePaciente(), 
                paciente.getTelPaciente());
    }

    public static void listarTodosPacientes(ArrayList<Paciente> lista) {
        System.out.println("\n\t\t Listagem de paciente");
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tCod. Paciente\t Nome\t\t Telefone");
        System.out.println("-------------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
            Paciente paciente = lista.get(i);
            System.out.printf("\t      %d\t\t %-15.15s%-10.10s\n",
                    paciente.getCodPaciente(), paciente.getNomePaciente(), 
                    paciente.getTelPaciente());
        }
    }
	
	public static Paciente atualizarPaciente() {
		int codPac;
		String cpf;
		String nome;
		String tel;
		System.out.println("\n Atualizar paciente:");
		System.out.print(" Codigo: ");
		codPac = entra.nextInt();
		clearBuffer(entra);
		System.out.print(" CPF: ");
		cpf = entra.nextLine();
		System.out.print(" Nome: ");
		nome = entra.nextLine();
		System.out.print(" Telefone: ");
		tel = entra.nextLine();
		Paciente paciente = new Paciente(codPac, cpf,  nome, tel);
		return paciente;
	}
}