package exerciciosAula03;

import java.util.Scanner;

public class ExercWhile01 {
	public void init() {
		int maior50 = 0, menor21 = 0;
		boolean breakLoop = false;
		Scanner scan = new Scanner(System.in);

		while (!breakLoop) {
			int idade;

			System.out.println("Digite uma idade:");
			idade = scan.nextInt();

			if (idade < 21 && idade > 0)
				menor21++;
			else if (idade > 50)
				maior50++;
			if (idade == 0)
				System.out.println("Idade 0 é desconsiderada!");
				
			if (idade < 0)
				breakLoop = true;
		}

		System.out.printf("Total de pessoas menores de 21 anos: %d\n", menor21);
		System.out.printf("Total de pessoas maiores de 50 anos: %d", maior50);
	}

}
