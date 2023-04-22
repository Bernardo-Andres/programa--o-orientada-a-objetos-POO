package AnimaisMVC;

public abstract class Passaro extends Animal {

	private String anilha;

	public Passaro(String nome, int idade, String raca, String cor, String sexo, String anilha) {
		super(nome, idade, raca, cor, sexo);
		this.setAnilha(anilha);
	}

	public String getAnilha() {
		return anilha;
	}

	public void setAnilha(String anilha) {
		this.anilha = anilha;
	}
	
}
