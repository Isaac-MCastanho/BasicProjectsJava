package exerciciosAula02;

import java.util.Scanner;

public class ExercIF03 {
	public void init() {
		Scanner scan = new Scanner(System.in);
		
		int idade;
		String nome;
		boolean primeira;
		
		System.out.println("Digite o Nome:");
		scan.skip("\\R?");
		nome=scan.nextLine();
		
		
		System.out.println("Digite a idade:");
		idade=scan.nextInt();
		
		
		System.out.println("Primeira doação?");
		primeira=scan.nextBoolean();
		
		
		if(idade >= 60 && idade <= 69) {
			if(primeira)
				System.out.println("Não está apto para doar!");
			else
				System.out.println("Está apto para doar!");
				
		}else if (idade < 18 || idade > 69)
			System.out.println("Não está apto para doar!");
		else 
			System.out.println("Está apto para doar!");
			
	}
}
