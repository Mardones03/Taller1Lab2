import java.util.List;

public class Club {
	private List<Equipo> equipos;
	private List<Entrenador> entrenadores;
	private List<Deportista> deportistas;

	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);
	}

	public void removerEquipo(Equipo equipo) {
		equipos.remove(equipo);
	}

	public void agregarEntrenador(Entrenador entrenador) {
		entrenadores.add(entrenador);
	}

	public void removerEntrenador(Entrenador entrenador) {
		entrenadores.remove(entrenador);
	}

	public void agregarDeportista(Deportista deportista) {
		deportistas.add(deportista);
	}

	public void removerDeportista(Deportista deportista) {
		deportistas.remove(deportista);
	}
}