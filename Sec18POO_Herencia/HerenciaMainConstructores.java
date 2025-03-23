package Sec18POO_Herencia;

public class HerenciaMainConstructores {
    public static void main(String[] args) {

        // aplicando polimorfismo
        Animal miAnimal = new Perro("Rex", 8);  // Referencia de la superclase
        // Downcasting explicito
        Perro miPerro = (Perro) miAnimal;
        System.out.println("== USANDO EL TOSTRING DE LA CLASE PADRE E HIJA");
        System.out.println(miPerro.toString());

        System.out.println(miAnimal.hacerSonido());  // Llama al método sobrescrito en Perro

        Gato gato = new Gato("Felix", 2, "Siames");

        // como Gato tiene el toString sobreescrito no hace falta invocarlo de forma explicita.
        System.out.println(gato);

        imprimir(gato);

    }

    public static void imprimir(Animal animal){
        System.out.println("Imprimiendo datos en comun del tipo Animal:");
        System.out.println(animal.getNombre());

        if(animal instanceof Gato){
            System.out.println("raza del gato: " + ((Gato)animal).getRaza());
        }
    }

}
