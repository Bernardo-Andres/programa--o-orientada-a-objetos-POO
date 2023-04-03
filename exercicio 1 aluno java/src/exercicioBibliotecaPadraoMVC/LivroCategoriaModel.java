package exercicioBibliotecaPadraoMVC;

public class LivroCategoriaModel {

	private LivroModel Livro;
	private CategoriaModel Categoria;
	
	
	public LivroCategoriaModel(LivroModel livro, CategoriaModel categoria) {
		super();
		setLivro(livro);
		setCategoria(categoria);
	}


	public LivroModel getLivro() {
		return Livro;
	}


	public void setLivro(LivroModel livro) {
		Livro = livro;
	}


	public CategoriaModel getCategoria() {
		return Categoria;
	}


	public void setCategoria(CategoriaModel categoria) {
		Categoria = categoria;
	}
	
}
