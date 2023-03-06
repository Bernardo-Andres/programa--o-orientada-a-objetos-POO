package Exercicio4_BernardoAndrés;

public class Passaro extends Animais {

	private Integer anilha;
	
	public Passaro(String nome, Integer idade, String cor, String raca, String sexo, Integer anilha, Integer idA) {
		super(nome, idade, cor, raca, sexo, idA);
		this.anilha = anilha;

	}

	public Integer getAnilha() {
		return anilha;
	}

	public void setAnilha(Integer anilha) {
		this.anilha = anilha;
	}
	
	
}
