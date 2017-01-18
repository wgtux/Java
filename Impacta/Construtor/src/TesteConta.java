import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("#### BEM VINDO AO BANCO WGTUX ####");
		System.out.println("----------------------------------");
		System.out.println("MENU");
		System.out.println("1-Abrir Conta");
		System.out.println("2-Consultar Saldo");
		System.out.println("3-Deposito");
		System.out.println("4-Excluir Conta");
		System.out.println("-------------------");
		System.out.println("Digite sua Opção: ");
		int e = scan.nextInt();
		
		
		switch (e){
			case 1:
				System.out.println("Digite seu Nome: ");
				String nome = scan.next();
				System.out.println("Inserir valor de deposito inicial: ");
				double dep = scan.nextDouble();
				int n = 1000;
				Conta c = new Conta(n,nome,dep);
				n=n+1;
				System.out.println(c.getDados());
				break;
			case 2:
				System.out.println("Seu Saldo é de: R$ "+ Conta.);
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("Opção Invalida!");	
		}
		
		/*
		Conta c1 = new Conta (0001, "Weslen", 2000.00);
		Conta c2 = new Conta (0002, "Bertano", 1600.00);
		Conta c3 = new Conta (0003, "Fulano", 1800.00);

		System.out.println(c1.getDados());
		System.out.println(c2.getDados());*/
	}

}
