public class Tenis extends Deporte {
	private String tipoSuperficie;
	private String individualDobles;

	public Tenis(String nombre, String descripcion) {
		super(nombre, descripcion);
	}

	public String getTipoSuperficie() {
		return this.tipoSuperficie;
	}

	public void setTipoSuperficie(String tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public String getIndividualDobles() {
		return this.individualDobles;
	}

	public void setIndividualDobles(String individualDobles) {
		this.individualDobles = individualDobles;
	}
}