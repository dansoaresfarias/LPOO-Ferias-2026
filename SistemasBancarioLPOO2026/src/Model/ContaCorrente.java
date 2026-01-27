package Model;

import java.util.Date;

public class ContaCorrente extends Conta {
	
	private double taxaAdm;

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(Cliente cliente, int numero, Agencia ag, Date dataAbertura, double saldo) {
		super(cliente, numero, ag, dataAbertura, saldo);
		this.taxaAdm = 0.01;
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(Cliente cliente, int numero, Agencia ag) {
		super(cliente, numero, ag);
		this.taxaAdm = 0.01;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean sacar(double valor) {
		valor += valor*this.taxaAdm;
		return super.sacar(valor);
	}	

	public double getTaxaAdm() {
		return taxaAdm;
	}

	public void setTaxaAdm(double taxaAdm) {
		this.taxaAdm = taxaAdm;
	}	

}
