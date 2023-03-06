package Exercicio4_BernardoAndrés;

public class CaoGato extends Animais{
	
	private String porte;
	private Double peso;
	
	public CaoGato(String nome, Integer idade, String cor, String raca, String sexo, String porte, Double peso, Integer idA) {
		super(nome, idade, cor, raca, sexo, idA);
		this.porte = porte;
		this.peso = peso;		
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
