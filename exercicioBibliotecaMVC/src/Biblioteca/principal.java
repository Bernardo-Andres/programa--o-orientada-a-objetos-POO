package bibliotecaMVC;



public class principal {
	public static void main(String[] args) {


		Livro livro = new Livro(null,null);
		LivroView livroView = new LivroView();
		
		new LivroController(livro, livroView);
		
		
		
	}
}
