package eletronico;

public class eletronico {
	private String tipo;
	private String modelo;
	private int bateria;
	private double preco;

	public eletronico(String tipo, String modelo, int bateria, double preco) {
		// TODO Auto-generated constructor stub
		this.tipo=tipo;
		this.modelo=modelo;
		this.bateria=bateria;
		this.preco=preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public void Print() {
		System.out.println("Id do produto: " + getTipo());
		System.out.println("Nome do produto: " + getModelo());
		System.out.println("Quantidade em estoque: " + getBateria());
		System.out.println("Valor do produto: R$" + getPreco());
	}
}
