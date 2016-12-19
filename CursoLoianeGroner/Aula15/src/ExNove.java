// DIGITE 3 NUMEROS E ORDENA EM ORDEM DECRESCENTE

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class ExNove {
	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
		Integer num[] = new Integer [3];
		
		//entrada do usuario
		for (int i=0; i< num.length; i++){
			System.out.println("Digite o "+(i+1)+ "º numero inteiro");
			num[i] = s.nextInt();
		}
		// ordenando de forma decrescente
		Arrays.sort(num, Collections.reverseOrder());	
		
		for (int i: num)
			System.out.println(i);

	}

}
