
public class TesteConta {

	public static void main(String[] args) {
	
		// Instanciando a classe
		Conta c1 = new Conta();
		c1.nome = "Weslen Gomes";
		c1.num = 2016;
		c1.depositar (2500.50);
		
		System.out.println("Dados da Conta: ");
		System.out.println("Nome do Correntita: " +c1.nome);
		System.out.println("Numero da Conta: "+c1.num);
		System.out.println("Saldo: "+ c1.getSaldo());
		
		//depositando R$ 1.000,00
		c1.depositar(1000.00);
		System.out.println("Com o deposito no valor de R$ 1.000,00 ");
		System.out.println("Seu novo Saldo é de: " +c1.getSaldo());
		
		//Retirando R$1.500,00
		c1.retirar(1500.00);
		System.out.println("Com o Saque no valor de R$ 1.500,00 ");
		System.out.println("Seu novo Saldo é de: "+c1.getSaldo());
	}

}
