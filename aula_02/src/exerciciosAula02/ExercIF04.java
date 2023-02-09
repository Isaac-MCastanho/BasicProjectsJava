package exerciciosAula02;

import java.util.Scanner;

public class ExercIF04 {
	public void init() {
		String animal01, animal02,animal03;;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1º animal");
		scan.skip("\\R?");
		animal01 = scan.nextLine();
		
		System.out.println("Digite o 2º animal");
		scan.skip("\\R?");
		animal02 = scan.nextLine();
		
		System.out.println("Digite o 3º animal");
		scan.skip("\\R?");
		animal03 = scan.nextLine();
		
		
		
		if(animal01.equals("vertebrado")) {
			if(animal02.equals("ave")) {
				if(animal03.equals("carnivoro"))System.out.println("aguia");
				else System.out.println("pomba");
			}else {
				if(animal03.equals("onivoro"))System.out.println("homem");
				else System.out.println("vaca");
				
			}
		}else {
			if(animal02.equals("inseto")) {
				if(animal03.equals("carnivoro"))System.out.println("aguia");
				else System.out.println("pomba");
			}else {
				if(animal03.equals("onivoro"))System.out.println("homem");
				else System.out.println("vaca");
				
			}
		}
		
		
		
		
		
		
	}
}
