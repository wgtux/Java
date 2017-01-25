
public class TesteFigura {
	
	public static void main(String[] args) {
		FiguraGeometrica f = new Circulo (2);
		System.out.println("A area do Circulo é: "+f.getArea());
	
		f = new Triangulo(2, 4);
		System.out.println("A area do Triangulo é: " + f.getArea());
		
		
		f = new Quadrado (5);
		System.out.println("A area do Quadrado é: "+f.getArea());
	}
	

}
