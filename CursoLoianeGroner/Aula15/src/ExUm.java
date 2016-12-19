
// MOSTRAR OS NUMEROS DIGITADOS

import java.util.Scanner;

public class ExUm {

	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
	
		System.out.println ("Digite o primeiro numero: ");
		double n1 = ler.nextDouble();

		System.out.println ("Digite o segundo numero: ");
		double n2 = ler.nextDouble();
		
		System.out.println("Os numeros digitados foram: "+n1 +" e: "+n2);
	}

}
