package Metodos;

public class ParametrosYArgumentos {
    public static void main(String[] args) {
        // argumento: es el valor que le vamos a pasar al metodo llamado.
        otroMetodo("Cristian");
    }

    // parametro es lo que esta acompañando al metodo como ser String nombre
    static void otroMetodo(String nombre){
        System.out.println("Mi nombre es " + nombre);
    }
}
