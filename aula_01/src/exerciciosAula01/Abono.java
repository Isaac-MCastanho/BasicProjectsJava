package exerciciosAula01;

import java.util.Scanner;

public class Abono {
	Scanner sc=new Scanner(System.in);
	float salario, abono,novoSalario;
	
	public  void init() {
		
		System.out.println("Insira o salario: ");
		salario = sc.nextFloat();
		System.out.println("Insira o abono: ");
		 abono = sc.nextFloat();
		
		novoSalario = salario + abono + 0f;
		
		System.out.printf("Seu novo salario é: %.2f",novoSalario);
		
		
	}
}
