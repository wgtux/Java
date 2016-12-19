//DIGITE 3 PRODUTOS E MOSTRE O COM MENOR VALOR

import java.util.Scanner;

public class ExOito {

	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);

		double valor[] = new double[3];
		
		for(int i = 0; i < valor.length; i++){  
		    System.out.print("Digite o preço do " +(i+1)+"º produto: ");  
		    valor[i] = ler.nextDouble(); 
		}
	
		double menor = valor[0];
		int p=0;
		for (int i = 1; i < valor.length; i++) {  
			if(valor[i] < menor){  
				menor = valor[i];
				p = i+1;
			}
		}
		System.out.println("Você deve comprar o produto" +p+"º que tem o valor de R$ "+ menor); 
	}
}

