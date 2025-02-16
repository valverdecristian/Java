package Wildcards;

import java.util.List;
import java.util.ArrayList;

public class WildcardEjemplo {
    // ✅ `?` Permite listas de cualquier tipo
    public static void imprimirLista(List<?> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }

    // ✅ `? extends Animal` → Puede recibir listas de Animal o subclases (Perro, Gato)
    public static void hacerSonidos(List<? extends Animal> animales) {
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }

    // ✅ `? super Perro` → Puede recibir List<Perro> o List<Animal> (pero NO List<Gato>)
    public static void agregarPerro(List<? super Perro> lista) {
        lista.add(new Perro()); // 👌 Se puede agregar un Perro
        // lista.add(new Animal()); // ❌ No se puede agregar Animal
        // lista.add(new Gato());   // ❌ No se puede agregar Gato
    }

    public static void main(String[] args) {
        // ✅ Lista de enteros
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        imprimirLista(numeros); // ✅ Funciona con cualquier tipo de lista

        // ✅ Lista de Animales
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());

        hacerSonidos(animales); // ✅ "Guau Guau!" "Miau Miau!"

        // ✅ Lista de Perros (subclase de Animal)
        List<Perro> perros = new ArrayList<>();
        perros.add(new Perro());
        perros.add(new Perro());

        hacerSonidos(perros); // ✅ Funciona porque `Perro extends Animal`

        // ✅ Usamos `? super Perro`
        agregarPerro(animales); // ✅ OK, porque List<Animal> es un supertipo de Perro
        agregarPerro(perros);   // ✅ OK, porque List<Perro> es Perro mismo
        
        System.out.println("Ejemplo con wildcards completado!");
    }
}
