package ClasesAbstractas;
import java.text.NumberFormat;

public class FormatoDeNumeros {
    public static void main(String[] args) {

        // Formateo con NumberFormat: permite formatear numeros segun
        // la configuracion regional (ejemplo: moneda)
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        String resultado = numberFormat.format(1099.90);
        System.out.println(resultado);

        
        // metodo String.format(): usa especificadores de formato y permite
        // controlar la cantidad de decimales
        double numero = 12345.5678;

        String formato1 = String.format("%.2f", numero);
        String formato2 = String.format("%,.2f", numero);

        System.out.println("Numero con dos decimales: "+formato1);
        System.out.println("Numero con separador de miles: "+formato2);
    }
}
