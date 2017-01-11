
public class TesteConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta (0001, "Weslen", 2000.00);
		Conta c2 = new Conta (0002, "Bertano", 1600.00);
		Conta c3 = new Conta (0003, "Fulano", 1800.00);

		System.out.println(c1.getDados());
		System.out.println(c2.getDados());
		System.out.println(c3.getDados());
	}

}
