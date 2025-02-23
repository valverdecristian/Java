package Streams;

public class Main {

    public static void main(String[] args) {
        Demo.run();

        // por ejemplo sirve para una serie de fibonacci
        Creacion.creacion();

        DemoMap.run();

        System.out.println("flatMap:");
        DemoMap.flatMap();

        System.out.println("Dividir nuestro stream:");
        Slice.run();

        System.out.println("Collector");
        Collector.run();

        System.out.println("Particionado");
        Collector.particionado();

        Collector.grouping();
    }
}
