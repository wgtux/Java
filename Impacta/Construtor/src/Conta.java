public class Conta {

	private int numero;
	private String nome;
	private double saldo;
	private double deposito;
	private double saque;
	saldo =+ deposito;
	
	/*METODO CONSTRUTOR*/
	public Conta (int n, String no, double d){
		numero = n;
		nome = no;
		deposito = d;
		
	}
			
		
	/*METODOS GET AND SETTERS*/
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	public String getDados(){
		return numero + " - " + nome + " - " + saldo;
	}
	
}
