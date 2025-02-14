package Metodos;

public class MetodoEstatico {
    static String tableName = "user123";
    double id = Math.random();
    String name;

    MetodoEstatico(String name) {
        this.name = name;
    }

    public void saludar() {
        System.out.println("Hola mundo, soy " + tableName);
    }

    public static void guardar() {
        System.out.println("guardando usuario en " + tableName);
    }

    public static void main(String[] args) {
        MetodoEstatico metodoEstatico = new MetodoEstatico("Cristian");

        System.out.println(metodoEstatico.name);
        MetodoEstatico.guardar();
    }
}
