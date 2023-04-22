package exercicioInterfaceBernardo;

public class Triangulo implements FiguraGeometrica {

	private double base;
	private double altura;
	private double l1;
	private double l2;
	private double l3;
	private double perimetro;
	
	public Triangulo (double base, double altura, double l1, double l2, double l3) {
		this.base = base;
		this.altura = altura;
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}
	
	
	
	@Override
	public String getNomeFigura() {
		
		return "Triangulo";
	}

	@Override
	public int gerArea() {
		
		return (int) ((base * altura)/2);
	}

	@Override
	public float getPerimetro() {
		perimetro = l1 + l2 + l3;
		return (float) perimetro;
	}

	
	
	
}
