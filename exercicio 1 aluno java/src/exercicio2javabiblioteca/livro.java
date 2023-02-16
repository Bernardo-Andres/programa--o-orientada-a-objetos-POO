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
	private Date ano_publicacao;
	private Integer idLivro;
	
	
	public livro (String nome, String autor, Date ano_publicacao, Integer idLivro) throws Exception
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
	
	public Date getano_publicacao() {
		return ano_publicacao;
	}
	
	public void setano_publicacao(Date ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
	
	public Integer getidLivro() {
		return idLivro;
	}
	
	public void setidLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}

	
	
}















