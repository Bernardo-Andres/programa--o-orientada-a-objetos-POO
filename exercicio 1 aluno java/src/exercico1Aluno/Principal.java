package exercico1Aluno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
	public static void main(String[] args) throws ParseException{
		//Aluno aluno = new aluno(); //Criando um objeto aluno
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAluno = formato.parse("02/09/1997");
		Aluno aluno1 = new Aluno("Bernardo", "105.837.106-11", dataAluno, "br.abar33@gmail.com");
		
		//SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAluno1 = formato.parse("12/09/1998");
		Aluno aluno2 = new Aluno("Carlos", "125.837.186-12", dataAluno1, "carlos@gmail.com");
		
		//SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAluno2 = formato.parse("02/11/2000");
		Aluno aluno3 = new Aluno("Joaquim", "105.888.111-11", dataAluno2, "joaquim@gmail.com");
		
		System.out.println("nome: "+ aluno1.getnome());
		System.out.println("CPF: " + aluno1.getCPF());
		System.out.println("Data de nascimento: "+ formato.format(dataAluno));
		System.out.println("Email: "+ aluno1.getemail());
		
		
		System.out.println("nome: "+ aluno2.getnome());
		System.out.println("CPF: " + aluno2.getCPF());
		System.out.println("Data de nascimento: "+ formato.format(dataAluno1));
		System.out.println("Email: "+ aluno2.getemail());
		
		System.out.println("nome: "+ aluno3.getnome());
		System.out.println("CPF: " + aluno3.getCPF());
		System.out.println("Data de nascimento: "+ formato.format(dataAluno2));
		System.out.println("Email: "+ aluno3.getemail());
	}
}
