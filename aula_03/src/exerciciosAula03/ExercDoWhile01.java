package exerciciosAula03;

import java.util.Scanner;

public class ExercDoWhile01 {
	public void init() {
		int soma = 0;
		boolean breakLoop = false;
		Scanner scan = new Scanner(System.in);

		 do{
			 int num;

			System.out.println("Digite um numero");
			num = scan.nextInt();

			if (num >0 )
				soma+=num;
	
				
			if (num == 0)
				breakLoop = true;
		}while (!breakLoop);

		System.out.printf("A soma dos numeros positivos é %d", soma);
	}

}
