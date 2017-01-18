
public class Motorista extends Funcionario {
	
	private String cnh;
	private String placa;
	
	public Motorista (int ma, String nom, double sal, String cn, String pla ){
		super (ma, nom, sal);
		this.cnh = cn;
		this.placa = pla;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
}
