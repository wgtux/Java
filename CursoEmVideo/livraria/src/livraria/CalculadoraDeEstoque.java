package livraria;

public class CalculadoraDeEstoque {
	
	public static void main(String[] args){
	
		double soma = 0;
		
		for (double i= 0; i<35; i++){
			soma +=59.9;
		}
		
		System.out.println("O total do estoque é: R$" +soma);
		
		if (soma<150){
			System.out.println("Seu estoque esta muito baixo!");
		}
		else if(soma>=2000){
			System.out.println("Seu estoque esta muito alto!");
		}
		else{
			System.out.println("Seu estoque esta bom!");
		}
		
		
	}
}


