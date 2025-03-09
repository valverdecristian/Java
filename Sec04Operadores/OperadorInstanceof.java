package Sec04Operadores;

public class OperadorInstanceof {
    public static void main(String[] args) {
        
        String texto = "creando un string";
        Integer num = 20;

        boolean b1 = texto instanceof String;
        boolean b2 = num instanceof Integer;

        System.out.println("texto es del tipo String: " + b1); // true
        System.out.println("el numero es del tipo Integer: " + b2); // true
    }
}