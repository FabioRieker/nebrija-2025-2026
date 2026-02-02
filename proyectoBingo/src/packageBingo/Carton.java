package packageBingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Carton {
    private ArrayList<Integer> numeros;

    public Carton() {
        this.numeros = new ArrayList<>();
        generarCeldasCarton();
    }

    private void generarCeldasCarton() {
        Random rand = new Random();
        
 
        for (int i = 0; i < 9; i++) {
            int min = (i * 10) + 1;
            int max = (i * 10) + 10;
            
            ArrayList<Integer> rangoActual = new ArrayList<>();

            while (rangoActual.size() < 2) {
                int num = rand.nextInt(max - min + 1) + min;
                if (!rangoActual.contains(num)) {
                    rangoActual.add(num);
                }
            }
            
            this.numeros.addAll(rangoActual);
        }
        Collections.sort(this.numeros); 
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void mostrarCarton() {
        System.out.println("Cartón: " + numeros);
    }
}