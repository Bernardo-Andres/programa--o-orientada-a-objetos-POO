package exercicio2javabiblioteca;

import java.util.ArrayList;

public class principal {
	public static void main(String[] args){
		
		
			ArrayList<livro> listaDosLivros = new ArrayList<livro>();
			
			
			
			livro Livro = new livro("Java para leigos", "Barry A.","2011", "01");
			Livro.setCategoriaLivro("Java", "01");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Java Efetivo", "Joshua Bloch","2001", "02");
			Livro.setCategoriaLivro("Java", "01");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Java para Iniciantes - 6ed", "Herbert","2015", "03");
			Livro.setCategoriaLivro("Java", "01");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Java Guia do Programador", "Peter Junior","2021", "04");
			Livro.setCategoriaLivro("Java", "01");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Programação Java Para Web", "Alexandre Altair","2010", "05");
			Livro.setCategoriaLivro("Java", "01");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Sistemas Operacionais com Java", "Abraham","2008", "06");
			Livro.setCategoriaLivro("Java", "01");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Orientação a Objetos e SOLID para Ninjas", "Mauricio A.","2015", "07");
			Livro.setCategoriaLivro("Orientação a objetos", "02");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Java como Programar", "Paul Deitel","1996", "08");
			Livro.setCategoriaLivro("Java", "01");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Código Limpo", "Robert Cecil","2008", "09");
			Livro.setCategoriaLivro("Códigos", "03");
			listaDosLivros.add(Livro);
			
			Livro = new livro("Pequeno Principe", "Antoine de Saint-Exupéry","1943", "10");
			Livro.setCategoriaLivro("Infantil", "04");
			listaDosLivros.add(Livro);
			
			Livro = listaDosLivros.get(0);
			
			
			
			for(int i=0; i < listaDosLivros.size(); i++) {
				System.out.println("Nome do livro: "+ listaDosLivros.get(i).getnome());
				System.out.println("Nome do Autor: " + listaDosLivros.get(i).getautor());
				System.out.println("Ano publicação: "+ listaDosLivros.get(i).getano_publicacao());
				System.out.println("Id: " + listaDosLivros.get(i).getidLivro());
				System.out.println("Id Categoria:" + listaDosLivros.get(i).getnomeCategoria());
				System.out.println("Nome Categoria:" + listaDosLivros.get(i).getidCategoria());
				System.out.println("------------------------------- ");
				
			}		 
	}
	
}
