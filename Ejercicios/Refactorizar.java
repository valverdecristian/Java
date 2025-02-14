package Ejercicios;

/** TAREA:
 *  - Extraer metodos:
 *      * Crear un método para calcular el descuento en función de la categoría y el precio.
 *      * Crear otro método para imprimir el mensaje de salida.
 *
 *  - Usar operador ternario: simplificar las condiciones if-else.
 *
 *  - Eliminar codigo repetitivo: evitar repetir la logica de descuento para cada categoria.
 *
 *  - Mejorar la legibilidad: usar nombres descriptivos para variables y metodos.
 *
 */

public class Refactorizar {
    public static void main(String[] args) {
        String categoria = "Electrónica";
        double precio = 1000.0;
        double descuento = 0.0;

        descuento = calcularDescuento(categoria, precio);

        imprimirDescuento(descuento);
    }

    static void imprimirDescuento(double descuento){
        String mensaje = (descuento > 0)
                ? "descuento aplicado: $"+descuento
                : "No se aplica descuento";

        System.out.println(mensaje);
    }

    static double calcularDescuento(String categoria, double precio){
        double descuento = 0.0;
        switch (categoria){
            case "Electronica":
                descuento = (precio > 500) ? precio * 0.20 : precio * 0.10;
                break;
            case "Ropa":
                descuento = (precio > 200) ? precio * 0.15 : precio * 0.05;
                break;
            case "Alimentos":
                descuento = (precio > 100) ? precio * 0.10 : precio * 0.02;
                break;
            default:
                descuento = 0.0;
        }

        return descuento;
    }
}