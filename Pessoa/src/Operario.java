
public class Operario extends Pessoa {

	public Operario(String nome, String endereco, String telefone, double valorDeProducao, double comissao) {
		super(nome, endereco, telefone);
		this.comissao = comissao;
		this.valorDeProducao = valorDeProducao;
	}

	private double valorDeProducao, comissao;

	public double getValorDeProducao() {
		return valorDeProducao;
	}

	public void setValorDeProducao(double valorDeProducao) {
		this.valorDeProducao = valorDeProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public void PrintO() {
		System.out.println("Função: Operario");
		System.out.println("Valor da Produção: " + getValorDeProducao());
		System.out.println("Comissão: " + getComissao());

	}
}
