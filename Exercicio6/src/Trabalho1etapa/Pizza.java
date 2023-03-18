package Trabalho1etapa;

import java.util.Date;

public class Pizza extends Prato {

	private String recheio;
	private String molho;
	private String borda;
	
	public Pizza(String nomePrato, Double precoDeVenda, Double peso, String dataValidade, String recheio, String molho,
			String borda) {
		super(nomePrato, precoDeVenda, peso, dataValidade);
		this.setRecheio(recheio);
		this.setMolho(molho);
		this.setBorda(borda);
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}
	
	
	
	
	

}
