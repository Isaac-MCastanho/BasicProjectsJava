package atividade1;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica f1 = new PessoaFisica(1,"isaac",80,"xaolinMatadorDePorco@gmail.com",956231854,"222.222.22-22");
		PessoaFisica f2 = new PessoaFisica(2,"Alguem",10,"Nada@gmail.com",956881854,"333.333.333-33");
		
		f1.visualizar();
		f2.visualizar();
		
		PessoaJuridica j1 = new PessoaJuridica(3,"Meta",15,"markinho@gmail.com",956231854,"55. 555. 555/0001-55");
		PessoaJuridica j2 = new PessoaJuridica(4,"Amazon",22,"armazem@gmail.com",956881854,"88. 888. 888/0001-88");
		
		j1.visualizar();
		j2.visualizar();
	}

}
