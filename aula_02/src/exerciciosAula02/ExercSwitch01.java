package exerciciosAula02;

import java.util.Scanner;

public class ExercSwitch01 {
	public void init() {
		
		Scanner scan = new Scanner(System.in);
		
		int codProduto, qtProduto;
		float preco;
		
		System.out.println("\t\tTabela de produtos:\n");
		System.out.println("Codigo prod. \t Nome prod. \t\t Preço prod.");
		System.out.println("1 \t\t Cachorro Quente \t R$ 10.00");
		System.out.println("2 \t\t X-Salada \t\t R$ 15.00");
		System.out.println("3 \t\t X-Bacon  \t\t R$ 18.00");
		System.out.println("4 \t\t Bauru    \t\t R$ 12.00");
		System.out.println("5 \t\t Refrigerante    \t R$  8.00");
		System.out.println("6 \t\t Suco de laranja \t R$ 13.00");
		
		System.out.println("Qual o codigo do produto desejado?");
		codProduto = scan.nextInt();		
		System.out.println("Qual a quantidade desejada?");
		qtProduto = scan.nextInt();	
		
		switch (codProduto) {
		case 1:
			preco = qtProduto * 10f;
			System.out.printf("Total a pagar R$ %.2f",preco);
			break;
		case 2:
			preco = qtProduto * 15f;
			System.out.printf("Total a pagar R$ %.2f",preco);
			break;
		case 3:
			preco = qtProduto * 18f;
			System.out.printf("Total a pagar R$ %.2f",preco);
			break;
		case 4:
			preco = qtProduto * 12f;
			System.out.printf("Total a pagar R$ %.2f",preco);
			break;
		case 5:
			preco = qtProduto * 8f;
			System.out.printf("Total a pagar R$ %.2f",preco);
			break;
		case 6:
			preco = qtProduto * 13f;
			System.out.printf("Total a pagar R$ %.2f",preco);
			break;
		default:
		
			System.out.printf("TCodigo invalido!");
			
		}
	}
}
