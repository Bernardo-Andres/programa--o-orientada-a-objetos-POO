package petShopMVCBernardo;

public class Gato extends Animal{

	private String porte;
	private String peso;
	
	public Gato(int id, String nome, String cor, int idade, String sexo, String raca, String porte, String peso) {
		super(id, nome, cor, idade, sexo, raca);
		this.setPorte(porte);
		this.setPeso(peso);
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
	
	
}
