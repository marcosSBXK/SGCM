package aplication;

import java.sql.SQLException;
import java.util.Scanner;

import controller.AgendaController;
import controller.AmbienteController;
import controller.ConsultaController;
import controller.ConsumoController;
import controller.CorreioController;
import controller.EstacionamentoController;
import controller.ExameController;
import controller.LimpezaController;
import controller.LixoController;
import controller.ManutencaoController;
import controller.PacienteController;
import controller.RecepcionistaController;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) throws SQLException {
		if(RecepcionistaController.login()) {
			System.out.println(" Login bem-sucedido!");
			int op;
			do{
	            System.out.println("\n---------- Menu Principal ----------");
	            System.out.println(" 0 - Sair");
	            System.out.println(" 1 - Agendamento");
	            System.out.println(" 2 - Gestao");
				System.out.println(" 3 - Cadastro");
				System.out.print(" Opcao desejada: ");
				op = entrada.nextInt();
				entrada.nextLine();
	            switch (op) {
	                case 0:
	                    System.out.println("\n Fim da sessao!");
	                    break;
	                case 1:
	                    agendamento();
	                    break;
	                case 2:
	                	gestao();
	                    break;
	                case 3:
	                	cadastros();
	                    break;
	                default:
	                    System.out.println("\n Opcao invalida!\n Digite novamente");
	                    break;
		        }
		    } while (op!=0);
		}
	}
	
	public static void agendamento() throws SQLException {
		int option;
		do{
			System.out.println("\n---------- Agendamento ----------");
			System.out.println(" 0 - Voltar ao menu principal");
			System.out.println(" 1 - Agendar");
			System.out.println(" 2 - Listar agendamentos");
			System.out.print(" Opcao desejada: ");
			option = entrada.nextInt();
			entrada.nextLine();
	        switch (option) {
	            case 0:
	            	break;
	            case 1:
	            	AgendaController.salvarAgenda();
	                break;
	            case 2:
	            	AgendaController.listarTodasAgendas();
	                break;
	            default:
	                System.out.println("\n Opcao invalida!\n Digite novamente");
	                break;
	        }
		} while (option != 0);
	}
	
	public static void cadastros() throws SQLException {
		int option;
		do{
			System.out.println("\n------------- Cadastros------------");
			System.out.println(" 0 - Voltar ao menu principal");
			System.out.println(" 1 - Recepcionista");
			System.out.println(" 2 - Paciente");
			System.out.println(" 3 - Consulta");
			System.out.println(" 4 - Exame");
			System.out.print(" Opcao desejada: ");
			option = entrada.nextInt();
			entrada.nextLine();
	        switch (option) {
	            case 0:
	            	break;
	            case 1:
	            	cadastroRecepcionista();
	                break;
	            case 2:
	            	cadastroPaciente();
	                break;
	            case 3:
	            	cadastroConsulta();
	                break;
	            case 4:
	            	cadastroExame();
	                break;
	            default:     
	            	System.out.println("\n Opcao invalida!\n Digite novamente");
	                break;
	        }
		} while (option != 0);
	}
	
	public static void cadastroRecepcionista() throws SQLException {
		int option;
		do{
			System.out.println("\n---------- Cadastro de recepcionistas ----------");
			System.out.println(" 0 - Voltar ao menu de cadastros");
			System.out.println(" 1 - Cadastrar recepcionista");
			System.out.println(" 2 - Atualizar recepcionista");
			System.out.println(" 3 - Buscar recepcionista");
			System.out.println(" 4 - Listar todos os recepcionistas");
			System.out.println(" 5 - Remover recepcionista");
			System.out.print(" Opcao desejada: ");
			option = entrada.nextInt();
			entrada.nextLine();
	        switch (option) {
	            case 0:
	            	break;
	            case 1:
	            	RecepcionistaController.salvarRecepcionista();
	                break;
	            case 2:
	            	RecepcionistaController.atualizarRecepcionista();
	                break;
	            case 3:
	            	RecepcionistaController.buscarRecepcionista();
	                break;
	            case 4:
	            	RecepcionistaController.listarTodosRecepcionistas();
	                break;
	            case 5:
	            	RecepcionistaController.apagarRecepcionista();
	                break;
	            default:
	                System.out.println("\n Opcao invalida!\n Digite novamente");
	                break;
	        }
		} while (option != 0);
	}
	
	public static void cadastroPaciente() throws SQLException {
		int option;
		do{
			System.out.println("\n---------- Cadastro de pacientes ----------");
			System.out.println(" 0 - Voltar ao menu de cadastros");
			System.out.println(" 1 - Cadastrar paciente");
			System.out.println(" 2 - Atualizar paciente");
			System.out.println(" 3 - Buscar paciente");
			System.out.println(" 4 - Listar todos os pacientes");
			System.out.println(" 5 - Remover paciente");
			System.out.print(" Opcao desejada: ");
			option = entrada.nextInt();
			entrada.nextLine();
	        switch (option) {
	            case 0:
	            	break;
	            case 1:
	            	PacienteController.salvarPaciente();
	                break;
	            case 2:
	            	PacienteController.atualizarPaciente();
	                break;
	            case 3:
	            	PacienteController.buscarPaciente();
	                break;
	            case 4:
	            	PacienteController.listarTodosPacientes();
	                break;
	            case 5:
	            	PacienteController.apagarPaciente();
	                break;
	            default:
	                System.out.println("\n Opcao invalida!\n Digite novamente");
	                break;
	        }
		} while (option != 0);
	}
	
	public static void cadastroConsulta() throws SQLException {
		int option;
		do{
			System.out.println("\n---------- Cadastro de Consulta ----------");
			System.out.println(" 0 - Voltar ao menu de cadastros");
			System.out.println(" 1 - Cadastrar consulta");
			System.out.println(" 2 - Listar todas as consultas");
			System.out.print(" Opcao desejada: ");
			option = entrada.nextInt();
			entrada.nextLine();
	        switch (option) {
	            case 0:
	            	break;
	            case 1:
	            	ConsultaController.salvarConsulta();
	                break;
	            case 2:
	            	ConsultaController.listarTodasConsultas();
	                break;
	            default:
	                System.out.println("\n Opcao invalida!\n Digite novamente");
	                break;
	        }
		} while (option != 0);
	}
	
	public static void cadastroExame() throws SQLException {
		int option;
		do{
			System.out.println("\n---------- Cadastro de Exame ----------");
			System.out.println(" 0 - Voltar ao menu de cadastros");
			System.out.println(" 1 - Cadastrar exame");
			System.out.println(" 2 - Listar todos os exames");
			System.out.print(" Opcao desejada: ");
			option = entrada.nextInt();
			entrada.nextLine();
	        switch (option) {
	            case 0:
	            	break;
	            case 1:
	            	ExameController.salvarExame();
	                break;
	            case 2:
	            	ExameController.listarTodosExames();
	                break;
	            default:
	                System.out.println("\n Opcao invalida!\n Digite novamente");
	                break;
	           }
		} while (option != 0);
	}
	
	public static void gestao(){
		int option;
		do{
			System.out.println("\n---------- Cadastro Gestao ----------");
			System.out.println(" 0 - Voltar ao menu principal");
			System.out.println(" 1 - Cadastrar lixo");
			System.out.println(" 2 - Cadastrar ambiente");
			System.out.println(" 3 - Cadastrar consumo");
			System.out.println(" 4 - Cadastrar manutencao");
			System.out.println(" 5 - Cadastrar estacionamento");
			System.out.println(" 6 - Cadastrar correio");
			System.out.println(" 7 - Cadastrar limpeza");
			System.out.println(" 8 - Listagem Gestao");
			System.out.print(" Opcao desejada: ");
			option = entrada.nextInt();
			entrada.nextLine();
	        switch (option) {
	            case 0:
	            	break;
	            case 1:
	            	LixoController.salvarLixo();
	                break;
	            case 2:
	            	AmbienteController.salvarAmbiente();
	                break;
	            case 3:
	            	ConsumoController.salvarConsumo();
	                break;
	            case 4:
	            	ManutencaoController.salvarManutencao();
	            	break;
	            case 5:
	            	EstacionamentoController.salvarEstacionamento();
	                break;
	            case 6:
	            	CorreioController.salvarCorreio();
	                break;
	            case 7:
	            	LimpezaController.salvarLimpeza();
	                break;
	            case 8:
	            	listarGestao();
	            	break;
	            default:
	                System.out.println("\n Opcao invalida!\n Digite novamente");
	                break;
	        }
		} while (option != 0);
	}	
	
	public static void listarGestao(){
		int option;
		do{
			System.out.println("\n---------- Listar Gestao ----------");
			System.out.println(" 0 - Voltar ao menu de gestao");
			System.out.println(" 1 - Listar lixo");
			System.out.println(" 2 - Listar ambiente");
			System.out.println(" 3 - Listar consumo");
			System.out.println(" 4 - Listar manuntecao");
			System.out.println(" 5 - Listar estacionamento");
			System.out.println(" 6 - Listar correio");
			System.out.println(" 7 - Listar limpeza");
			System.out.print(" Opcao desejada: ");
			option = entrada.nextInt();
			entrada.nextLine();
	        switch (option) {
	            case 0:
	            	break;
	            case 1:
	            	LixoController.listarTodosLixos();
	                break;
	            case 2:
	            	AmbienteController.listarTodosAmbientes();
	                break;
	            case 3:
	            	ConsumoController.listarTodosConsumos();
	            	break;
	            case 4:
	            	ManutencaoController.listarTodasManutencoes();
	                break;
	            case 5:
	            	EstacionamentoController.listarTodosEstacionamentos();
	                break;
	            case 6:
	            	CorreioController.listarTodosCorreios();
	                break;
	            case 7:
	            	LimpezaController.listarTodasLimpezas();
	            	break;
	            default:
	                System.out.println("\n Opcao invalida!\n Digite novamente");
	                break;
	        }
		} while (option != 0);
	}
}