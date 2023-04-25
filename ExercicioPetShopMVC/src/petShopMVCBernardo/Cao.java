package petShopMVCBernardo;

import java.util.ArrayList;

public class Cao extends Animal {

	private String porte;
	private String peso;
	//private ArrayList<Cao> cao = new ArrayList<>();
	private Proprietario proprietario;
	//int teste = 0;
	
	public Cao(int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso, Proprietario proprietario) {
		super(id, nome, cor, idade, sexo, raca);
		this.setPorte(porte);
		this.setPeso(peso);
		this.setProprietario(proprietario);
	}
	



	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	/*
    public void cadastrarCao(int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso, String string) {
        Cao caes = new Cao(id, nome, cor, idade, sexo, raca, porte, peso);
        cao.add(caes);
    }
    
    public ArrayList<Cao> getCao() {
        return cao;
    }
    */

   
    
    /*
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Proprietario p : proprietario.getProprietarios()) {
            sb.append(p.getNome()).append(", ");
        }
        String proprietariosCadastrados = sb.toString();
        return "Cao - porte = " + porte + ", peso = " + peso + ", Id = " + getId() + ", Nome = " + getNome()
                + ", Cor = " + getCor() + ", Idade = " + getIdade() + ", Sexo = " + getSexo() + ", Raca = "
                + getRaca() + ", Proprietarios Cadastrados = " + proprietariosCadastrados;
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
		return "Cao - porte = " + porte + ", peso = " + peso + ", proprietario = " + this.getProprietario().getNome() + ", Id = " + getId()
				+ ", Nome = " + getNome() + ", Cor = " + getCor() + ", Idade = " + getIdade() + ", Sexo = "
				+ getSexo() + ", Raça = " + getRaca();
	}
	
	

	

	

	
	
}
