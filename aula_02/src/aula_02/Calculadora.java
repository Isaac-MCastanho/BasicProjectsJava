package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();

		double n1, n2;

		System.out.println("Digite o 1º numero: ");
		n1 = scan.nextDouble();
		System.out.println("Digite o 2º numero: ");
		n2 = scan.nextDouble();

		System.out.printf("O numero %.2f elevado ao numero %.2f é %.2f ", n1, n2, Math.sqrt(n1));

		scan.close();
	}

}
