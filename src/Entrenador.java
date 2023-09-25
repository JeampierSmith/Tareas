import java.util.ArrayList;
import java.util.List;

public class Entrenador {
    private List<Jugador> jugadores;

    public Entrenador() {
        this.jugadores = new ArrayList<>();
    }
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void obtnerLista() {
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }
}
