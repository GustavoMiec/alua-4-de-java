package br.com.fiap.main;

import br.com.fiap.bens.Banco;
import br.com.fiap.bens.Cliente;
import br.com.fiap.bens.Endereco;

public class TesteBanco {

	public static void main(String[] args) {

		Banco objBanco = new Banco();
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		
		objBanco.setAgencia(5245);
		objBanco.setCliente(objCliente);
		objBanco.setEndereco(objEndereco);
		objBanco.setNome("Gustavo");
		
		objCliente.setIdade(635);
		objCliente.setNomeClienete("urgf");
		objCliente.setNumeroCartao(543234);
		objCliente.setRg("2514");
		
		objEndereco.setBairro("");
		objEndereco.setLogradouro("");
		objEndereco.setMunicipio("");
		objEndereco.setNumero(523234);
	
		
		
		System.out.println("Nome do banco: " + objBanco.getNome() +
				"\nAgentecia: "+ objBanco.getAgencia()+ 
				"\nCliete: " + objBanco.getCliente().getNomeClienete()+
 				"\nidade:" + objBanco.getCliente().getIdade() +
 				"\nnumero do cartao: " + objBanco.getCliente().getNumeroCartao() +
 				"\nRg: " + objBanco.getCliente().getRg() +
 				"\nBairro: " + objBanco.getEndereco().getBairro() +
 				"\nLogradouro: " + objBanco.getEndereco().getLogradouro() +
 				"\nMunicipio: " + objBanco.getEndereco().getMunicipio() +
 				"\nNumero: " + objBanco.getEndereco().getNumero());
				

	}

}
