package Exercicio5_BernardoAndrés;

import java.util.List;

public class Pessoa {
	
	private String nome;
	private String email;
	private List<String> telefone;
	private String endereco;
	
	public Pessoa(String nome, String email, List<String> telefone, String endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getTelefone() {
		return telefone;
	}
	public void setTelefone(List<String> telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
