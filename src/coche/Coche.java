package coche;

public class Coche {
    private int numPuertas;

    public Coche(int numPuertas){
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas(){
        return numPuertas;
    }
    public void añadirPuerta() {
        numPuertas++;
    }
}
