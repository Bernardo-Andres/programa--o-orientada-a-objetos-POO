package Exercicio5_BernardoAndrés;

import java.util.Date;
import java.util.List;

public class Fornecedor extends Pessoa {

	private Date dataAbertura;
	private String cnpj;
	
	
	
	public Fornecedor(String nome, String email, List<String> telefone, String endereco, Date dataAbertura,
			String cnpj) {
		super(nome, email, telefone, endereco);
		this.dataAbertura = dataAbertura;
		this.cnpj = cnpj;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
