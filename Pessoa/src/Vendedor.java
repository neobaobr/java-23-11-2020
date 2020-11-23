
public class Vendedor extends Pessoa {

	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comissao) {
		super(nome, endereco, telefone);
		this.comissao = comissao;
		this.valorVendas = valorVendas;
	}

	private double valorVendas, comissao;

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public void PrintV() {
		System.out.println("Função: Vendedor");
		System.out.println("Valor do Credito: " + getValorVendas());
		System.out.println("Comissão: " + getComissao());

	}
}
