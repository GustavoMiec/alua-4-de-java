package br.com.fiap.bens;

public class Endereco {

	private String logradouro;
	private String bairro;
	private String municipio;
	private int numero;

	public void setLogradouro (String logradouro) {
		this.logradouro = logradouro;
	}
	
	public void setNumero (int numero) {
		this.numero =  numero;
	}
	
	public void setBairro (String bairro) {
		this.bairro = bairro;
	}
	
	public void setMunicipio (String municipio) {
		this.municipio = municipio;
	}
	
	// Getters (Entrada)
		public String getLogradouro () {
			return logradouro;
		}
		
		public int getNumero () {
			return numero;
		}
		
		public String getBairro () {
			return bairro;
		}
		
		public String getMunicipio () {
			return municipio;
		}
	
	
}

