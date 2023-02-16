import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		 int vet[] = new int[9];
		 int t;
		 int indice=0;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Digite valor a ser encontrado:");
		 t = scan.nextInt();

		 /*
		 for(int i = 0 ; i < vet.length; i++) {
			 
			 if(indice == t) {
				indice=0;
				vet[i]=indice;
				indice++;
			 }else {
				 vet[i]=indice;
				 indice++;
				;
			 }
		 }
		 
		 for(int i = 0 ; i < vet.length; i++) {
			 System.out.printf("N[%d] = %d\n",i,vet[i]);
			
		 }
			*/
		
		init(t);
		

	}
	
	
	public static void init(int num) {
		if(num <= 20) {
			int log = num;
		init(++log);
		System.out.printf("Init %d\n", num);
		}
	}

}
