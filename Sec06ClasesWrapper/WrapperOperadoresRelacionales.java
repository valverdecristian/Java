package Sec06ClasesWrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // contienen la misma instancia.
        System.out.println("Son el mismo objeto? " + (num1==num2));

        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));
    }
}

/**
 *      El == en primitivos (y con boolean) compara por valor
 *      En Objectos compara por la instancia
 *
 */