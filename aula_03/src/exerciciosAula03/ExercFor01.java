package exerciciosAula03;

import java.util.Scanner;

public class ExercFor01 {
	public void init() {
		int num1, num2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o 1º valor do intervalo:");
		num1 = scan.nextInt();

		System.out.println("Digite o 2º valor do intervalo:");
		num2 = scan.nextInt();

		if (num1 >= num2) {
			System.out.println("O 1º numero tem que ser menor que o 2º valor do intervalo!");
			return;
		}
		if (num1 <= 0 || num2 <= 0) {
			System.out.println("Os numeros do intervalo não podem ser 0 ou negativos");
			return;
		}

		for(int num = num1; num <= num2; num++) {
			if(num % 5 == 0 && num % 3 == 0)
			System.out.printf("%d é multiplo de 3 e 5\n", num);
		}
	}

}
