package cliente;

public class Cliente {

	private String nome;
	private String sexo;
	private String idade;
	private String conta;
	private String tipo;


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Cliente(String primeiroNome, String sexo1, String idade2, String conta3, String tipo4) {

		nome = primeiroNome;
		sexo = sexo1;
		idade = idade2;
		conta = conta3;
		tipo = tipo4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

}
