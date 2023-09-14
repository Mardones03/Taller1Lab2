import java.util.Date;
import java.util.List;
public class Persona {
	private String nombre;
	private String apellido;
	private String correo;
	private String numeroContacto;

	public Persona(String nombre, String apellido, String correo, String numeroContacto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.numeroContacto = numeroContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public String getNumeroContacto() {
		return numeroContacto;
	}
}