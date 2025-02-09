package Metodos;
public class MetodosString {
    public static void main(String[] args)
    {
        String texto = "Hola mundo";

        int longitud = texto.length();
        System.out.println(longitud);

        String reemplazo = texto.replace("Hola", "Chau");
        System.out.println(reemplazo);
    }
}

// MAS METODOS:

// toUpperCase() -> convierte la cadena a mayusculas
// toLowerCase() -> convierte la cadena a minusculas
// trim() -> elimina los espacios en blanco al principio y al final de la cadena
// replace(char oldChar, char newChar) -> reemplaza todas las ocurrencias de un caracter por otro.

// chartAt(int index) -> devuelve el caracter en la posicion especificada.

// indexOf(String str) -> devuelve la posicion de la 1ra ocurrencia, sino devuelve -1
// lastIndexOf(String str) -> devuelve la posicion de la ultima ocurrencia
// cointains(CharSequence s) -> verifica si la cadena contiene la secuencia pasada.

// equals(Object obj) -> compara la cadena con el objeto especificado.
// equalsIgnoreCase(String otraCadena) -> lo mismo, ignora mayusculas y minusculas.

// endsWith(); -> devuelve true o false dependiendo si coincide en como termina el texto
// startsWith(); -> lo mismo, pero al reves.
// isEmpty() -> verifica si la cadena esta vacia (longitud 0 = true)

// split(String regex) -> divide la cadena en un arreglo de subcadenas
// join(CharSequence delimitador, CharSequence... elementos) -> une varias cadenas usando un delimitador.