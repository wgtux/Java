
public class Funcoes {

	//Valor Absoluto
	public void absoluto (double a){
		double ab = Math.abs(a);
		System.out.println("O valor absoluto de "+a+ " é: "+ab);
	}
		
	//Maior e menor
	public void maiorMenor(double m1, double m2){
		double maior = Math.max(m1, m2);
		double menor = Math.min(m1, m2);
		System.out.println("O maior numero de "+m1 + "e "+m2+ "é: " +maior);
		System.out.println("O menor numero de "+m1 + "e "+m2+ "é: " +menor);
	}
	
	
	//Potenciação
	public void potencia(double n1, double n2){
		double re = Math.pow(n1, n2);
		System.out.println("A potencia é de: "+re);
	}
	
	//Numero Aleatorio
	public void aleatorio(){
		double a = Math.random();
		System.out.println("O numero gerado foi: "+a);
	}
	
	
	//Arredondamento
	public void arredondamento(double r){
		double result = Math.round(r);
		System.out.println("Foi arredandado para: "+result);
	}
	
	//Raiz Quadrada
	public void raizQuadrada(double r){
		double res = Math.sqrt(r);
		System.out.println("A raiz quadrada de "+r +"é de: "+res);
		
	}
	
	
	
	
	//Tangente
	
}
