package ClasesAbstractas;

// la clase Figuta no puede instanciarse directamente porque es abstracta.
public abstract class Figura {
    // Método abstracto (sin implementación == SOLO SE DECLARA == no tiene cuerpo)
    // debe ser implementado por las subclases
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