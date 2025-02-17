package Excepciones;

// Ejemplo con BufferedReader
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploTryWithResources {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            System.out.println(br.readLine());  // Lee la primera línea del archivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/** ¿QUE HACE?
 *  - BufferedReader abre un archivo "archivo.txt".
 *  - Se usa dentro del bloque try.
 *  - Cuando termina el bloque, se cierra automaticamente (sin necesidad
 *      de br.close();).
 * 
 */