package Trabalho1etapa;

public class Salgadinho extends Prato {
	
	
	private String tipo;
	private String massa;
	private String recheio;
	
	public Salgadinho(String nomePrato, Double precoDeVenda, Double peso, String dataValidade, String tipo, String massa, String recheio) {
		super(nomePrato, precoDeVenda, peso, dataValidade);
		this.setMassa(massa);
		this.setRecheio(recheio);
		this.setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	
	
	
}


