import java.util.Scanner;

public class TesteConta {

	private static Scanner ler;

	public static void main(String[] args) {
	
		ler = new Scanner(System.in);
		
		int n;
		//Criando Menu
		System.out.println("===== BEM VINDO AO BANCO TESTE =====");
		//System.lineSeparator(); //Pulando uma linha
		System.out.println("");
		System.out.println("ESCOLHA A OPERA��O QUE DESEJA REALIZAR: ");
		//System.lineSeparator();
		System.out.println("1 - Abrir Conta");
		System.out.println("2 - Deposito");
		System.out.println("3 - Saque ");
		System.out.println("4 - Consultar Saldo");
		System.out.println("Qual sua op��o: ");
		n = ler.nextInt();
		
		Conta c1 = new Conta();
		
		switch(n){
			case 1:
				System.out.println("------------------");
				System.out.println("Digite seu nome: ");
				String name = ler.next();
				System.out.println("Qual o valor do deposito inicial: ");
				double i = ler.nextDouble();
				int cont = 20000;
				c1.abrir(cont, name, i);
				System.out.println("------------------");
				System.out.println("Dados da Conta: ");
				System.out.println("Nome do Correntita: " +c1.nome);
				System.out.println("Numero da Conta: "+c1.num);
				System.out.println("Saldo: "+ c1.getSaldo());
				break;
				
			case 2:
				System.out.println("------------------");
				System.out.println("Qual o valor do deposito R$ ");
				double v = ler.nextDouble();
				c1.depositar (v);
				System.out.println("Seu novo saldo � de: " +c1.getSaldo());
				break;
				
			case 3:
				System.out.println("------------------");
				System.out.println("Qual o valor do saque: ");
				double s = ler.nextDouble();
				c1.retirar(s);
				System.out.println("Seu novo saldo � de: " +c1.getSaldo());
				break;
				
			case 4:
				System.out.println("------------------");
				System.out.println("Seu novo saldo � de: " +c1.getSaldo());
				break;
				
			default:
				System.out.println("------------------");
				System.out.println("Op��o Invalida ");
					
		}
		
		
	}

}