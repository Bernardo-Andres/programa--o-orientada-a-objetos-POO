package petShopMVCBernardo;

import java.util.ArrayList;

public class Passaro extends Animal {

	private String nAnilha;
	private ArrayList<Passaro> passaros = new ArrayList<>();

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
	
	
    public void cadastrarPassaro(int id, String nome, String cor, int idade, String sexo, String raca, String numeroAnilha) {
        Passaro passaro = new Passaro(id, nome, cor, idade, sexo, raca, numeroAnilha);
        passaros.add(passaro);
    }
    
    public ArrayList<Passaro> getPassaros() {
        return passaros;
    }

	@Override
	public String toString() {
		return "Passaro [nAnilha=" + nAnilha + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getCor()="
				+ getCor() + ", getIdade()=" + getIdade() + ", getSexo()=" + getSexo() + ", getRaca()=" + getRaca()
				+ "]";
	}


	
	
}
