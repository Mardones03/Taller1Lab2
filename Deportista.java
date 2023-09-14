public class Deportista extends Persona {
	private Deporte deporte;
	private String posicion;

	public Deportista(String nombre, String apellido, String correo, String numeroContacto, Deporte deporte, String posicion) {
		super(nombre, apellido, correo, numeroContacto);
		this.deporte = deporte;
		this.posicion = posicion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public String getPosicion() {
		return posicion;
	}
}