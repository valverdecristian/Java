package ClasesAbstractas;

public abstract class Figura {
    // Método abstracto (sin implementación)
    public abstract double calcularArea();

    // Método concreto (con implementación)
    public void mostrarTipo() {
        System.out.println("Esta es una figura.");
    }
}

class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método abstracto
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}