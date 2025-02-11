package FlujoDeControl;

public class EstructuraFor {
    public static void main(String[] args) {

        // en el FOR podemos usar brak y continue
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("3 no se imprime porque se salteo con CONTINUE");
                continue;
            }
            System.out.println("Iteración número: " + i);
        }

        // FOR, se usa mucho para recorrer elementos de un array
        System.out.println("FOR CON ARRAYS:");
        int[] numeros = { 10, 20, 30, 40 };

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);
        }

        // con FOR-EACH no se necesita manejar indices manualmente
        // Pero no se puede modificar los valores dentro del array.
        System.out.println("FOR-EACH:");
        int[] numeros2 = { 50, 60, 70, 80, 90 };

        for (int num : numeros2) {
            System.out.println("Número: " + num);
        }

    }
}

/** BREAK O CONTINUE
 *  Se pueden colocar dentro de un loop como for y while.
 */