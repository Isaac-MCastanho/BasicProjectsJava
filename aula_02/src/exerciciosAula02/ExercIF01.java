package exerciciosAula02;

import java.util.Scanner;

public class ExercIF01 {
	public void init() {
		float numA, numB, numC;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número A:");
		numA = scan.nextFloat();
		
		System.out.println("Digite o número B:");
		numB = scan.nextFloat();
		
		System.out.println("Digite o número C:");
		numC = scan.nextFloat();
		
		if((numA +numB)>numC)System.out.printf("A soma dos numero %.2f + %.2f é maior que %.2f",numA,numB,numC);
		if((numA +numB)<numC)System.out.printf("A soma dos numero %.2f + %.2f é menor que %.2f",numA,numB,numC);
		if((numA +numB)==numC)System.out.printf("A soma dos numero %.2f + %.2f é igual a %.2f",numA,numB,numC);
		
		
		
	}
}
