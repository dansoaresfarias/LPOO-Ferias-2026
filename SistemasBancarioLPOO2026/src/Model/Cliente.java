package Model;

import java.util.Date;

public class Cliente {

	private String nome;
	private String cpf;
	private Date dataNasc;
	private int rg;
	private String email;
	private String telefone;
	private Endereco end;

	public Cliente(String nome, String cpf, Date dataNasc, int rg, String email, String telefone, Endereco end) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.rg = rg;
		this.email = email;
		this.telefone = telefone;
		this.end = end;
	}

	public Cliente(String nome, String cpf, Date dataNasc, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.email = email;
	}

	public Cliente() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public int getRg() {
		return rg;
	}
	
	public String toString() {
		return this.nome + ", de CPF " + this.cpf + "\n"
				+ "Data Nascimento: " + this.dataNasc.getDate() + "/" + 
				this.dataNasc.getMonth() + "/" + this.dataNasc.getYear() +
				(this.rg == 0 ? "" : ", RG: " + this.rg) + "\n"
				+ "Email: " + this.email + 
				(this.telefone == null ? "" : ", Telefone: " + this.telefone) + "\n"
				+ (this.end == null ? "" : "Endereço: " + this.end);
	}

}
