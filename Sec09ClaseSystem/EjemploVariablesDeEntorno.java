package Sec09ClaseSystem;

import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        
        Map<String, String> varEnv = System.getenv();
        System.out.println("variables de ambiente del sistema = " + varEnv);

        System.out.println("--- Listando variables de entorno del sistema ---");
        for (String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }

        System.out.println("--- Fin del listado ---");

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("temDir = " + tempDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        // PODEMOS CREAR NUESTRAS PROPIAS VARIABLES DE ENTORNO desde
        // "variables de entorno" en propiedades del sistema.

        // desde LA TERMINAL: setx VARIABLE "valor en comillas" si es una sola
        // palabra las comillas se pueden omitir
    }
}
