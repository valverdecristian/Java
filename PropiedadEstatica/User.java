package PropiedadEstatica;

/** PROPIEDAD ESTATICA:
 *      Es una variable que pertenece a la clase (en lugar de a una instancia de la clase)
 *      Se declara usando la palabra clave "static".
 *      Estas propiedades se comparten entre TODAS LAS INSTANCIAS de la clase y
 *      existen desde el momento en que la clase se carga en memoria hasta que el programa termina.
 *
 * CARACTERISTICAS de las PROPIEDADES ESTÁTICAS:
 *      Compartidas: todas las instancias de la clase comparten la misma prop. estatica.
 *      Inicializacion unica: se inicializan una sola vez.
 *      Acceso directo: usando el nombre de la clase.
 *
 *      Si queremos que la propiedad estatica no cambie, podemos hacerla "final", asi su valor
 *      no podra modificarse despues de su inicializacion.
 *
 */

public class User {
    // Propiedad estática y final (no puede cambiar)
    public static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";

    public static void main(String[] args) {
        System.out.println("Conectando a la base de datos: " + DB_URL);

        // Intentar cambiar la URL (esto causará un error de compilación)
        // DB_URL = "jdbc:mysql://localhost:3306/otraDatabase";  // Error: No se puede asignar un valor a una variable final
    }
}
