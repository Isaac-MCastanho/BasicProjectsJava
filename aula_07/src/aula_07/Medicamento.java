package aula_07;

public class Medicamento extends Farmacia {

	private String principioAtivo;

	public Medicamento(long id, String nome, String nomeComercial, String fabricante, String foto, float preco,
			String principioAtivo) {
		super(id, nome, nomeComercial, fabricante, foto, preco);
		this.principioAtivo = principioAtivo;
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}

	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	
	public void visualizar() {
		super.visualizar();
		
		System.out.printf("\n Principio At.: R$ %d  \n\n",this.principioAtivo);
	}
}
