package Sec10ClaseMath;

import java.util.Random;

public class ClaseRandom {
    public static void main(String[] args) {

        // el objeto random es mas amplio
        Random randomObj = new Random();

        // retorna numeros negativos y positivos
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);
        
        double randomDouble = randomObj.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        // si le paso un numero por argumento, sera el limite del random
        // en este caso del 0 al 7 (7 no se incluye)
        int randomInt2 = randomObj.nextInt(7);
        System.out.println("random limitado entre 0 y 7 = " + randomInt2);

        // random entre 10 y 25
        int randomInt3 = 15 + randomObj.nextInt(25 - 15);

        System.out.println("random entre 10 y 25 = " + randomInt3);
    }
}
