public class Basquetbol extends Deporte {
	private String tipoCancha;
	private int nroTiempos;

	public Basquetbol(String nombre) {
		super();
	}

	public String getTipoCancha() {
		return this.tipoCancha;
	}

	public void setTipoCancha(String tipoCancha) {
		this.tipoCancha = tipoCancha;
	}

	public int getNroTiempos() {
		return this.nroTiempos;
	}

	public void setNroTiempos(int nroTiempos) {
		this.nroTiempos = nroTiempos;
	}
}