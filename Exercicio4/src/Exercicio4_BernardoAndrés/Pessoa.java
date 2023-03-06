package Exercicio4_BernardoAndrés;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private Integer id;
	private String cpf;
	
	public Pessoa (String nome, String endereco, Integer id, String cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.id = id;
		this.cpf = cpf;
	}
	
	
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
