public class Futbol extends Deporte {
	private String tipoCampo;
	private String localVisita;

	public Futbol() {
		super(nombre);
		this.tipoCampo = tipoCampo;
		this.localVisita = localVisita;
	}

	public String getTipoCampo() {
		return tipoCampo;
	}

	public void setTipoCampo(String tipoCampo) {
		this.tipoCampo = tipoCampo;
	}

	public String getLocalVisita() {
		return localVisita;
	}

	public void setLocalVisita(String localVisita) {
		this.localVisita = localVisita;
	}
}