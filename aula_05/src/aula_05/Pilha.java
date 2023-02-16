package aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {


	Stack<String> pilha = new Stack<String>();
		
		pilha.add("Rony");
		pilha.add("Lucas");
		pilha.add("Isaac");
		pilha.add("Fernando");
		pilha.add("Laise");
		pilha.add("Elizangela");
		
		
		
		for(var elem : pilha) {
			System.out.println(elem);
		}
		
		System.out.println("Remover elemento");
		
		pilha.pop();

		for(var elem : pilha) {
			System.out.println(elem);
		}
		
		System.out.println(pilha.peek());

	}

}
