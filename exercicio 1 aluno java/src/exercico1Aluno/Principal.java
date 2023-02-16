package exercico1Aluno;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;



public class Principal {
	public static void main(String[] args) throws Exception{
		//Aluno aluno = new aluno(); //Criando um objeto aluno
		try {
			
			ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();
			
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			
			Date dataAluno = formato.parse("02/11/2002");
			Aluno aluno1 = new Aluno("Joaquim", "105.888.111-11", dataAluno, "joaquim@gmail.com");
			listaDeAlunos.add(aluno1);
			
			dataAluno = formato.parse("02/09/1997");
			aluno1 = new Aluno("Bernardo", "105.837.106-11", dataAluno, "br.abar33@gmail.com");
			listaDeAlunos.add(aluno1);
			
			//SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			dataAluno = formato.parse("12/09/1998");
			aluno1 = new Aluno("Carlos", "125.837.186-12", dataAluno, "carlos@gmail.com");
			listaDeAlunos.add(aluno1);
			
			//SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			dataAluno = formato.parse("02/11/2000");
			aluno1 = new Aluno("Joaquim", "105.888.111-11", dataAluno, "joaquim@gmail.com");
			listaDeAlunos.add(aluno1);
			
			aluno1 = listaDeAlunos.get(0);
			
			for(int i=0; i < listaDeAlunos.size(); i++) {
				System.out.println("nome: "+ listaDeAlunos.get(i).getnome());
				System.out.println("CPF: " + listaDeAlunos.get(i).getCPF());
				//System.out.println("Data de nascimento: "+ formato.format(dataAluno));
				System.out.println("Data de nascimento: "+ listaDeAlunos.get(i).getdataNasc());
				System.out.println("Idade: "+ listaDeAlunos.get(i).getIdade());
				System.out.println("Email: "+ listaDeAlunos.get(i).getemail());
				
				if(listaDeAlunos.get(i).getIdade() > aluno1.getIdade()) {
					aluno1 = listaDeAlunos.get(i);
					
				}
			}
			
			System.out.println("------------------------------- ");
			System.out.println("Aluno mais velho: ");
			System.out.println("nome: "+ aluno1.getnome());
			System.out.println("CPF: " + aluno1.getCPF());
			//System.out.println("Data de nascimento: "+ formato.format(dataAluno));
			System.out.println("Data de nascimento: "+ aluno1.getdataNasc());
			System.out.println("Idade: "+ aluno1.getIdade());
			System.out.println("Email: "+ aluno1.getemail());
			
			
		} catch(Exception ex)  {
			System.out.println("Erro ao montar data ");
		}
		
		
		
		
		
		
		
		
	
	}
}
