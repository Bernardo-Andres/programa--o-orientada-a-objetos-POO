package exercicioInterfaceBernardo;

public class Principal {

	public static void main(String[] args) {
		
		
		
		Quadrado quadrado = new Quadrado (4);	
		System.out.println("Nome da Figura: " + quadrado.getNomeFigura());
		System.out.println("Area do Quadrado: " + quadrado.gerArea());
		System.out.println("Perimetro do Quadrado: " + quadrado.getPerimetro());
		System.out.println("");
		
		Triangulo triangulo = new Triangulo(10, 20, 5, 5, 20);
		System.out.println("Nome da figura: " + triangulo.getNomeFigura());
		System.out.println("Area do Triangulo: " + triangulo.gerArea());
		System.out.println("Perimetro do Triangulo: " + triangulo.getPerimetro());
		
		
		
		
		
		
		
	}
}
