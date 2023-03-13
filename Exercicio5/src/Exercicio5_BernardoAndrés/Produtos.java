package Exercicio5_BernardoAndrés;

public class Produtos {
	
	private Integer id;
	private String nome;
	private Double preco_unitario;
	private Fornecedor forn;
	
	public Produtos (Integer id, String nome, Double preco_unitario, Fornecedor forn) {
		this.id = id;
		this.nome = nome;
		this.preco_unitario = preco_unitario;
		this.forn = forn;
	}
	
	//Encapsulamento
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(Double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	public Fornecedor getForn() {
		return forn;
	}
	public void setForn(Fornecedor forn) {
		this.forn = forn;
	}
	
}
