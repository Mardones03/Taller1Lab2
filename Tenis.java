public class Tenis extends Deporte {
	private String tipoSuperficie;
	private String individualDobles;

	public Tenis() {
		super(nombre);
		this.tipoSuperficie = tipoSuperficie;
		this.individualDobles = individualDobles;
	}

	public String getTipoSuperficie() {
		return tipoSuperficie;
	}

	public void setTipoSuperficie(String tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public String getIndividualDobles() {
		return individualDobles;
	}

	public void setIndividualDobles(String individualDobles) {
		this.individualDobles = individualDobles;
	}
}