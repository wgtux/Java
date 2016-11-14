
public class Conta {

	public int num;
	public String nome;
	private double saldo; //restringindo o acesse ao saldo
	
	public void abrir (int n, String no, double s ){
		num = n;
		nome = no;
		saldo = s;
		
	}

	
	public void depositar (double v){
		saldo += v;
	}
	
	public void retirar (double v){
		saldo -= v;
	}
	
	//acessando o saldo dentro da classe Conta
	public double getSaldo (){
		return saldo;
	}


}