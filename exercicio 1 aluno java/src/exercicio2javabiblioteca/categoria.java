package exercicio2javabiblioteca;



public class categoria {

	private String nome;
	private String idCategoria;
	
	public categoria () 
	{
		super();		
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome (String nome) {
		this.nome = nome;
	}
	
	public String getidCategoria() {
		return idCategoria;
	}
	
	public void setidCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
}
