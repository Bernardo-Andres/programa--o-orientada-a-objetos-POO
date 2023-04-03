package exercicioBibliotecaPadraoMVC;

public class Principal {
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		new Control (model, view);
	}
}
