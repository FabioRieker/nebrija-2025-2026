package packageBingo;

public class Main {
    public static void main(String[] args) {
        Juego bingo = new Juego();

        Jugador j1 = new Jugador("Labubu");
        Jugador j2 = new Jugador("Mortarion");

        bingo.agregarJugador(j1);
        bingo.agregarJugador(j2);

        System.out.println("Cartón de " + j1.getNombre() + ":");
        j1.getCarton().mostrarCarton();
        
        System.out.println("Cartón de " + j2.getNombre() + ":");
        j2.getCarton().mostrarCarton();

        bingo.iniciarPartida();
    }
}