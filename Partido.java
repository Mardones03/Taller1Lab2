import java.util.Date;

public class Partido {
	private String equipoOponente;
	private String resultado;
	private Date fecha;
	private String lugar;

	public Partido(String equipoOponente, String resultado, Date fecha, String lugar) {
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

	public Date getFecha() {
		return fecha;
	}

	public String getLugar() {
		return lugar;
	}
}