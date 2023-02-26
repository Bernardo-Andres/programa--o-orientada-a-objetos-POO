package exercicio2javabiblioteca;

import java.text.SimpleDateFormat;
import java.util.Date;



import java.util.ArrayList;

public class principal {
	public static void main(String[] args) throws Exception {
		
		try {
			
			ArrayList<livro> listaDosLivros = new ArrayList<livro>();
			
			ArrayList<categoria> listaCategoria = new ArrayList<categoria>();
			
			livro Livro = new livro("Java para leigos", "Barry A.","2011", "01");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Java Efetivo", "Joshua Bloch","2001", "02");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Java para Iniciantes - 6ed", "Herbert","2015", "03");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Java Guia do Programador", "Peter Junior","2021", "04");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Programação Java Para Web", "Alexandre Altair","2010", "05");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Sistemas Operacionais com Java", "Abraham","2008", "06");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Orientação a Objetos e SOLID para Ninjas", "Mauricio A.","2015", "07");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Java como Programar", "Paul Deitel","1996", "08");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Código Limpo", "Robert Cecil","2008", "09");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Pequeno Principe", "Antoine de Saint-Exupéry","1943", "10");
			listaDosLivros.add(Livro);
			
			Livro = listaDosLivros.get(0);
			
			for(int i=0; i < listaDosLivros.size(); i++) {
				System.out.println("Nome do livro: "+ listaDosLivros.get(i).getnome());
				System.out.println("Nome do Autor: " + listaDosLivros.get(i).getautor());
				System.out.println("Ano publicação: "+ listaDosLivros.get(i).getano_publicacao());
				System.out.println("Id: " + listaDosLivros.get(i).getidLivro());
				System.out.println("------------------------------- ");
			}
			
			categoria Categoria = new categoria("Infantil", "10");
			listaCategoria.add(Categoria);
			
			Categoria = new categoria("Programação", "10");
			listaCategoria.add(Categoria);
			
			Categoria = new categoria("Java", "10");
			listaCategoria.add(Categoria);
			
			Categoria = new categoria("Orientação a objetos", "10");
			listaCategoria.add(Categoria);
			
			
			
		} catch(Exception ex) {
			System.out.println("Erro!");
		}
	}
	
}
