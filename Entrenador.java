public class Entrenador extends Persona {
	private String experiencia;
	private String especialidadDeportiva;

	public Entrenador(String nombre, String apellido, String correo, String numeroContacto, String experiencia, String especialidadDeportiva) {
		super(nombre, apellido, correo, numeroContacto);
		this.experiencia = experiencia;
		this.especialidadDeportiva = especialidadDeportiva;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public String getEspecialidadDeportiva() {
		return especialidadDeportiva;
	}
}
