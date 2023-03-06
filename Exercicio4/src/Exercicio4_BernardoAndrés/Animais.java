package Exercicio4_BernardoAndrés;

public class Animais {
	
	private String nome;
	private Integer idade;
	private String cor;
	private String raca;
	private String sexo;
	private Integer idA;
	
	public Animais(String nome, Integer idade, String cor, String raca, String sexo, Integer idA) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
		this.raca = raca;
		this.sexo = sexo;
		this.idA = idA;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getIdA() {
		return idA;
	}

	public void setIdA(Integer idA) {
		this.idA = idA;
	}

}
