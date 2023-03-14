package br.com.fiap.main;

import java.util.Scanner;
import br.com.fiap.bens.Banco;
import br.com.fiap.bens.Cliente;
import br.com.fiap.bens.Endereco;


public class teste {

	public static void main(String[] agrs) {
		
		Scanner leitor = new Scanner(System.in);
		
		// Instanciar objetos 
				Banco objBanco = new Banco();
				Cliente objCliente = new Cliente();
				Endereco objEndereco = new Endereco();
				
				// Entradas
				// Banco 
				
				System.out.println("Digite o Nome do Banco");
				objBanco.setNome(leitor.next());
				System.out.println("Digite a Agencia");
				objBanco.setAgencia(leitor.nextInt());	
				System.out.println("Digite o nome do Cliente");
				objCliente.setNomeCliente(leitor.next());
				System.out.println("Digite a Idade");
				objCliente.setIdade(leitor.nextInt());
				System.out.println("Digite o RG");
				objCliente.setRg(leitor.next());
				System.out.println("Digite o numero do cartao");
				objCliente.setNumeroCartao(leitor.nextInt());
				
				objBanco.setCliente(objCliente);
				objBanco.setEndereco(objEndereco);
				
				
						
				
					
				
				// Saidas 
				System.out.println("Nome: " + objBanco.getNome() + 
						"\nAgencia: " + objBanco.getAgencia() + 
						"\nNome do Cliente: " + objBanco.getCliente().getNomeCliente() + 
						"\nIdade: " + objBanco.getCliente().getIdade() + 
						"\nRG: " + objBanco.getCliente().getRg() + 
						"\nNumero do Cartao: " + objBanco.getCliente().getNumeroCartao() +
						"\n\nEndereco do Cliente\n" + 
						"\nLogradouro: " + objBanco.getEnderecoo().getLogradouro() + 
						"\nNumero: " + objBanco.getEnderecoo().getNumero() + 
						"\nBairro: " + objBanco.getEnderecoo().getBairro() + 
						"\nMunicipio: " + objBanco.getEnderecoo().getMunicipio());
			
	
	}
	
}
