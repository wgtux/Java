//DIAS DA SEMANA

import java.util.Scanner;

public class ExTreze {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Digite um numero correspondende ao dia da semana ");
		System.out.println("Ex: 1-Domingo, 2-Segunda, 3-Terça, etc");
		int v = scan.nextInt();
		
		switch(v){
			case 1: System.out.println("Domingo");break;
			case 2: System.out.println("Segunda Feira");break;
			case 3: System.out.println("Terça Feira");break;
			case 4: System.out.println("Quarta Feira");break;
			case 5: System.out.println("Quinta Feira");break;
			case 6: System.out.println("Sexta Feira");break;
			case 7: System.out.println("Sabado");break;
			default: System.out.println("Valor Invalido");
		}

	}

}
