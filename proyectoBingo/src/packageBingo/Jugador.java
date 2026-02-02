package packageBingo;

public class Jugador {
    private String nombre;
    private Carton carton;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.carton = new Carton();
    }

    public String getNombre() {
        return nombre;
    }

    public Carton getCarton() {
        return carton;
    }
}