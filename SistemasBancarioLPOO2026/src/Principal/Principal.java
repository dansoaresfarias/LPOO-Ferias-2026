package Principal;

import java.util.Date;

import Model.Agencia;
import Model.Cliente;
import Model.Endereco;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Olá mundo!");
		
		Endereco endAgBancoSENAC = new Endereco("PE", "Recife",
				"Santo Amaro", "Rua do Pombal", 71, null, "50070-050");
		Agencia agSantoAmaro = new Agencia("Agência de Santo Amaro", 
				321, "+558121234567", "agsantoamaro@bancosenac.br", 
				endAgBancoSENAC);
		
		System.out.println(agSantoAmaro);
		
		
		Endereco endLuciana = new Endereco("PE", 
				"Jaboatão dos Guararapes", "Piedade", 
				"Rua Esquerda", 101, null, "50070-090");
		endLuciana.setCidade("Recife");
		
		Cliente luciana = new Cliente("Luciana Borges", "321.456.987-00", 
				new Date(90, 4, 12), 345678, "lucianaOdeiaJames@gmail.com",
				"8199887766", endLuciana);
		
		System.out.println(luciana);
		
		Cliente valdir = new Cliente("José Valdir Duarte", "897.999.777-00",
				new Date(101, 8, 19), "jose.v.duarte@gmail.com");
		
		System.out.println(valdir);
		
	}

}
