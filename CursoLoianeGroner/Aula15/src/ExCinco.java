
//FAZER A MEDIA DE 3 NOTAS E DIZER SE FOI APROVADO

import java.util.Scanner;

public class ExCinco {

	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
	
		System.out.println ("Digite a primeira nota: ");
		double n1 = ler.nextDouble();

		System.out.println ("Digite a segunda nota: ");
		double n2 = ler.nextDouble();
		
		double r = (n1+n2)/2;
		
		if (r>=7 && r<10){
			System.out.println("Sua media foi "+r+ "por isso foi APROVADO");
		}
		else if (r<7){
			System.out.println("Sua media foi "+r+ "por isso foi REPROVADO");
		}
		else {
			System.out.println("Sua media foi "+r+ "por isso foi APROVADO COM DISTINÇÃO");
		}
	}

}
