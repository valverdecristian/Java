package Variables;

public class SistemaNumerico {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        int numeroBinario = 0b1111;
        // sistema octal se antepone el 0 (cero)
        // sistema hexadecimal se antepone el 0x

        System.out.println("numeroDecimal = "+numeroDecimal);
        System.out.println(numeroDecimal + " a numero binario es: "+ Integer.toBinaryString(numeroDecimal));

        System.out.println("numeroBinario = "+ numeroBinario);
        System.out.println("a numero decimal es: " + numeroBinario); // lo muestra en decimal
    }
}
