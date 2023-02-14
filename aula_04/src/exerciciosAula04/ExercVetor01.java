package exerciciosAula04;

import java.util.Arrays;
import java.util.Scanner;

public class ExercVetor01 {
 public void init() {
	 
	 int vet[] = {10,2,3,45,78,98,1,11,22};
	 int num;
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Digite valor a ser encontrado:");
	 num = scan.nextInt();
	 
	 
	 
	
	 
	 for(int i = 0 ; i < vet.length; i++)
		 if(vet[i] == num) {
			 System.out.printf("O numero %d está localizado na posição: %d",num,i);
			 return;
		 }
		 else if((vet.length -1 == i) && (  vet[i] != num))
			 System.out.printf("O valor não foi encontrado!");
			 
	
 }
}
