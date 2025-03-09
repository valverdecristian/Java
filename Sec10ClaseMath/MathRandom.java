package Sec10ClaseMath;

public class MathRandom {
    public static void main(String[] args) {
        
        // numeros entre 0 y 1 (1 se excluye)
        double random = Math.random();
        System.out.println("random = " + random);

        random = Math.floor(random);

        System.out.println("random = " + random);
    }
}
