package PropiedadEstatica;

// Archivo: ConexionBD.java (el nombre del archivo debe coincidir con la clase pública)

public class ConexionBD {
    public static void main(String[] args) {
        System.out.println("Aplicación: " + Constantes.NOMBRE_APLICACION);
        System.out.println("Conectando a la base de datos: " + Constantes.DB_URL);

        for (int i = 1; i <= Constantes.MAX_INTENTOS_CONEXION; i++) {
            System.out.println("Intento de conexión #" + i);
            // Simular lógica de conexión
        }

        System.out.println("Conexión exitosa.");
    }
}

// Clase no pública (no puede ser accedida desde fuera de este archivo)
class Constantes {
    // Propiedades estáticas y finales
    static final String NOMBRE_APLICACION = "MiApp";
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    static final int MAX_INTENTOS_CONEXION = 3;
}