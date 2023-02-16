package exerciciosAula05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercQueue {

	public void init() {

		Queue<String> lista = new LinkedList<String>();
		Scanner scan = new Scanner(System.in);
		boolean goBack = false;
		int option;

		do {
			System.out.println("	1 - Adicionar Cliente na fila");
			System.out.println("	2 - Listar todos os Cliente da fila");
			System.out.println("	3 - Retirar Cliente da fila");
			System.out.println("	0 - Sair");

			System.out.println("Entre com a opção desejada:");
			option = scan.nextInt();

			switch (option) {
			case 0: {
				goBack = true;
				System.out.println("Sistema encerrado!");
				break;
			}
			case 1: {

				System.out.println("Digite o nome do cliente:");
				scan.skip("\\R?");
				lista.add(scan.nextLine());
				System.out.println("Cliente cadastrado!\n");
				break;
			}
			case 2: {
				if (lista.isEmpty())
					System.out.println("Fila de clientes está vazia!\n");
				else
					System.out.println("Todos os clientes cadastrados:");
				for (String nome : lista) {
					System.out.println(nome);
				}
				break;
			}
			case 3: {
				if(lista.isEmpty()) {
					System.out.println("Fila de clientes está vazia!\n");
					break;
				}
					
				String conf;
				System.out.printf("Tem certeza que deseja retirar %s da fila?(S/N)\n", lista.element());
				scan.skip("\\R?");
				conf = scan.nextLine();
				if (conf.equalsIgnoreCase("s") || conf.equalsIgnoreCase("sim")) {
					String  elem= lista.element();

					lista.remove();
					System.out.printf("Cliente %s removido com sucesso!\n", elem);
				} else {
					System.out.printf("Cliente não foi removido!\n");

				}

				break;
			}

			}

		} while (goBack == false);

		scan.close();
	}

}
