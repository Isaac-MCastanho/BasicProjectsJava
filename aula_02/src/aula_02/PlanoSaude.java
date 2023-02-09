package aula_02;

import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {
		int idade;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite a sua faixa etaria:");
		idade = scan.nextInt();
		
		/*if(idade < 0)System.out.println("Idade menor que 0");
		
		if( idade <= 10)System.out.println("O plano de saude é R$ 100,00");
		if(idade > 10 && idade <=29)System.out.println("O plano de saude é R$ 200,00");
		if(idade > 29 && idade <= 45)System.out.println("O plano de saude é R$ 300,00");
		if(idade > 45 && idade <= 59)System.out.println("O plano de saude é R$ 500,00");
		if(idade > 59 && idade <= 65)System.out.println("O plano de saude é R$ 600,00");
		if(idade > 65)System.out.println("O plano de saude é R$ 1000,00");*/
		
		

		
		switch(idade) {
		case 1:
			System.out.println("O plano de saude é R$ 100,00");
			break;
		case 2:
			System.out.println("O plano de saude é R$ 200,00");
			break;
		case 3:
			System.out.println("O plano de saude é R$ 300,00");
			break;
		case 4:
			System.out.println("O plano de saude é R$ 500,00");
			break;
		case 5:
			System.out.println("O plano de saude é R$ 600,00");
			break;
		case 6:
			System.out.println("O plano de saude é R$ 1000,00");
			break;
		
		default:
			System.out.println("Faixa etaria invalida!");
			
		}
		

	}

}
