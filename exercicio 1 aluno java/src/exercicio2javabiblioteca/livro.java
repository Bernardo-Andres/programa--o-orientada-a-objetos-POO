package exercicio2javabiblioteca;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class livro
{
	private String nome;
	private String autor;
	private String ano_publicacao;
	private String idLivro;
	
	
	public livro (String nome, String autor, String ano_publicacao, String idLivro) throws Exception
	{		
		super();
		this.nome = nome;
		this.autor = autor;
		this.ano_publicacao = ano_publicacao;
		this.idLivro = idLivro;			
	}

	public String getnome() {
		return nome;
	}
	
	public void setnome( String nome) {
		this.nome = nome;
	}
	
	public String getautor() {
		return autor;
	}
	
	public void setautor(String autor) {
		this.autor = autor;
	}
	
	public String getano_publicacao() {
		return ano_publicacao;
	}
	
	public void setano_publicacao(String ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	
	public String getidLivro() {
		return idLivro;
	}
	
	public void setidLivro(String idLivro) {
		this.idLivro = idLivro;
	}

	
	
}















