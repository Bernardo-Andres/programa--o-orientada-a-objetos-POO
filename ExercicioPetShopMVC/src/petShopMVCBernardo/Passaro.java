package petShopMVCBernardo;

import java.util.ArrayList;

public class Passaro extends Animal {
	
	private String nAnilha;
	private Proprietario proprietario;
	
	public Passaro(int id, String nome, String cor, int idade, String sexo, String raca, String nAnilha, Proprietario proprietario) {
		super(id, nome, cor, idade, sexo, raca);
		this.nAnilha = nAnilha;
		this.setProprietario(proprietario);
	}
	

	public String getNAnilha() {
		return nAnilha;
	}

	public void setNAnilha(String nAnilha) {
		this.nAnilha = nAnilha;
	}

	
	/*
    public void cadastrarPassaro(int id, String nome, String cor, int idade, String sexo, String raca, String numeroAnilha) {
        Passaro passaro = new Passaro(id, nome, cor, idade, sexo, raca, numeroAnilha);
        passaros.add(passaro);
    }
    
    public ArrayList<Passaro> getPassaros() {
        return passaros;
    }
    
    */
	
	

	public Proprietario getProprietario() {
		return proprietario;
	}


	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
    
    
    
    
    
    
	@Override
	public String toString() {
		return "Proprietario = "+ this.getProprietario().getNome() + ", Passaro Número Anilha = " + nAnilha + ", Id = " + getId() + ", Nome = " + getNome() + ", Cor = "
				+ getCor() + ", Idade = " + getIdade() + ", Sexo = " + getSexo() + ", Raça = " + getRaca();
	}
	


	
	
}
