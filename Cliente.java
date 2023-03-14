package br.com.fiap.bens;

public class Cliente {

	private String nomeCliente;
	private int idade;
	private String rg;
	private int numeroCartao;
	
	// Setters (entradas)
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	public void setRg (String rg) {
		this.rg = rg;
		
	}
	
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getRg() {
		return rg;
	}
	
	public int getNumeroCartao() {
		return numeroCartao;
	}
	
}
