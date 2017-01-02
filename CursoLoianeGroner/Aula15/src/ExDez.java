// Turno de Estudo
import java.util.Scanner;

public class ExDez {

	private static Scanner s;
	
	public static void main(String[] args) {
		s =new Scanner (System.in);
		
		String t;
		
		System.out.println("Favor Digitar o turno de estudo: M-matutino, V-vespertino ou N-noturno");
		t=s.next();
		
		if (t.equalsIgnoreCase("m")){
			System.out.println("Bom Dia!");
		}
		else if (t.equalsIgnoreCase("v")){
			System.out.println("Boa Tarde!");
		}else if (t.equalsIgnoreCase("n")){
			System.out.println("Boa Noite!");
		}else
			System.out.println("Informação Invalida!");
	
		
	}

}
