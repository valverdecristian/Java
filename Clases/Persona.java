package Clases;
public class Persona {
    // Atributos
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método: para poder hacer referencia a una propiedad puedo usar la palabra
    // reservada this (this.nombre, etc.)
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan", 30);
        persona.saludar();
    }
}