package atividade1;

public class PessoaFisica extends Cliente {
 private String cpf;

public PessoaFisica(long idCliente, String nome, Integer idade, String email, int telefone, String cpf) {
	super(idCliente, nome, idade, email, telefone);
	this.cpf = cpf;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public void visualizar() {
	super.visualizar();
	System.out.printf("\n      CPF: %s  ",this.cpf);
};
}
