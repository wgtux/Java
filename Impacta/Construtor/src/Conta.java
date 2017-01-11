public class Conta {

	private int numero;
	private String nome;
	private double saldo;
	private double deposito;
	private double saquar;
	
	
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

	public double getSaquar() {
		return saquar;
	}

	public void setSaquar(double saquar) {
		this.saquar = saquar;
	}
	
	public String getDados(){
		return numero + " - " + nome + " - " + saldo;
	}
	
}
