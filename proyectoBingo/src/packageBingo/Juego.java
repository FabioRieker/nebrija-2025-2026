package packageBingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
// CONSTRUCTOR 
public class Juego {
    private ArrayList<Jugador> jugadores;
    private ArrayList<Integer> bombo;
    private ArrayList<Integer> bolingasExtraidas;

    private void prepararBombo() {
        bombo = new ArrayList<>();
        for (int i = 1; i <= 90; i++) {
            bombo.add(i);
        }
        Collections.shuffle(bombo); 
    }
// FUNCION PARA INICIAR LA LISTA :) 
    public Juego() {
        jugadores = new ArrayList<>();
        bolingasExtraidas = new ArrayList<>();
        prepararBombo();
    }
    
    
    public void agregarJugador(Jugador j) {
        jugadores.add(j);
    }

    public void iniciarPartida() {
        System.out.println("--- ¡COMIENZA EL BINGO! ---");
        for (Integer bola : bombo) {
            System.out.println("Ha salido el número: " + bola);
            bolingasExtraidas.add(bola);

            for (Jugador j : jugadores) {
                if (verificarGanador(j)) {
                    System.out.println("¡BINGO! El ganador es: " + j.getNombre());
                    j.getCarton().mostrarCarton();
                    return;
                }
            }
        }
    }

    private boolean verificarGanador(Jugador j) {
        return bolingasExtraidas.containsAll(j.getCarton().getNumeros());
    }
}