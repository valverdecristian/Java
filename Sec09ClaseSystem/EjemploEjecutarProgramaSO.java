package Sec09ClaseSystem;

import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                proceso = rt.exec("notepad");
            } else {
                proceso = rt.exec("gedit");
            }

            // queda esperando a que cerremos el programa
            proceso.waitFor();

        } catch (Exception e) {
            System.err.println("El comando es desconocido " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor");
    }
}
