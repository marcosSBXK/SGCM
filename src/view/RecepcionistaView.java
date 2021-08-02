package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Recepcionista;

public class RecepcionistaView {
	static Scanner entra = new Scanner(System.in);
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
	
	public static int getIdRecepcionista() {
		System.out.print(" Digite o codigo do funcionario: ");
		int codFunc = entra.nextInt();
		return codFunc;
	}
	
	public static Recepcionista salvarRecepcionista() {
		String nome, senha;
		System.out.println("\n Cadastrar recepcionista:");
		System.out.print(" Nome: ");
		nome = entra.nextLine();
		System.out.print(" Senha: ");
		senha = entra.nextLine();
		Recepcionista recepcionista = new Recepcionista(nome, senha);
		return recepcionista;
	}
	
	public static void exibirRecepcionista(Recepcionista recepcionista) {
        System.out.println("\n\t\t         Recepcionista");
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tCod. Recepcionista\t Nome");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("\t\t%d\t\t%-20.20s\n",
                recepcionista.getIdRecepcionista(), recepcionista.getNomeRecepcionista());
    }

    public static void listarTodosRecepcionistas(ArrayList<Recepcionista> lista) {
        System.out.println("\n\t\t Listagem de recepcionista");
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tCod. Recepcionista\t Nome");
        System.out.println("-------------------------------------------------------------");
        for(int i=0; i<lista.size(); i++){
            Recepcionista recepcionista = lista.get(i);
            System.out.printf("\t\t%d\t\t%-20.20s\n",
                    recepcionista.getIdRecepcionista(), recepcionista.getNomeRecepcionista());
        }
    }
	
	public static Recepcionista atualizarRecepcionista() {
		int idRecep;
		String nome;
		String senha;
		System.out.println("\n Atualizar recepcionista:");
		System.out.print(" Codigo: ");
		idRecep = entra.nextInt();
		clearBuffer(entra);
		System.out.print(" Nome: ");
		nome = entra.nextLine();
		System.out.print(" Senha: ");
		senha = entra.nextLine();
		Recepcionista recepcionista = new Recepcionista(idRecep, nome, senha);
		return recepcionista;
	}
	
	public static boolean loginRecepcionista(ArrayList<Recepcionista> lista) {
		boolean status = false;
		boolean flag = false;
		int idRecep;
		String senha;
		try {
			do {
				System.out.println("\n--------------------- Login de recepcionista ----------------------");
				System.out.print(" Digite o codigo/ID do recepcionista ou 0 para sair: ");
				idRecep = entra.nextInt();
				clearBuffer(entra);
				if (idRecep == 0) {
					System.out.println("\n Fim da sessao!");
					System.exit(0);
				}
				Recepcionista r = new Recepcionista(lista.get(idRecep-1));
				if (r.getIdRecepcionista() == idRecep) {
					flag = true;
					do {
						System.out.print(" Senha: ");
						senha = entra.nextLine();
						if (r.getSenhaRecepcionista().equals(senha)) {
							status = true;
						}
						else {
							System.out.println(" Senha incorreta!");
						}
					} while (!status);
				}
				else {
				    System.out.println(" Codigo invalido!");
				}
			} while (!flag);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}