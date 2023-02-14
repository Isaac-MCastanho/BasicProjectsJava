package exerciciosAula04;

import java.util.Arrays;
import java.util.Scanner;

public class ExercMatriz01 {
 public void init() {
	 
	 int vet[][]= new int[3][3];
	 int soma1 = 0, soma2 = 0;

	 Scanner scan = new Scanner(System.in);
	 
	 for(int linha = 0 ; linha < vet.length; linha++) {
		 for(int col = 0 ; col < vet.length; col++) {
			 System.out.printf("Digite valor da linha %d coluna %d\n",linha,col);
		 vet[linha][col] = scan.nextInt();
				 
		 } 
	 }
	 
	 System.out.printf("Elementos da Diagonal Principal:\n");
	 for(int linha = 0 ; linha < vet.length; linha++) {
		
		 for(int col = 0 ; col < vet.length; col++) {
			if(vet[linha][linha] == vet[linha][col]) {
				System.out.print(vet[linha][col]);
				soma1 +=  vet[linha][col];
			}
			 
		 } 
	 }
	 
	 System.out.printf("\nElementos da Diagonal Secundária:\n");
	 for(int linha = 0 ; linha < vet.length; linha++) {
		 int index = vet.length -1 -linha;
		 for(int col = 0 ; col < vet.length; col++) {
			 if(vet[linha][index] == vet[linha][col]) {
				 System.out.print(vet[linha][col]);
				 soma2 +=  vet[linha][col];
			 }
			 
		 } 
		 
		 index--;
	 }
	 System.out.printf("\nSoma dos Elementos da Diagonal Principal::\n");
	 System.out.println(soma1);
	 System.out.printf("Soma dos Elementos da Diagonal Secundária::\n");
	 System.out.println(soma2);
		
 }
}
