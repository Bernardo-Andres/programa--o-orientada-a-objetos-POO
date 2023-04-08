package bibliotecaMVC;

public class Principal {

	public static void main(String[] args) {
		LivroModel livroModel = new LivroModel();
		LivroView livroView = new LivroView();
		
		new LivroControler(livroModel, livroView);
		
	}
	
}
