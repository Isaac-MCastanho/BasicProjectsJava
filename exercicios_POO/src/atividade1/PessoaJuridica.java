package atividade1;

public class PessoaJuridica extends Cliente{
	 private String cnpj;

	public PessoaJuridica(long idCliente, String nome, Integer idade, String email, int telefone, String cnpj) {
		super(idCliente, nome, idade, email, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.printf("\n      CNPJ: %s  ",this.cnpj);
	};
}
