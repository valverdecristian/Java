package Sec07ValorVsReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10,11,12,13,14};

        System.out.println("iniciamos el metodo main");

        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de llamar al metodo test");
        test(edad);
        System.out.println("Despues de llamar al metodo test");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }
    }

    public static void test(int[] edadArreglo) {
        System.out.println("Iniciamos el metodo test");
        for (int i = 0; i < edadArreglo.length; i++) {
            edadArreglo[i] += 20;
        }
        System.out.println("Finaliza el metodo test");
    }

}
