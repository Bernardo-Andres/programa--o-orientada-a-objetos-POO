package exercico1Aluno;

import java.util.Date;

public class Aluno {
	
private String nome;
private String CPF;
private Date dataNasc;
private String email;
	
public Aluno (String nome, String CPF, Date dataNasc, String email)
	{
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.dataNasc = dataNasc;
		this.email = email;	
	}

//get serve para recuperar um determinado atributo de um objeto
public String getnome() {
	return nome;
}
// set serve para atribuir valor a um determinado atributo de um objeto
public void setnome( String nome) {
	this.nome = nome;
}

public String getCPF() {
	return CPF;
}

public void setCPF (String CPF) {
	this.CPF = CPF;
}

public Date getdataNasc() {
	return dataNasc;
}

public void setdataNasc(Date dataNasc) {
	this.dataNasc = dataNasc;
}

public String getemail() {
	return email;
}

public void setemail(String email) {
	this.email = email;
}

public Integer idadeAluno() {
	Integer idade = 0;
	return idade;
}
}