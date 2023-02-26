package exercicio2javabiblioteca;


public class livro
{
	private String nome;
	private String autor;
	private String ano_publicacao;
	private String idLivro;
	private categoria categoriaLivro;
	
	
	public livro (String nome, String autor, String ano_publicacao, String idLivro) 
	{		
		super();
		this.nome = nome;
		this.autor = autor;
		this.ano_publicacao = ano_publicacao;
		this.idLivro = idLivro;	
		this.categoriaLivro = new categoria();
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

	public String getnomeCategoria() {
		return categoriaLivro.getnome();
	}
	
	public String getidCategoria() {
		return categoriaLivro.getidCategoria();
	}

	public void setCategoriaLivro(String idCategoria, String nome) {
		
		this.categoriaLivro.setidCategoria(idCategoria); 
		
		this.categoriaLivro.setnome(nome);
		
	}	
	
}















