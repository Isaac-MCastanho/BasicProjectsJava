package atividade2;

public class Funcionario {
	long idFuncionario;
	String nome;
	String rg;
	String cpf;
	Double salario;
	
	

	public Funcionario(long idFuncionario, String nome, String rg, String cpf, Double salario) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.salario = salario;
	}



	public long getIdFuncionario() {
		return idFuncionario;
	}



	public void setIdFuncionario(long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public Double getSalario() {
		return salario;
	}



	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void visualizar() {
		System.out.println("*****************************");
		System.out.println("   Informações do funcionario:   ");
		System.out.println("*****************************");
		System.out.printf("   IdFuncionario: %d  ",this.idFuncionario);
		System.out.printf("\n            Nome: %s  ",this.nome);
		System.out.printf("\n              RG: %s  ",this.rg);
		System.out.printf("\n             CPF: %s  ",this.cpf);
		System.out.printf("\n         Salario: R$ %.2f  \n\n",this.salario);
	}
}
