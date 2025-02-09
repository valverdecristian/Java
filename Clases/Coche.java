package Clases;

public class Coche {
    // Atributos (propiedades)
    String marca;
    String modelo;
    int año;

    // Constructor
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método (comportamiento)
    public void arrancar() {
        System.out.println("El coche " + marca + " " + modelo + " está arrancando.");
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 2020);
        miCoche.arrancar();  // Llamar al método arrancar
    }
}