
public class MainAviao {

	public static void main(String[] args) {
		Aviao Cl = new Aviao("Boing 747", "KLM", "KLM8029");

		System.out.println("aeronave: \n " + Cl.getModelo());
		System.out.println("cia aerea: \n" + Cl.getCia());
		System.out.println("cod voo: \n" + Cl.getCdvoo());
		


	}

}
