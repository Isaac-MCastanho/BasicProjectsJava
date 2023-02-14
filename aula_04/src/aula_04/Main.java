package aula_04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vet[]= new int[5] ;
		int num;
		
		//System.out.println("Digite o numero a ser encontrado:");
		//num= scan.nextInt();
		
		for(int v : vet)
			vet[v] = scan.nextInt();
		
		
		for(int v : vet)
			System.out.println(v);
		
		
		//System.out.println(Arrays.toString(vet));
		Arrays.sort(vet);
		
		
		//System.out.println(Arrays.toString(vet));
		

	}

}
