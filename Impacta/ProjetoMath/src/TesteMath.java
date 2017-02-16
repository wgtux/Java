import java.util.Scanner;

public class TesteMath {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("#### BEM VINDO AS FUNCOES ####");
		System.out.println("----------------------------------");
		System.out.println("MENU");
		System.out.println("1-Valor Absoluto");
		System.out.println("2-Seno");
		System.out.println("3-Coseno");
		System.out.println("4-Maior e Menor");
		System.out.println("5-Potenciacao");
		System.out.println("6-Numero Aleatorio");
		System.out.println("7-Arredondamento");
		System.out.println("8-Raiz Quadrada");
		System.out.println("9-Tangente");
		System.out.println("-------------------");
		System.out.println("Digite sua Opção: ");
		int e = scan.nextInt();
		
		Funcoes f = new Funcoes();
		
		switch (e){
			case 1:

				break;
			case 2:
				
				break;
			case 3:

				break;
			case 4:
				
				break;
			case 5:
				System.out.println("Digite o primeiro valor: ");
				double p1 = scan.nextDouble();
				System.out.println("Digite o segundo valor: ");
				double p2 = scan.nextDouble();
				f.potencia(p1, p2);
				break;
			case 6:
				f.aleatorio();
				break;
			case 7:
				System.out.println("Digite um valor: ");
				double v1 =scan.nextDouble();
				f.arredondamento(v1);
				break;
			case 8:
				System.out.println("Digite um valor: ");
				double v = scan.nextDouble();
				f.raizQuadrada(v);
				break;
			case 9:
				
				break;

		}

	}
}
