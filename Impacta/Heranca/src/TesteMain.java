
public class TesteMain {
	public static void main(String[] args) {
		Motorista m = new Motorista (32156, "Fulano de Tal", 2500.60, "289575Y", "JAV-3215");
		
		System.out.println("Matricula: "+ m.getMatricula());
		System.out.println("Nome: "+ m.getNome());
		System.out.println("Salario: "+m.getSalario());
		System.out.println("CNH: "+m.getCnh());
		System.out.println("Placa: "+m.getPlaca());
	}

}
