public class Futbol extends Deporte {
	private String tipoCampo;
	private String localVisita;

	public Futbol(String nombre, String descripcion) {
		super(nombre, descripcion);
	}

	public String getTipoCampo() {
		return this.tipoCampo;
	}

	public void setTipoCampo(String tipoCampo) {
		this.tipoCampo = tipoCampo;
	}

	public String getLocalVisita() {
		return this.localVisita;
	}

	public void setLocalVisita(String localVisita) {
		this.localVisita = localVisita;
	}
}