package exerciciosAula05;

import java.util.Scanner;
import java.util.Stack;

public class ExercStack {

	public void init() {

		Stack<String> lista = new Stack<String>();
		Scanner scan = new Scanner(System.in);
		boolean goBack = false;
		int option;

		do {
			System.out.println("	1 - Adicionar livro na pilha");
			System.out.println("	2 - Listar todos os livros da pilha");
			System.out.println("	3 - Retirar livro da pilha");
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

				System.out.println("Digite o nome do livro:");
				scan.skip("\\R?");
				lista.add(scan.nextLine());
				System.out.println("Livro cadastrado!\n");
				break;
			}
			case 2: {
				if (lista.isEmpty())
					System.out.println("Pilha de livros está vazia!\n");
				else
					System.out.println("Todos os livros cadastrados:");
				for (String nome : lista) {
					System.out.println("- "+nome);
				}
				break;
			}
			case 3: {
				if(lista.isEmpty()) {
					System.out.println("Pilha de livros está vazia!\n");
					break;
				}
					
				String conf;
				System.out.printf("Tem certeza que deseja retirar %s da pilha?(S/N)\n", lista.lastElement());
				scan.skip("\\R?");
				conf = scan.nextLine();
				if (conf.equalsIgnoreCase("s") || conf.equalsIgnoreCase("sim")) {
					String  elem= lista.lastElement();

					lista.pop();
					System.out.printf("Livro %s removido com sucesso!\n", elem);
				} else {
					System.out.printf("Livro não foi removido!\n");

				}

				break;
			}

			}

		} while (goBack == false);

		scan.close();
	}

}
