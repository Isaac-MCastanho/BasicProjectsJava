package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLista {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Double> notas=new ArrayList<Double>();
		int op = 0;
		double nota=0.0;
		
		do {
			System.out.println("1 - Cadastrar nota");
			System.out.println("2 - Listar notas");
			System.out.println("Digite uma opção");
			op = scan.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Digite uma nota entre 0 e 10");
				nota = scan.nextDouble();
				notas.add(nota);
				break;
			case 2:
				System.out.println("Lista de notas");
				for(var listaNota : notas) {
					System.out.println(listaNota);
				}
				break;
				
			}
			
			
		}while(op != 6);
		
		
		
	}

}
