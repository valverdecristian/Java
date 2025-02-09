package Herencia;

public class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }

    public static void main(String[] args) {
        // Perro perro = new Perro("Rex");
        // perro.hacerSonido();

        // aplicando polimorfismo
        Animal miAnimal = new Perro("Rex");  // Referencia de la superclase
        miAnimal.hacerSonido();  // Llama al método sobrescrito en Perro
    }
}