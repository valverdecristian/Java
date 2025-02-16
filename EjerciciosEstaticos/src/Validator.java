/** CONSIGNA:
 *  Realizar una clase llamada Validator que posea un método estatico llamado Validar
 *  con la siguiente firma: bool Validar(int valor, int min, int max).
 *  valor: dato a validar. min: minimo valor incluido. max: maximo valor incluido.
 *
 *  Pedir al usuario que ingrese 5 numeros enteros. Validar con el metodo desarrollado
 *  anteriormente que estén dentro del rango -100 y 100.
 *
 *  Terminado el ingreso mostrar el valor minimo ingresado, valor maximo y promedio.
 */

public class Validator {
    final static int MIN = -100;
    final static int MAX = 100;

    public static boolean Validar(int valor){
        return valor >= MIN && valor <= MAX;
    }
}