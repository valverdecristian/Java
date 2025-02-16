import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] numerosEnStr = new String[]{"1","3","6"};

        // ArrayList
        var textos = new ArrayList<String>();
        var numeros = new ArrayList<Integer>();

        textos.addAll(Arrays.asList(numerosEnStr));
        textos.add("Chanchito Feliz");
        textos.add("Felipe");

        numeros.add(23);
        numeros.add(11);
        numeros.add(7);

        var primer = textos.getFirst();
        var ultimo = textos.getLast();
        var el = textos.get(0);

        System.out.println("primer = " + primer);
        System.out.println("textos = " + textos);
        System.out.println("ultimo = " + ultimo);
        System.out.println("el = " + el);
        System.out.println("numeros = " + numeros);


        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.setContenido("Hola Mundo");
        System.out.println(cajaTexto.getContenido()); // ✅ Hola Mundo

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.setContenido(42);
        System.out.println(cajaNumero.getContenido()); // ✅ 42


        System.out.println("\nCLASES GENERICAS");
        
        Lista<String> lista = new Lista<>();
        lista.add("primer elemento");
        lista.add("segundo elemento");

        var elemento = lista.get(0);
        System.out.println(elemento);


        System.out.println("\nINTERFACES COMO RESTRICCIONES");
        System.out.println("GENERICOS EN TIPO DE RETORNO");
        Lista2<Garzon> listaInterface = new Lista2<>();
        listaInterface.add(new Garzon()).add(new Garzon());

        Garzon elementoInterface = listaInterface.get(0);

        System.out.println(elementoInterface);

        System.out.println("\nMETODOS GENERICOS");
        var resultado = Utils.max(1,3);
        System.out.println("resultado = " + resultado);
    }
}