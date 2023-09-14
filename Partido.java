import java.util.Vector;

public class Partido {
	private String equipoOponente;
	private String resultado;
	private String fecha;
	private String lugar;

	public Partido(String equipoOponente, String resultado, String fecha, String lugar) {
		this.equipoOponente = equipoOponente;
		this.resultado = resultado;
		this.fecha = fecha;
		this.lugar = lugar;
	}

	public String getEquipoOponente() {
		return equipoOponente;
	}

	public String getResultado() {
		return resultado;
	}

	public String getFecha() {
		return fecha;
	}

	public String getLugar() {
		return lugar;
	}
}