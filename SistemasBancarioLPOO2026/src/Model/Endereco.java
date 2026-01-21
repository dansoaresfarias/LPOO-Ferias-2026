package Model;

public class Endereco {

	private String uf;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
	private String complemento;
	private String cep;

	public Endereco(String uf, String cidade, String bairro, String rua, int num, String comp, String cep) {
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = num;
		this.complemento = comp;
		this.cep = cep;
	}

	public Endereco() {

	}

	public String getUf() {
		return this.uf;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String toString() {
		return this.cidade + "-" + this.uf + ", " + this.bairro + ", " + this.rua + ", " + this.numero + ", "
				+ (this.complemento == null ? "" : this.complemento + ", ") + this.cep;
	}

}
