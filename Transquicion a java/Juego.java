package Proyecto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Juego {

    private int numJugadores;
    private ArrayList<Integer> puntJugador = new ArrayList<>();
    private String idJuego;
    private LocalDate fechaSistema;
    private LocalTime horaSistema;
    private String idioma;

    public Juego() {}

    public Juego(int numJugadores, ArrayList<Integer> puntJugador, String idJuego, LocalDate fechaSistema, LocalTime horaSistema, String idioma) {
        this.numJugadores = numJugadores;
        this.puntJugador = puntJugador;
        this.idJuego = idJuego;
        this.fechaSistema = fechaSistema;
        this.horaSistema = horaSistema;
        this.idioma = idioma;
    }

    public void agregarPuntuacion(int puntos) {
        puntJugador.add(puntos);
    }

    public ArrayList<Integer> getPuntJugador() {
        return puntJugador;
    }

    public String getGanadorDeCadaJuego() {
        if (puntJugador.isEmpty()) return "Sin puntuaciones.";

        int max = puntJugador.get(0);
        int index = 0;

        for (int i = 1; i < puntJugador.size(); i++) {
            if (puntJugador.get(i) > max) {
                max = puntJugador.get(i);
                index = i;
            }
        }

        return "Jugador " + (index + 1) + " con " + max + " puntos.";
    }
}
