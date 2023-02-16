package exercico1Aluno;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Aluno {
	
private String nome;
private String CPF;
private Date dataNasc;
private String email;
private Integer idade;
	
public Aluno (String nome, String CPF, Date dataNasc, String email) throws Exception
	{
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.dataNasc = dataNasc;
		this.email = email;	
		this.setIdade(0);
		idadeAluno();
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

public String getdataNasc() {
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	return formato.format(dataNasc);
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

public void idadeAluno() throws Exception {
	
	//SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
    //Date firstDate = sdf.parse("04/22/2020");
    //Date secondDate = sdf.parse("04/27/2020");
	
	Date firstDate = this.dataNasc;
	
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date secondDate = new Date();
	
    long diff = secondDate.getTime() - firstDate.getTime();

    TimeUnit time = TimeUnit.DAYS; 
    
    long diffrence = time.convert(diff, TimeUnit.MILLISECONDS) / 365;    
    
	this.setIdade((int) (long) diffrence);
	
	}

public Integer getIdade() {
	return idade;
}

private void setIdade(Integer idade) {
	this.idade = idade;
	}
}