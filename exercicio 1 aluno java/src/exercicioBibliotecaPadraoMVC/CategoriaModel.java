package exercicioBibliotecaPadraoMVC;

public class CategoriaModel {

	private String nome;
	private String idCategoria;
	
	
	public CategoriaModel(String nome, String idCategoria) {
		super();
		this.setNome(nome);
		this.setIdCategoria(idCategoria);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIdCategoria() {
		return idCategoria;
	}


	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	
}
