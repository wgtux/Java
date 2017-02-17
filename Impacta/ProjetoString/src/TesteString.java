
public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Weslen";
		nome = nome+" Gomes";
		nome = nome + " de Almeida";
		
		System.out.println(nome);
		
		//Criando String de forma correta sem ocupar mais espaço na memoria
		
		StringBuilder no = new StringBuilder("Weslen")
				.append(" Gomes")
				.append(" de Almeida");
		
		System.out.println(no);

		
		//Deletando texto
		
		no.delete(0, 7);
		System.out.println(no);
		
		//Inserindo Texto na posição desejada
		
		no.insert(0, "WGTUX ");
		System.out.println(no);
	}

}
