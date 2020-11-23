
public class Empregado extends Pessoa {

	public Empregado(String nome, String endereco, String telefone, int codigoSetor, int salarioBase, double imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.imposto = imposto;
		this.salarioBase = salarioBase;
	}

	private int codigoSetor, salarioBase;
	double imposto;

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}

	public double calcularSalario(int salarioBase, double imposto) {

		return salarioBase - (salarioBase * imposto);
	}
	
	public void PrintE() {
		System.out.println("Função: Empregado");
		System.out.println("Codigo do Setor: "+getCodigoSetor());
		System.out.println("Salario Base: "+getSalarioBase());
		System.out.println("Impostos: "+ getImposto());
		
	}

	
	}


