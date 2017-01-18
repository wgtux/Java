
public class Funcionario {

	private int matricula;
	private String nome;
	private double salario;
	
	public Funcionario (int ma, String no, double sl){
		this.matricula = ma;
		this.nome = no;
		this.salario = sl;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}