package exercicioInterfaceBernardo;

public class Quadrado implements FiguraGeometrica {

	private int lado;
	
	
	public Quadrado (int lado) {
		this.lado = lado;
	}
	
	@Override
	public String getNomeFigura() {
		
		return "Quadrado";
	}

	@Override
	public int gerArea() {
		
		return lado * lado;
	}

	@Override
	public float getPerimetro() {
		
		return lado * 4;
	}
	
	

}
