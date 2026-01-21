package Principal;

import Model.Agencia;
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
		System.out.println(endLuciana);
		
	}

}
