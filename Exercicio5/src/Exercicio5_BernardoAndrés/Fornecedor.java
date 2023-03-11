package Exercicio5_BernardoAndrés;

import java.util.Date;
import java.util.List;

//Utilizado Herança
public class Fornecedor extends Pessoa {

	private String dataAbertura;
	private String cnpj;
	
	
	
	public Fornecedor(String nome, String email, List<String> telefone, String endereco, String dataAbertura,
			String cnpj) {
		super(nome, email, telefone, endereco);
		this.dataAbertura = dataAbertura;
		this.cnpj = cnpj;
	}
	
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
