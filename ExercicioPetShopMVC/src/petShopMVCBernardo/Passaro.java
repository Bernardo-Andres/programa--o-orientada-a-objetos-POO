package petShopMVCBernardo;

public class Passaro extends Animal {

	private String nAnilha;

	public Passaro(int id, String nome, String cor, int idade, String sexo, String raca, String nAnilha) {
		super(id, nome, cor, idade, sexo, raca);
		this.setnAnilha(nAnilha);
	}

	public String getnAnilha() {
		return nAnilha;
	}

	public void setnAnilha(String nAnilha) {
		this.nAnilha = nAnilha;
	}
	
	
}
