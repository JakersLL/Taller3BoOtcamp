package coche;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche(1);
        miCoche.añadirPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }
}
