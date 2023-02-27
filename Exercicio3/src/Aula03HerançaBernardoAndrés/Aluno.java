package Aula03HerançaBernardoAndrés;

import java.util.Date;

public class Aluno extends Pessoa {
	
	private String matricula;

	public Aluno(String nome, String cpf, String dataNasc, String matricula) {
		super(nome, cpf, dataNasc);
		this.setMatricula(matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double getcontaCopias (Integer nCopias) {
		return nCopias * 0.05;
	}
	
	}

