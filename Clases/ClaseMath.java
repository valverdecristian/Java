package Clases;

public class ClaseMath {
    public static void main(String[] args) {
        
        // abs: valor absoluto
        int absoluto = Math.abs(-15);
        System.out.println(absoluto);

        // ceil: redondeo para arriba
        System.out.println(Math.ceil(10.4));

        // floor: redondeo para abajo
        System.out.println(Math.floor(10.2));

        // random: devuelve un valor aleatorio entre 0 y 1
        double random = Math.random();
        System.out.println((int)(random * 100));
    }
}
