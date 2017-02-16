
public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Weslen";
		nome = nome+" Gomes";
		nome = nome + " de Almeida";
		
		System.out.println(nome);
		
		//Criando String de forma correta sem ocupar mais espaço na memoria
		
		StringBuilder no = new StringBuilder("Weslen");
		no.append(" Gomes");
		no.append(" de Almeida");
		
		System.out.println(nome);

	}

}
