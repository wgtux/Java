
// VER SE DIGITOU VOCAL OU CONSOANTE

import java.util.Scanner;

public class ExQuatro {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Digite uma letra: "); 
		String l = scanner.next();
			
		if(l.equalsIgnoreCase("a") ||l.equalsIgnoreCase("e")||l.equalsIgnoreCase("i") || l.equalsIgnoreCase("o")||l.equalsIgnoreCase("u")){
			System.out.println("Voc� digitou uma vocal ");
		}
		else{
			System.out.println("Voc� digitou uma consoante");
		}
		
		
	}

}
