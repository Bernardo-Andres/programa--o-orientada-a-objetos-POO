package Aula03HerançaBernardoAndrés;


public class Professor extends Pessoa{
	
	private Double salario;
	private String disciplinas;

	public Professor(String nome, String cpf, String dataNasc, Double salario, String disciplinas) {
		super(nome, cpf, dataNasc);
		this.salario = salario;
		this.disciplinas = disciplinas;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
}
