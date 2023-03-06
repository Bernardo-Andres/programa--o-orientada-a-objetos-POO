package Exercicio5_BernardoAndrés;

import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa {
	
	private Date datanasc;
	private String cpf;

	public Cliente(String nome, String email, List<String> telefone, String endereco, Date datanasc, String cpf) {
		super(nome, email, telefone, endereco);
		this.datanasc = datanasc;
		this.cpf = cpf;
	}

	public Date getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
