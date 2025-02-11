public class SobrecargaDeConstructores {
    String nombre;
    int edad;

    // Constructor sin parámetros
    public SobrecargaDeConstructores() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    // Constructor con solo el nombre
    public SobrecargaDeConstructores(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    // Constructor con nombre y edad
    public SobrecargaDeConstructores(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        SobrecargaDeConstructores p1 = new SobrecargaDeConstructores();              // Usa el constructor sin parámetros
        SobrecargaDeConstructores p2 = new SobrecargaDeConstructores("Carlos");      // Usa el constructor con un parámetro
        SobrecargaDeConstructores p3 = new SobrecargaDeConstructores("Ana", 25);     // Usa el constructor con dos parámetros

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
    }
}