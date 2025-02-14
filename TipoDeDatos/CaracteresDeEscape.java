package TipoDeDatos;

public class CaracteresDeEscape {
    public static void  main(String[] args){
        String texto = "Hola \"mundo\".";
        String saltoDeLinea = "Estoy\nsaltando\nlineas";
        System.out.println(texto);
        System.out.println(saltoDeLinea);
    }
}

/**
 * COMO QUEREMOS ESCAPAR A LAS COMILLAS DOBLES DE LA PALABRA "MUNDO" DEBEMOS USAR
 * LA BARRA INVERTIDA "\"
 */
