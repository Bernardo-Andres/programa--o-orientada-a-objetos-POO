package AnimaisMVC;

public abstract class Cao extends Animal {

	private String porte;
	private Double peso;
	
	public Cao(String nome, int idade, String raca, String cor, String sexo, String porte, Double peso) {
		super(nome, idade, raca, cor, sexo);
		this.setPorte(porte);
		this.setPeso(peso);
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
}
