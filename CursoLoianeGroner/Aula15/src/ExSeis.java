import java.util.Scanner;

//MOSTRAR MAIOR E MENOR VALOR

public class ExSeis {

	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);

		int valor[] = new int[4];
		
		//Obtendo os dados
		
		for(int i = 0; i < valor.length; i++){  
		    System.out.print("Digite o " +(i+1)+"º valor: ");  
		    valor[i] = ler.nextInt(); 
		    
	}  
		//depois obtenha o maior e o menor
		int maior = valor[0];
		for (int i = 1 ; i < valor.length; i++){
			if ( valor[i] > maior) {
				maior = valor[i];
       }
  }
		int menor = valor[0];
		for (int i = 1; i < valor.length; i++) {  
			if(valor[i] < menor){  
				menor = valor[i];  
    }  
}  
System.out.println("Maior valor = "+ maior);  
System.out.println("Menor valor = "+ menor);  
}  
}