package Principal;

import java.util.Date;

import Model.Agencia;
import Model.Cliente;
import Model.ContaCorrente;
import Model.ContaPoupanca;
import Model.Endereco;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Olá mundo!");

		Endereco endAgBancoSENAC = new Endereco("PE", "Recife", "Santo Amaro", "Rua do Pombal", 71, null, "50070-050");
		Agencia agSantoAmaro = new Agencia("Agência de Santo Amaro", 321, "+558121234567", "agsantoamaro@bancosenac.br",
				endAgBancoSENAC);

		//System.out.println(agSantoAmaro);

		Endereco endLuciana = new Endereco("PE", "Jaboatão dos Guararapes", "Piedade", "Rua Esquerda", 101, null,
				"50070-090");
		endLuciana.setCidade("Recife");

		Cliente luciana = new Cliente("Luciana Borges", "321.456.987-00", new Date(90, 4, 12), 345678,
				"lucianaOdeiaJames@gmail.com", "8199887766", endLuciana);
		
		Cliente valdir = new Cliente("José Valdir Duarte", "897.999.777-00", new Date(101, 8, 19),
				"jose.v.duarte@gmail.com");

		ContaPoupanca contaLu = new ContaPoupanca(luciana, 1234, agSantoAmaro, new Date(112, 05, 12), 15348.90);

		ContaCorrente contaValdir = new ContaCorrente(valdir, 1236, agSantoAmaro, new Date(118, 11, 03), 560.80);
		
		contaLu.depositar(-800);

		contaLu.depositar(800);

		contaLu.sacar(-200);
		
		contaLu.sacar(20000);

		contaLu.sacar(200);
		
		contaLu.transferir(300000, contaValdir);

		contaLu.transferir(300, null);
		
		contaLu.transferir(300, contaValdir);
		
		System.out.println("\n");
		System.out.println(contaLu.gerarExtrato());
		System.out.println("\n");
		
		contaValdir.depositar(3000);
		
		contaValdir.sacar(700);
		
		contaValdir.sacar(120);
				
		contaValdir.realizarPix(10000, "dansoaresfarias@gmail.com");
		
		contaValdir.realizarPix(1000, null);		

		contaValdir.realizarPix(1000, "dansoaresfarias@gmail.com");
		
		contaValdir.realizarPix(250, "mariabolo@gmail.com");
		
		System.out.println("\n");
		System.out.println(contaValdir.gerarExtrato());

	}

}
