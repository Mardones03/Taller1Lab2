import java.util.ArrayList;
import java.util.List;

public class Club {
	private List<Equipo> equipos;
	private List<Entrenador> entrenadores;
	private List<Deportista> deportistas;

	public Club() {
		equipos = new ArrayList<>();
		entrenadores = new ArrayList<>();
		deportistas = new ArrayList<>();
	}

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

	public void asignarEntrenadorEquipo(Equipo equipo, Entrenador entrenador) {
		if (equipos.contains(equipo) && entrenadores.contains(entrenador)) {
			equipo.setEntrenador(entrenador);
		} else {
			System.out.println("No se pudo asignar el entrenador al equipo.");
		}
	}

	public void asignarJugadoresEquipo(Equipo equipo, List<Deportista> jugadores) {
		if (equipos.contains(equipo)) {
			equipo.setJugadores(jugadores);
		} else {
			System.out.println("No se pudieron asignar los jugadores al equipo.");
		}
	}

}