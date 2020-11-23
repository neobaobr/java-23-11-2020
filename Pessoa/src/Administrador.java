
public class Administrador extends Pessoa {

	private int ajudaDeCusto;
	public Administrador(String nome, String endereco, String telefone, int ajudaDeCusto) {
	super(nome, endereco, telefone);
		this.ajudaDeCusto=ajudaDeCusto;
	}

	

	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public void PrintA() {
		System.out.println("Função: Administrador");
		System.out.println("Ajuda de Custos: " + getAjudaDeCusto());
	}
}
