package exerciciosAula02;

import java.util.Scanner;

public class ExercIF02 {
	public void init() {
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número A:");
		num = scan.nextInt();
		
		if(num==0) {
			System.out.printf("O numero %d é nulo.",num);
		return;	
		}
		
		if(num%2!=0) {
			if(num>0)System.out.printf("O numero %d é impar e positivo.", num);
			else System.out.printf("O numero %d é impar e negativo.", num);
		}
		
		if(num%2==0) {
			if(num>0)System.out.printf("O numero %d é par e positivo.", num);
			else System.out.printf("O numero %d é par e negativo.", num);
		}
		
		
		
		
	}
}
