public class Conta {

	private int numero;
	private String nome;
	private double saldo;
	
	/*METODO CONSTRUTOR*/
	public Conta (int n, String no, double s){
		numero = n;
		nome = no;
		saldo = s;
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
	
	public String getDados(){
		return numero + " - " + nome + " - " + saldo;
	}
	
}
