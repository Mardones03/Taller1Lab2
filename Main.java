import java.util.List;

public class Main {
    public static void main(String[] args) {

        Club club = new Club();
        Entrenador entrenador = new Entrenador("Marcelo", "Bielsa", "Marcelo@bie.com", "123456", "10 años", "Fútbol");
        Deportista jugador1 = new Deportista("Alexis", "Sanchez", "Alexis@san.com", "987654", new Futbol(), "Delantero");
        Deportista jugador2 = new Deportista("Rafael", "Nadal", "Rafa@nadal.com", "654321", new Tenis(), "Doubles");


        club.agregarEntrenador(entrenador);
        club.agregarDeportista(jugador1);
        club.agregarDeportista(jugador2);

        Equipo equipo = new Equipo("Equipo de Basquetbol", null);
        club.agregarEquipo(equipo);
        club.asignarEntrenadorEquipo(equipo, entrenador);
        club.asignarJugadoresEquipo(equipo, List.of(jugador1, jugador2));

    }

}