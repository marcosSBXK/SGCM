package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Agenda;

public class AgendaView {
static Scanner entra = new Scanner(System.in);
	public static Agenda salvarAgenda() {
		String tipo;
		int codPaciente;
		int idNota;
		System.out.println("\n Cadastrar agenda:");
		System.out.print(" Tipo: ");
		tipo = entra.nextLine();
		System.out.print(" Codigo do paciente: ");
		codPaciente = entra.nextInt();
		System.out.print(" Id da nota: ");
		idNota = entra.nextInt();
		entra.nextLine();
		Agenda agenda = new Agenda(tipo, codPaciente, idNota);
		return agenda;
	}
	
	public static void exibirAgenda(Agenda agenda) {
        System.out.println("\n\t\t                  Consulta");
        System.out.println("-------------------------------------------------------------");
        System.out.println("\n\tCod. Agenda\t Tipo\t Paciente\t Nota");
        System.out.println("-------------------------------------------------------------");
    		System.out.printf("\t %d\t%s %d\t %d\n",
            		agenda.getIdA(), agenda.getTipo(), 
            		agenda.getCodPaciente(), agenda.getIdNota());
    }

    public static void listarTodasAgendas(ArrayList<Agenda> lista) {
        System.out.println("\n\t\t      Listagem de consulta");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\tCod. Agenda\t Tipo\t  Paciente\t Nota");
        System.out.println("-------------------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
        	Agenda agenda = lista.get(i);
            System.out.printf("\t %d\t\t %s %d\t\t %d\n",
            		agenda.getIdA(), agenda.getTipo(), 
            		agenda.getCodPaciente(), agenda.getIdNota());
        }
    }
}