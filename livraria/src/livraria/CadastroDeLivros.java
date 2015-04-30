package livraria;

public class CadastroDeLivros {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
			autor.nome = "Rodrigo Turini";
			autor.email = "rodrigo.turini@caelum.com.br";
			autor.cpf = "123.456.789.10";
		
		Livro livro = new Livro();
			livro.nome = "Java 8 Pratico";
			livro.descricao = "Novos Recursos da Linguagem";
			livro.valor = 59.90;
			livro.isbn = "978-85-66250-46-6";
			livro.autor = autor;
			
		livro.mostrarDetalhes();
						
		Livro outroLivro = new Livro();
			outroLivro.nome = "Logica de Programação";
			outroLivro.descricao = "Crie seus proprios programas";
			outroLivro.valor = 59.90;
			outroLivro.isbn = "978-85-66250-22-0";
			outroLivro.autor = autor;
			
		outroLivro.mostrarDetalhes();
		
					
	}
	
}
