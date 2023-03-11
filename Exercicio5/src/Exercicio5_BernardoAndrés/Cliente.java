package Exercicio5_BernardoAndrés;

import java.util.Date;
import java.util.List;

//Utilizado Herança
public class Cliente extends Pessoa {
	
	private String datanasc;
	private String cpf;

	public Cliente(String nome, String email, List<String> telefone, String endereco, String datanasc, String cpf) {
		super(nome, email, telefone, endereco);
		this.datanasc = datanasc;
		this.cpf = cpf;
	}

	public String getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
