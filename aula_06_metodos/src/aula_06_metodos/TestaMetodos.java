package aula_06_metodos;
package static aula_06_metodos.pacote2.Classe2.*;


public class TestaMetodos {

	public static void main(String[] args) {
		
		metodoPublic();
		metodoPadrao();
		metodoProtegido();
		metodoPrivado() ;
		System.out.println(soma(10,2));
		
		Classe1.metodoPublico1();
		Classe1.metodoFriendly1();
		Classe1.metodoProtegido1();
		
		metodoPublicoPacote1();

	}
	
	public static void metodoPublic() {
		System.out.println("Eu sou um metodo publico");
	}
	public static int soma(int num1,int num2) {
		return num1+num2;
	}
	
	static void metodoPadrao() {
		System.out.println("Eu sou um Método Friendly!");
	}
	
	protected static void metodoProtegido() {
		System.out.println("Eu sou um Método Protegido!");
	}
	
	private static void metodoPrivado() {
		System.out.println("Eu sou um Método Privado!");
	}


}
