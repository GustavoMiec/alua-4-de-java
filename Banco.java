package br.com.fiap.bens;

public class Banco {

	private String nome;
	private int agencia;
	private Cliente cliente;
	private Endereco endereco;
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setCliente (Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setEndereco  (Endereco endereco){
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Endereco getEnderecoo() {
		return endereco;
	}
	
	
	
}
