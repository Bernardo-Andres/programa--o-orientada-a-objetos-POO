package exercicio2javabiblioteca;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class categoria {

	private String nome;
	private String idCategoria;
	
	public categoria (String nome, String idCategoria) throws Exception 
	{
		super();
		this.nome = nome;
		this.idCategoria = idCategoria;		
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
