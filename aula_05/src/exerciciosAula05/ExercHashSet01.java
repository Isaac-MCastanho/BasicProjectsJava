package exerciciosAula05;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercHashSet01 {

	
	public void init() {
		
		Set<Integer> lista= new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++  ) {
			int num = i;
			System.out.printf("Digite o valor nº %d\n",++num);
			lista.add(scan.nextInt());
			
		}
		
		System.out.printf("\nDados da lista Set:\n");
		
		Iterator<Integer> iLista = lista.iterator();
		
		
		for(Integer num : lista) {
			System.out.println(num);
			
		}
		
		
	}
	
}
