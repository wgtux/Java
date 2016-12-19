
// VER SE O NUMERO DIGITADO É POSITIVO OU NEGATIVO

import java.util.Scanner;

public class ExDois {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero Inteiro: ");
		int n = scanner.nextInt();
		
		if(n > 0){
			System.out.println("O numero digitado: "+n+ " é POSITIVO ");
		}
		else{
			System.out.println("O numero digitado: "+n+ " é NEGATIVO ");
		}
	}

}
