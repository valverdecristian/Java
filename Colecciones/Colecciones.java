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

        // Interface Set: no se permiten elementos duplicados
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("Java");
        System.out.println(conjunto);

        // Mapa
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Java", 1);
        mapa.put("Python", 2);
        System.out.println(mapa);
    }
}