package TiposBasicos;
// variables y tipos de datos
public class TiposPrimitivos {
    public static void main(String[] args) {
        byte edad = 18; // entre -128 y 127 (1 byte)
        short corto = -32768; // entre -32768 y 32767 (2 bytes)
        int entero = 10;  // entero (4 bytes)
        float flotante = 10.5f;
        double decimal = 10.5;
        char caracter = 'A';
        boolean esVerdadero = true;

        System.out.println(entero);
        System.out.println(edad);
        System.out.println(corto);
        System.out.println(decimal);
        System.out.println(flotante);
        System.out.println(caracter);
        System.out.println(esVerdadero);
    }
}

// LONG: utiliza 8 bytes

// snippet: sout -> System.out.println();

// tener en cuenta el alcance, si la variable se declara dentro de unas llaves
// no se podra acceder por fuera de ellas.