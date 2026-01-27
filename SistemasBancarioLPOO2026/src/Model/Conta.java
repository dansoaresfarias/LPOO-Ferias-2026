package Model;

import java.util.ArrayList;
import java.util.Date;

public abstract class Conta {

	private Cliente cliente;
	private int numero;
	private Agencia ag;
	private Date dataAbertura;
	private double saldo;
	private boolean status;
	private ArrayList<Transacao> transacoes;

	// Situação de abertura de conta
	public Conta(Cliente cliente, int numero, Agencia ag) {
		super();
		this.cliente = cliente;
		this.numero = numero;
		this.ag = ag;
		this.dataAbertura = new Date();
		this.saldo = 0.0;
		this.status = true;
		this.transacoes = new ArrayList<Transacao>();
		Agencia.numContas += 1;
	}

	// Situação de conta já existente
	public Conta(Cliente cliente, int numero, Agencia ag, Date dataAbertura, double saldo) {
		super();
		this.cliente = cliente;
		this.numero = numero;
		this.ag = ag;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
		this.status = true;
		this.transacoes = new ArrayList<Transacao>();
	}

	// Testes ou para o ORM
	public Conta() {
		super();
	}

	// Depositar
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor; // this.saldo = this.saldo + valor;
			this.transacoes.add(new Transacao(TipoTransacao.DEPÓSITO, new Date(), valor, '+'));
			return true;
		} else {
			// Erro!
			System.out.println("O valor R$ " + valor + ", informado é inválido.");
			return false;
		}
	}

	// Sacar
	public boolean sacar(double valor) {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				this.transacoes.add(new Transacao(TipoTransacao.SAQUE, new Date(), valor, '-'));
				return true;
			} else {
				// Erro!
				System.out.println("Saldo insuficiente para o valor R$ " + valor);
				return false;
			}
		} else {
			// Erro!
			System.out.println("O valor R$ " + valor + ", informado é inválido.");
			return false;
		}
	}

	// Transferir
	public boolean transferir(double valor, Conta contaFavorecida) {
		if (valor > 0 && contaFavorecida != null) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				this.transacoes.add(
						new Transacao(TipoTransacao.TRANSFERÊNCIA, new Date(), valor, contaFavorecida.cliente, '-'));
				contaFavorecida.saldo += valor;
				contaFavorecida.transacoes
						.add(new Transacao(TipoTransacao.TRANSFERÊNCIA, new Date(), valor, this.cliente, '+'));
				return true;
			} else {
				// Erro!
				System.out.println("Saldo insuficiente para o valor R$ " + valor);
				return false;
			}
		} else {
			// Erro!
			System.out.println("Erro nos valores das informações de valor e conta repassados. Repetir a operação!");
			return false;
		}
	}

	// RealizarPIX
	public boolean realizarPix(double valor, String chavePix) {
		if (valor > 0 && chavePix != null) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				this.transacoes.add(new Transacao(TipoTransacao.PIX, new Date(), valor, 
						chavePix, '-'));
				// depois... manda para a conta referente ao pix!
				return true;
			} else {
				// Erro!
				System.out.println("Saldo insuficiente para o valor R$ " + valor);
				return false;
			}
		} else {
			// Erro!
			System.out.println("Erro nos valores das informações de valor e chave Pix repassados. Repetir a operação!");
			return false;
		}
	}

	// InformarSaldo
	public double informarSaldo() {
		return this.saldo;
	}

	// GerarExtrato
	public String gerarExtrato() {
		String extrato = ".:: Extrato da Conta do Banco SENAC ::.\n" + this.toString() + "\n";
		if(this.transacoes.size() > 0) {
			extrato += "Data \t\t\t Histórico \t Valor";
		}
		for (Transacao transacao : transacoes) {
			extrato += "\n" + transacao;
		}
		extrato += "\nSaldo: R$" + String.format("%.2f", this.saldo);
		return extrato;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Agencia getAg() {
		return ag;
	}

	public void setAg(Agencia ag) {
		this.ag = ag;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public ArrayList<Transacao> getTransacoes() {
		return transacoes;
	}

	// ToString da conta
	public String toString() {
		return "Agência: " + this.ag.getNome() + " | " + "Conta: " + this.numero
				+ " | " + "Proprietário(a): " + this.cliente.getNome();
	}

}
