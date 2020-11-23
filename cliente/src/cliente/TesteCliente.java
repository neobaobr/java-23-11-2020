package cliente;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente Cl = new Cliente("Pedro", "Masc", "21", "1245", "corrente");

		System.out.println("conta: \n " + Cl.getConta());
		System.out.println("sexo: \n" + Cl.getSexo());
		System.out.println("tipo de conta: \n" + Cl.getTipo());
		System.out.println("nome do cliente: \n" + Cl.getNome());
		System.out.println("idade: \n " + Cl.getIdade());

	}

}
