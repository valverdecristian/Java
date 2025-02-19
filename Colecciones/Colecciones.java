package Colecciones;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Colecciones {
    public static void main(String[] args) {
        // Interface List
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        System.out.println(lista);

        // Conjunto
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("Java");  // No se permiten duplicados
        System.out.println(conjunto);

        // Mapa
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Java", 1);
        mapa.put("Python", 2);
        System.out.println(mapa);
    }
}