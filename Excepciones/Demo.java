package Excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {
    public static void suma() {
        // null significa ausencia de valor.
        sumando(null);
    }

    public static Integer sumando(Integer i) {
        return i + 2;
    }

    // forzando una excepcion con throw (lanzando excepciones)
    // solamente nos veremos obligado a colocar el bloque try-catch siemore
    // y cuando la excepcion que estemos lanzando manualmente sea una
    // excepcion comprobada (en este caso usamos IllegalArgumentException)
    public static void validarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("Debes ser mayor de 18 años.");
        }
    }

    // COMPROBADOS
    public static void comprobado() {
        try {
            FileReader fr = new FileReader("Archivo_inexistente.txt");
        } catch (FileNotFoundException e) {
            // throw new RuntimeException(e);
            System.out.println("Archivo no existe");
        }

        System.out.println("app continua...");
    }


    // FALTARIA EJEMPLO DE UN METODO QUE LANCE UNA EXCEPCION

}
