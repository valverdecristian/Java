package ClasesAbstractas;
import java.text.NumberFormat;

public class FormatoDeNumeros {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        String resultado = numberFormat.format(1099.90);
        System.out.println(resultado);
    }
}
