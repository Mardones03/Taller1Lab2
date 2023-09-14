import java.util.List;
import java.util.Vector;

public class Equipo {
	private String nombre;
	private List<Deportista> jugadores;
	private Entrenador entrenador;
	private List<Partido> historialPartidos;

	public Equipo(String nombre, Entrenador entrenador) {
		this.nombre = nombre;
		this.entrenador = entrenador;
	}

	public void agregarJugador(Deportista deportista) {
		jugadores.add(deportista);
	}

	public void removerJugador(Deportista deportista) {
		jugadores.remove(deportista);
	}

	public void agregarPartido(Partido partido) {
		historialPartidos.add(partido);
	}

	public void removerPartido(Partido partido) {
		historialPartidos.remove(partido);
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public void setJugadores(List<Deportista> jugadores) {
		this.jugadores = jugadores;
	}
}