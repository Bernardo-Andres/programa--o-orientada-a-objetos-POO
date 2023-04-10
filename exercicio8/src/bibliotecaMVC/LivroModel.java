package bibliotecaMVC;


//


public class LivroModel {

	private Integer id;
	private String nome;
	private String autor;
	private String anoPublicacao;
	
	
	public LivroModel () {
		
	}


	public void setLivroModel(Integer id, String nome, String autor, String anoPublicacao) {
		
		this.setId(id);
		this.setNome(nome);
		this.setAutor(autor);
		this.setAnoPublicacao(anoPublicacao);
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getAnoPublicacao() {
		return anoPublicacao;
	}


	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public void visualizarLivro(LivroModel teste) {
		System.out.println("Nome do livro: " + teste.nome);
		System.out.println("Id do livro: " + teste.id);
		System.out.println("Nome do autor: " + teste.autor);
		System.out.println("Ano da publicação: " + teste.anoPublicacao);
		
		
	}
	
	
}
