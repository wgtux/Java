
public class Funcoes {

	//Valor Absoluto
	public void absoluto (double a){
		double ab = Math.abs(a);
		System.out.println("O valor absoluto de "+a+ " �: "+ab);
	}
		
	//Maior e menor
	public void maiorMenor(double m1, double m2){
		double maior = Math.max(m1, m2);
		double menor = Math.min(m1, m2);
		System.out.println("O maior numero de "+m1 + "e "+m2+ "�: " +maior);
		System.out.println("O menor numero de "+m1 + "e "+m2+ "�: " +menor);
	}
	
	
	//Potencia��o
	public void potencia(double n1, double n2){
		double re = Math.pow(n1, n2);
		System.out.println("A potencia � de: "+re);
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
		System.out.println("A raiz quadrada de "+r +"� de: "+res);
		
	}
	
	
	
	
	//Tangente
	
}
