package Aula_08;

public class Triatleta extends Pessoa implements Ciclista, Nadador,Corredor {

	public Triatleta(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo!");
		
	}

	@Override
	public void correr() {
		System.out.println("Correndo!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nadar() {
		System.out.println("Nadando!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pedalar() {
		System.out.println("Pedalando!");
		// TODO Auto-generated method stub
		
	}

}
