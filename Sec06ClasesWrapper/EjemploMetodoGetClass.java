package Sec06ClasesWrapper;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
    }
}
