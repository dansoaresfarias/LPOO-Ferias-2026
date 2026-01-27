package Model;

import java.util.Date;

public class ContaPoupanca extends Conta {

	private double taxaRendimento;

	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(Cliente cliente, int numero, Agencia ag, Date dataAbertura, double saldo) {
		super(cliente, numero, ag, dataAbertura, saldo);
		this.taxaRendimento += 0.01;
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(Cliente cliente, int numero, Agencia ag) {
		super(cliente, numero, ag);
		this.taxaRendimento += 0.01;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean depositar(double valor) {
		valor += valor*this.taxaRendimento;
		return super.depositar(valor);
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

}
