package br.com.caelum.cdcreact.controllers.forms;

import br.com.caelum.cdcreact.models.Cliente;

public class ClienteForm {

	private String nome;

	private String endereco;
	private String telefone;
	private String email;
	private String aparelho;
	private String marca;
	private String modelo;
	private Double valor;
	
	
	
	

	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getEndereco() {
		return endereco;
	}





	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}





	public String getTelefone() {
		return telefone;
	}





	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getAparelho() {
		return aparelho;
	}





	public void setAparelho(String aparelho) {
		this.aparelho = aparelho;
	}





	public String getMarca() {
		return marca;
	}





	public void setMarca(String marca) {
		this.marca = marca;
	}





	public String getModelo() {
		return modelo;
	}





	public void setModelo(String modelo) {
		this.modelo = modelo;
	}





	public Double getValor() {
		return valor;
	}





	public void setValor(Double valor) {
		this.valor = valor;
	}





	public Cliente build() {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		
		cliente.setTelefone(telefone);
		cliente.setEmail(email);
		cliente.setAparelho(aparelho);
		cliente.setMarca(marca);
		cliente.setModelo(modelo);
		cliente.setValor(valor);
		return cliente;
	}
	
	
}
