package aula_01;

import java.text.DecimalFormat;

public class Variaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df= new DecimalFormat("###.##");
		int numero = 10;
		String nome = "Isaac";
		double area = 123.566994;
		
		System.out.println("Participante: "+nome);
		System.out.println("idade do participante: "+numero);
		System.out.printf("Area do local: "+df.format(area));

	}

}
