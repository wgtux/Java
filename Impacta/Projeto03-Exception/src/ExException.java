import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExException {

	public static void main(String[] args) {
		
		try{
			
			FileReader reader = new FileReader("c:\\xpto\\temp.txt");
			//FileReader reader = new FileReader("c:\\WPI_Log.txt");
			System.out.println("Arquivo foi lido com sucesso.");
		}
		catch (FileNotFoundException e){
			System.out.println("Arquivo não encontrado." +e.getMessage());
			//e.printStackTrace(); //Mostra o erro detalhado para o programador.
			//getMessage - Mostra erro ocorrido sem detalhes
		}

	}

}
