package Aula03HerançaBernardoAndrés;

public class Principal {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno ("Bernardo Andres", "10583710611", "02/02/2000", "20100745");
		
		Funcionario funcionario = new Funcionario("josé Carlos", "10693806228", "17/09/1985", 1300.00, "28/02/2000", "Administração");
		
		Professor professor = new Professor("Armando Teixeira", "11283977728", "22/08/1980", 5000.00, "Matematica, Fisica");
		
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("Informações do aluno abaixo :");
		System.out.println("Nome: " + aluno.getNome());  
		System.out.println("CPF: " + aluno.getCpf());
		System.out.println("Data de Nascimento: " + aluno.getDataNasc());
		System.out.println("Matricula: " + aluno.getMatricula());
		System.out.println("Custo das 1000 cópias: R$ " + aluno.getcontaCopias(1000));
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("");
		
		System.out.println("Informações do funcionario abaixo: ");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Data de Nascimento: " + funcionario.getDataNasc());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Data de admissão: "+ funcionario.getAdmissao());
		System.out.println("Cargo na Instituição: " + funcionario.getCargo());
		System.out.println("Custo das 1000 cópias: R$ " + funcionario.getcontaCopias(1000));
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("");
		
		System.out.println("Informações do Professor abaixo: ");
		System.out.println("Nome: " + professor.getNome());
		System.out.println("CPF: " + professor.getCpf());
		System.out.println("Data de Nascimento: " + professor.getDataNasc());
		System.out.println("Salario: " + professor.getSalario());
		System.out.println("Disciplinas lecionadas: " + professor.getDisciplinas());
		System.out.println("Custo das 1000 cópias: R$ " + professor.getcontaCopias(1000));
		
		
	}
}
