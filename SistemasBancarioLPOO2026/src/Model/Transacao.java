package Model;

import java.util.Date;

public class Transacao {

	private TipoTransacao tipo;
	private Date data;
	private double valor;
	private Cliente clienteTransferencia;
	private char tipoValor;

	public Transacao(TipoTransacao tipo, Date data, double valor, Cliente clienteTransferencia, char tipoValor) {
		super();
		this.tipo = tipo;
		this.data = data;
		this.valor = valor;
		this.clienteTransferencia = clienteTransferencia;
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
	
	// Próxima aula - 23/01
	//public String toString() {}

}
