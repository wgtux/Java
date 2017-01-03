//Reajuste de Salario
import java.util.Scanner;

public class ExOnze {
	
	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		double salarioAtual;
		double novoSalario;
		double aumento;
		
		System.out.println("Favor Digitar o salario do Colaborador: ");
		salarioAtual = s.nextDouble();
		
		System.out.println("Calculando Reajuste...");
		System.out.println("...");
		
		if (salarioAtual<= 280){
			aumento = salarioAtual*0.2;
			novoSalario = salarioAtual+aumento;
			System.out.println("Seu Salario Anterior era de R$ "+salarioAtual);
			System.out.println("Seu percentual de aumento foi de 20%");
			System.out.println("O valor do aumento foi de R$ "+aumento);
			System.out.println("Seu novo Salario � de R$ "+novoSalario);
		}
		else if (salarioAtual > 280 && salarioAtual <= 700){
			aumento = salarioAtual*0.15;
			novoSalario = salarioAtual+aumento;
			System.out.println("Seu Salario Anterior era de R$ "+salarioAtual);
			System.out.println("Seu percentual de aumento foi de 15%");
			System.out.println("O valor do aumento foi de R$ "+aumento);
			System.out.println("Seu novo Salario � de R$ "+novoSalario);
		}
		else if (salarioAtual > 700 && salarioAtual <= 1500){
			aumento = salarioAtual*0.1;
			novoSalario = salarioAtual+aumento;
			System.out.println("Seu Salario Anterior era de R$ "+salarioAtual);
			System.out.println("Seu percentual de aumento foi de 10%");
			System.out.println("O valor do aumento foi de R$ "+aumento);
			System.out.println("Seu novo Salario � de R$ "+novoSalario);
		}
		else{
			aumento = salarioAtual*0.05;
			novoSalario = salarioAtual+aumento;
			System.out.println("Seu Salario Anterior era de R$ "+salarioAtual);
			System.out.println("Seu percentual de aumento foi de 5%");
			System.out.println("O valor do aumento foi de R$ "+aumento);
			System.out.println("Seu novo Salario � de R$ "+novoSalario);
		}
	}
}