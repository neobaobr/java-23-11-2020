
public class Fornecedor extends Pessoa {

	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorDivida = valorDivida;
		this.valorCredito = valorCredito;

	}

	private double valorCredito, valorDivida, saldo;

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double obterSaldo(double valorCredito, double valorDivida) {
		return valorCredito - valorDivida;

	}

	public void PrintF() {
		System.out.println("Função: Fornecedor");
		System.out.println("Valor do Credito: " + getValorCredito());
		System.out.println("Valor da Divida: " + getValorDivida());
		System.out.println("Saldo: " + getSaldo());
	}

}
