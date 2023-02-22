package calculadora;

import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int opcao;
		double num1, num2;
		
		
		while(true) {
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("Digite o numero da operação");
		opcao = scan.nextInt();
		if(opcao == 0) {
			scan.close();
			System.exit(0);
		}
		
		System.out.println("Digite o primeiro numero");
		num1 = scan.nextDouble();
		System.out.println("Digite o segundo numero");
		num2 = scan.nextDouble();

		Calculos calc = new Calculos();
		
		switch(opcao) {
		case 1 ->System.out.println("Soma: "+calc.soma(num1,num2));
		case 2 ->System.out.println("Subtração: "+calc.subtracao(num1,num2));
		case 3 ->System.out.println("Multiplicação: "+calc.multiplicacao(num1,num2));
		case 4 ->System.out.println("Divisão: "+calc.divisao(num1,num2));
		default ->System.out.println("Opcão invalida ");
		}
		
		
		}
	}

}
