package Model;

public class Agencia {

	private String nome;
	private int numero;
	private String telefone;
	private String email;
	private Endereco end;
	static int numContas = 0;

	public Agencia(String nome, int numero, String telefone, String email, Endereco end) {
		this.nome = nome;
		this.numero = numero;
		this.telefone = telefone;
		this.email = email;
		this.end = end;
	}

	public Agencia() {
		super();
	}

	public Agencia(String nome, int numero, String email) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public int getNumero() {
		return numero;
	}
	
	public String toString() {
		return this.nome + ", Nº " + this.numero + "\n"
				+ "Telefone: " + this.telefone + "\n" + 
				"E-mail: " + this.email + "\n" + 
				"Endereço: " + this.end;
	}

}
