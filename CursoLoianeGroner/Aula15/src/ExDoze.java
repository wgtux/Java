//FOLHA DE PAGAMENTO

import java.util.Scanner;

public class ExDoze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor da sua hora trabalhada: ");
		double vt = scan.nextDouble();
		System.out.println("Quantas horas trabalha no mês: ");
		double ht = scan.nextDouble();
		
		double salarioBruto = vt*ht;
		double sindicato = salarioBruto * 0.03;
		double fgts = salarioBruto * 0.11;
		double inss = salarioBruto * 0.1;
		
		if (salarioBruto <=900){
			double desconto = sindicato+inss;
			double salarioLiquido = salarioBruto - desconto;
			System.out.println("Salario Bruto       : R$ "+salarioBruto);
			System.out.println("(-) IR Insento      : R$ 00.0");
			System.out.println("(-) INSS            : R$ "+inss);
			System.out.println("FGTS                : R$ "+fgts);
			System.out.println("(-) Sindicato       : R$ "+sindicato);
			System.out.println("Total de Desconto   : R$ "+desconto);
			System.out.println("Salario Liquido     : R$ "+salarioLiquido);
		}
		else if(salarioBruto>900 && salarioBruto <=1500){
			double ir = salarioBruto*0.05;
			double desconto = sindicato+inss + ir;
			double salarioLiquido = salarioBruto - desconto;
			System.out.println("Salario Bruto       : R$ "+salarioBruto);
			System.out.println("(-) IR Insento      : R$ "+ir);
			System.out.println("(-) INSS            : R$ "+inss);
			System.out.println("FGTS                : R$ "+fgts);
			System.out.println("(-) Sindicato       : R$ "+sindicato);
			System.out.println("Total de Desconto   : R$ "+desconto);
			System.out.println("Salario Liquido     : R$ "+salarioLiquido);
		}
		else if (salarioBruto>1500 && salarioBruto <=2500){
			double ir = salarioBruto*0.1;
			double desconto = sindicato+inss+ir;
			double salarioLiquido = salarioBruto - desconto;
			System.out.println("Salario Bruto       : R$ "+salarioBruto);
			System.out.println("(-) IR Insento      : R$ "+ir);
			System.out.println("(-) INSS            : R$ "+inss);
			System.out.println("FGTS                : R$ "+fgts);
			System.out.println("(-) Sindicato       : R$ "+sindicato);
			System.out.println("Total de Desconto   : R$ "+desconto);
			System.out.println("Salario Liquido     : R$ "+salarioLiquido);
		}
		else{
			double ir = salarioBruto*0.2;
			double desconto = sindicato+inss+ir;
			double salarioLiquido = salarioBruto - desconto;
			System.out.println("Salario Bruto       : R$ "+salarioBruto);
			System.out.println("(-) IR Insento      : R$ "+ir);
			System.out.println("(-) INSS            : R$ "+inss);
			System.out.println("FGTS                : R$ "+fgts);
			System.out.println("(-) Sindicato       : R$ "+sindicato);
			System.out.println("Total de Desconto   : R$ "+desconto);
			System.out.println("Salario Liquido     : R$ "+salarioLiquido);
		}
		
	}

}
