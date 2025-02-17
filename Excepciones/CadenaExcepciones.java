package Excepciones;

public class CadenaExcepciones {
    public static void main(String[] args) {
        try {
            metodoA();
        } catch (Exception e) {
            System.out.println("Excepción atrapada en main: " + e.getMessage());
            System.out.println("Causa original: " + e.getCause());
        }
    }

    public static void metodoA() throws Exception {
        try {
            metodoB();
        } catch (Exception e) {
            throw new Exception("Error en metodoA", e); // Encadena la excepción
        }
    }

    public static void metodoB() throws Exception {
        throw new Exception("Error en metodoB"); // Excepción original
    }
}