package Metodos;

public class MetodoConstructor {
    // Atributos
    String nombre;
    int edad;

    // METODO CONSTRUCTOR: tiene el mismo nombre que la clase
    public MetodoConstructor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase MetodoConstructor
        MetodoConstructor mc = new MetodoConstructor("Juan", 30);
        mc.saludar();
    }
}
