package petShopMVCBernardo;

public class Animal {

	private int id;
	private String nome;
	private String cor;
	private int idade;
	private String Sexo;
	private String raca;
	
	
	public Animal(int id, String nome, String cor, int idade, String sexo, String raca) {
		super();
		this.setId(id);
		this.setNome(nome);
		this.setCor(cor);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setRaca(raca);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSexo() {
		return Sexo;
	}


	public void setSexo(String sexo) {
		Sexo = sexo;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}
