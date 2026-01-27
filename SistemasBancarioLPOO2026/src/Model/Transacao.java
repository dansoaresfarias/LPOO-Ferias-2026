package Model;

import java.util.Date;

public class Transacao {

	private TipoTransacao tipo;
	private Date data;
	private double valor;
	private Cliente clienteTransferencia;
	private String chavePix;
	private char tipoValor;

	//overload - sobrecarga de construtor - trasnferência
	public Transacao(TipoTransacao tipo, Date data, double valor, Cliente clienteTransferencia, char tipoValor) {
		super();
		this.tipo = tipo;
		this.data = data;
		this.valor = valor;
		this.clienteTransferencia = clienteTransferencia;
		this.tipoValor = tipoValor;
	}
	//overload - sobrecarga de construtor - pix
	public Transacao(TipoTransacao tipo, Date data, double valor, String chavePix, char tipoValor) {
		super();
		this.tipo = tipo;
		this.data = data;
		this.valor = valor;
		this.chavePix = chavePix;
		this.tipoValor = tipoValor;
	}
	//overload - sobrecarga de construtor - saque e depósito
	public Transacao(TipoTransacao tipo, Date data, double valor, char tipoValor) {
		super();
		this.tipo = tipo;
		this.data = data;
		this.valor = valor;
		this.tipoValor = tipoValor;
	}

	public Transacao() {
		super();
	}

	public TipoTransacao getTipo() {
		return tipo;
	}

	public Date getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}

	public Cliente getClienteTransferencia() {
		return clienteTransferencia;
	}

	public char getTipoValor() {
		return tipoValor;
	}
	
	// Próxima aula - 27/01
	public String toString() {
		// 27/01/2026 - 10:10:30		Depósito 		+R$ 100,00
		// 27/01/2026 - 10:15:20		Transferência para Priscila		-R$ 200,00
		String transacao = "";
		transacao += this.data.getDate() + "/" + this.data.getMonth() + "/" + this.data.getYear();
		transacao += " - " + this.data.getHours() + ":" + this.data.getMinutes() + ":" + this.data.getSeconds();
		transacao += "\t " + this.tipo + " ";
		if (this.chavePix != null) {
			transacao += "- " + this.chavePix;
		}
		if (this.clienteTransferencia != null && this.tipoValor == '-') {
			transacao += "para " + this.clienteTransferencia.getNome() + "\t ";
		} else if (this.clienteTransferencia != null) {
			transacao += "de " + this.clienteTransferencia.getNome() + "\t ";
		} else {
			transacao += "\t ";
		} 
		transacao += this.tipoValor + "R$ " + String.format("%.2f", this.valor);
		return transacao;
	}

}
