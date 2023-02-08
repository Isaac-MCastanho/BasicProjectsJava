package exerciciosAula01;

import java.util.Scanner;

public class NotaParticipante {
	Scanner scan = new Scanner(System.in);
	float nota1, nota2, nota3, nota4, media;
	
	public void init() {
		System.out.println("Insira a primeira nota: ");
		nota1 = scan.nextFloat();
				
		System.out.println("Insira a segunda nota: ");
		nota2 = scan.nextFloat();
		
		System.out.println("Insira a terceira nota: ");
		nota3 = scan.nextFloat();
		
		System.out.println("Insira a quarta nota: ");
		nota4 = scan.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.printf("Sua nota é: %.2f", media);
	}
}
