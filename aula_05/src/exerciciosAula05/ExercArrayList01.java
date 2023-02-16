package exerciciosAula05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercArrayList01 {

	
	public void init() {
		
		ArrayList<String> lista= new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++  ) {
			int num = i;
			System.out.printf("Digite a cor nº %d\n",++num);
			scan.skip("\\R?");
			lista.add(scan.nextLine());
			
		}
		
		System.out.printf("\nCores digitadas:\n");
		for(String cor : lista) {
			System.out.println(cor);
			
		}
		Collections.sort(lista);
		System.out.printf("\nCores ordenadas:\n");
		for(String cor : lista) {
			System.out.println(cor);
			
		}
	}
	
}
