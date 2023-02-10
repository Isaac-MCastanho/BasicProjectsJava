package aula_03;

import java.util.Scanner;

public class TabuadaV2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		boolean ok = false;
		String continua;

		do {
			do {
				System.out.println("Digite a tabuada que você deseja calcular:");
				numero = scan.nextInt();
				if (numero < 1 || numero > 10)
					System.out.println("Digite um numero entre 1 e 10");
				else
					ok = true;

			} while (ok == false);
			
			int num = 1;
			while ( num <= 10) {
				System.out.printf("%d x %d = %d\n", numero, num, (numero * num));
				num++;

			}

			System.out.println("Deseja continuar(S/N)?");
			scan.skip("\\R?");
			continua = scan.nextLine();
			ok = false;

		} while (continua.equalsIgnoreCase("S"));

		scan.close();
	}

}
