package petShopMVCBernardo;

import java.util.ArrayList;

public class Gato extends Animal {
	
	private String porte;
	private String peso;
	private Proprietario proprietario;
	//private ArrayList<Gato> gatos = new ArrayList<>();

	
	public Gato(int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso, Proprietario proprietario) {
		super(id, nome, cor, idade, sexo, raca);
		this.porte = porte;
		this.peso = peso;
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
    public void cadastrarGato(int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso, Proprietario proprietario, String string) {
        Gato gato = new Gato(id, nome, cor, idade, sexo, raca, porte, peso, proprietario);
        //gatos.add(gato);
    }
    
    */
	
	/*
    
    public ArrayList<Gato> getGatos() {
        return gatos;
    }
	
	*/


	@Override
	public String toString() {
		return "Gato 😁 [porte=" + porte + ", Proprietario = "+ this.getProprietario().getNome();
	}



	public Proprietario getProprietario() {
		return proprietario;
	}



	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
    
    

	

	
	

}