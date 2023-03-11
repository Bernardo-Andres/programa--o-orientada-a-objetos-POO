package Exercicio5_BernardoAndrés;

import java.util.Date;
import java.util.List;

//Utilizado Herança
public class Funcionario extends Pessoa {
	private Date dataadm;
	private String cargo;
	private String cpf;
	private Date dataNasc;
	
	public Funcionario(String nome, String email, List<String> telefone, String endereco, Date dataadm, String cargo, String cpf, Date dataNasc) {
		super(nome, email, telefone, endereco);
		this.dataadm = dataadm;
		this.cargo = cargo;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}
	
	public Date getDataadm() {
		return dataadm;
	}
	public void setDataadm(Date dataadm) {
		this.dataadm = dataadm;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
}
