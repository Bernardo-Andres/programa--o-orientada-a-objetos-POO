package Trabalho1etapa;

import java.util.List;

public class Pedido {
	private String nome;
	private Double valorTotal;
	private Double troco;
	private Double valorRecebido;
	private List<String> itensPedidos;
	private Double taxaServico;
	
	
	public Pedido(String nome, Double valorTotal, Double troco, Double valorRecebido, List<String> itensPedidos, Double taxaServico) {
		super();
		this.setNome(nome);
		this.setValorTotal(valorTotal);
		this.setTroco(troco);
		this.setValorRecebido(valorRecebido);
		this.setItensPedidos(itensPedidos);
		this.setTaxaServico(taxaServico);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public Double getTroco() {
		return troco;
	}


	public void setTroco(Double troco) {
		this.troco = troco;
	}


	public Double getValorRecebido() {
		return valorRecebido;
	}


	public void setValorRecebido(Double valorRecebido) {
		this.valorRecebido = valorRecebido;
	}


	public List<String> getItensPedidos() {
		return itensPedidos;
	}


	public void setItensPedidos(List<String> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}


	public Double getTaxaServico() {
		return taxaServico;
	}


	public void setTaxaServico(Double taxaServico) {
		this.taxaServico = taxaServico;
	}
}
