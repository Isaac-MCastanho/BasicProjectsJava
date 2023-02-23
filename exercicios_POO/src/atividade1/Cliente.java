package atividade1;

public abstract class Cliente {
	long idCliente;
	String nome;
	Integer idade;
	String email;
	int telefone;
	public Cliente(long idCliente, String nome, Integer idade, String email, int telefone) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
	}
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public void visualizar() {
		System.out.println("\n\n*****************************");
		System.out.println("   Informações do cliente:   ");
		System.out.println("*****************************");
		System.out.printf("      Id: %d  ",this.idCliente);
		System.out.printf("\n      Nome: %s  ",this.nome);
		System.out.printf("\n      Idade: %d anos ",this.idade);
		System.out.printf("\n      Email: %s  ",this.email);
		System.out.printf("\n      Telefone: %d  ",this.telefone);
	}
}
