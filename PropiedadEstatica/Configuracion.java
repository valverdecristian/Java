package PropiedadEstatica;

public class Configuracion {
    // Propiedades estáticas y finales (no pueden cambiar)
    public static final String NOMBRE_APLICACION = "MiApp";
    public static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        System.out.println("Nombre de la aplicación: " + NOMBRE_APLICACION);
        System.out.println("Versión: " + VERSION);

        // Intentar cambiar las propiedades (esto causará un error de compilación)
        // NOMBRE_APLICACION = "OtraApp";  // Error: No se puede asignar un valor a una variable final
        // VERSION = "2.0.0";             // Error: No se puede asignar un valor a una variable final
    }
}