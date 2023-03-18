package Trabalho1etapa;

public class Lanche extends Prato {
	private String tipoPao;
	private String recheio;
	private String molho;
	
	
	public Lanche(String nomePrato, Double precoDeVenda, Double peso, String dataValidade, String tipoPao,
			String recheio, String molho) {
		super(nomePrato, precoDeVenda, peso, dataValidade);
		this.tipoPao = tipoPao;
		this.recheio = recheio;
		this.molho = molho;
	}
	public String getTipoPao() {
		return tipoPao;
	}
	public void setTipoPao(String tipoPao) {
		this.tipoPao = tipoPao;
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
	
	
	
	
	

	
}
