
public class Aviao {

	private String modelo;
	private String cia;
	private String cdvoo;

	public Aviao(String model, String ciaa, String cdvoo1) {

		modelo = model;
		cia = ciaa;
		cdvoo = cdvoo1;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCdvoo() {
		return cdvoo;
	}

	public void setCdvoo(String cdvoo) {
		this.cdvoo = cdvoo;
	}

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	
	
}