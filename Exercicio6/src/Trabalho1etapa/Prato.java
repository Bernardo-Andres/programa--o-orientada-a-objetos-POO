package Trabalho1etapa;

import java.util.Date;

public class Prato {
	private String nomePrato;
	private Double precoDeVenda;
	private Double peso;
	private String dataValidade;
	
	public Prato(String nomePrato, Double precoDeVenda, Double peso, String dataValidade) {
		super();
		this.setNomePrato(nomePrato);
		this.setPrecoDeVenda(precoDeVenda);
		this.setPeso(peso);
		this.setDataValidade(dataValidade);
	}

	public String getNomePrato() {
		return nomePrato;
	}

	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}

	public Double getPrecoDeVenda() {
		return precoDeVenda;
	}

	public void setPrecoDeVenda(Double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
}
