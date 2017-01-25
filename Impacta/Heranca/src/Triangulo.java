
public class Triangulo extends FiguraGeometrica {
	
	private double base;
	private double altura;
	
	public Triangulo (double base, double altura){
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
	
	public double getArea (){
		return base * altura /2;
	}
	

}
