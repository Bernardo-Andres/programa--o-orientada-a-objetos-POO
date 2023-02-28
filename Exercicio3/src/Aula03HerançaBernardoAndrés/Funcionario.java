package Aula03HerançaBernardoAndrés;


public class Funcionario extends Pessoa{
	
	private Double salario;
	private String admissao;
	private String cargo;

	public Funcionario(String nome, String cpf, String dataNasc, Double salario, String admissao, String cargo) {
		super(nome, cpf, dataNasc);
		this.salario = salario;
		this.admissao = admissao;
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getAdmissao() {
		return admissao;
	}

	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

}
