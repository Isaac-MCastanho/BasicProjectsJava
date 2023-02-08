package exerciciosAula01;

import java.util.Scanner;

public class SalarioLiquido {
	Scanner scan = new Scanner(System.in);
	float salarioB, addNoturno, HrExtras, desc,salarioL;
	
	public void init() {
		
		System.out.println("Insira seu salario bruto:");
		salarioB = scan.nextFloat();
		
		System.out.println("Insira seu adicional noturno:");
		addNoturno = scan.nextFloat();
		
		System.out.println("Insira suas horas extras:");
		HrExtras = scan.nextFloat();
		
		System.out.println("Insira seus descontos:");
		desc = scan.nextFloat();
		
		salarioL = salarioB + addNoturno + (HrExtras * 5) - desc;
		
		System.out.printf("Seu salario liquido é: %.2f",salarioL);
	}

}
