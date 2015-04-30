package livraria;

public class Livro {
	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	//Metodo que mostra os detalhes do livro
	void mostrarDetalhes(){
		String mensagem = "Mostra detalhes dos Livros";
		System.out.println(mensagem);
		System.out.println("Nome: " +nome);
		System.out.println("Descrição: "+descricao);
		System.out.println("Valor: " +valor);
		System.out.println("ISBN: " +isbn);
		
		if (this.temAutor()){
			autor.mostrarDetalhes();
		}
		
		System.out.println("----------");
	}
	
	//Metodo com parametros para calcular desconto
	public void aplicaDescontoDe(double porcentagem){
		this.valor -=this.valor*porcentagem;
	}
	
	//Metodo com retorno de valor para verificar se o autor existe
	boolean temAutor(){
		return this.autor !=null;
	}

}
