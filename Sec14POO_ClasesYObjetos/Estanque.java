package Sec14POO_ClasesYObjetos;

public class Estanque {

    private int capacidad;

    public Estanque() {
        capacidad = 40;
    }

    public Estanque(int capacidad) {
        this();
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
