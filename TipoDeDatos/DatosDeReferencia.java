package TipoDeDatos;

public class DatosDeReferencia {
    
    public static void main(String[] args) {
        // Clases: String, ArrayList, Scanner, etc.
        // Los Strings son inmutables
        String a = new String("Hola mundo");
        String b = a;
        String c = a.toUpperCase();
    
        System.out.println(b);
        System.out.println(c);


        // Arrays: int[], String[], etc.
    
        // Interfaces
    }
}

/**
 * CARACTERISTICAS:
 *  Almacenamiento indirecto: Almacenan una referencia al objeto.
 *  Tamaño variable: depende del objeto al que hacen referencia.
 *  Mutables: los objetos pueden cambiar.
 *  Menos eficientes: ocupan mas memoria y son mas lentos que los Datos Primitivos.
 */