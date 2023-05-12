package exercicio03;

public class Retangulo extends FormaGeometrica {

	private double base,altura;

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double calcularPerimetro() {
		return 2*getBase()+2*getAltura();
	}
	
	public double calcularArea() {
		return getBase()*getAltura();
		
	}
	

}
