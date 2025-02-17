package Excepciones;

public class Main {
    public static void main(String[] args) {

        Demo.comprobado();


        try {
            int resultado = 10 / 0; // 🚨 Error: división por cero
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
        
        // capturar multiples Excepciones
        try {
            String texto = null;
            System.out.println(texto.length()); // 🚨 NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Intentaste acceder a un objeto nulo.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error desconocido.");
        }
        

        // otra forma mas compacta
        try {
            int numero = Integer.parseInt("abc"); // 🚨 NumberFormatException
            System.out.println(numero);
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Ocurrió un error específico.");
        }
        
        // personalizada
        Validador validador = new Validador();

        try {
            validador.verificar(false);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Excepcion atrapada: " + e.getMessage());
        }
    }
}
