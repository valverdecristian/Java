package Sec10ClaseMath;

public class ClaseMath {
    public static void main(String[] args) {

        // La clase Math es una clase que no se puede instanciar
        // abs: valor absoluto
        int absoluto = Math.abs(-15);
        System.out.println("absoluto = " + absoluto); // 15

        // ceil: redondeo para arriba
        double techo = Math.ceil(10.4);
        System.out.println("techo = " + techo); // 11

        // floor: redondeo para abajo
        double piso = Math.floor(10.2);
        System.out.println("piso = " + piso);

        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero); // 3

        // random: devuelve un valor aleatorio entre 0 y 1
        double random = Math.random();
        System.out.println((int)(random * 100));

        double max = Math.max(3.4, 1.2);
        System.out.println("max de double = " + max);
        
        double exponencial = Math.exp(2);
        System.out.println("exponencial = " + exponencial);
        
        double logaritmo = Math.log(10);
        // toma como base la constante e
        System.out.println("logaritmo = " + logaritmo);
        
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);
        
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("grados = " + grados);
    }
}
