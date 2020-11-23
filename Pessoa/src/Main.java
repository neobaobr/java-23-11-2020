
public class Main {

	public static void main(String[] args) {
		Pessoa Pe = new Pessoa(null, null, null);

		Operario Op = new Operario("marcio", "92102321", "rua triste", 1000.00, 800.00);

		Administrador Ad = new Administrador("joao", "9929102", "rua feliz", 10000);

		Vendedor Ve = new Vendedor("joaquina", "91820100", "rua lafaiete", 100.00, 101.00);

		Empregado Em = new Empregado("juan", "9102020", "rua dr osiris", 1000, 30, 0.3);

		Fornecedor Fo = new Fornecedor("vitor", "92012221", "rua das liuzes", 20, 10);
		
		
		
		Fo.obterSaldo(20, 10);
		Fo.PrintP();
		Fo.PrintF();
		
		
		Em.calcularSalario(200, 0.3);
		Em.PrintP();
		Em.PrintE();
		
		
		Ad.setAjudaDeCusto(100);
		Ad.PrintP();
		Ad.PrintA();

	}

}
