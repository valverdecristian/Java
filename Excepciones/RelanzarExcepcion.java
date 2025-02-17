package Excepciones;

public class RelanzarExcepcion {
    public static void main(String[] args) {
        try {
            metodoPrincipal();
        } catch (Exception e) {
            System.out.println("Excepción capturada en main: " + e.getMessage());
        }
    }

    public static void metodoPrincipal() throws Exception {
        try {
            metodoLanzaExcepcion();
        } catch (Exception e) {
            System.out.println("Excepción capturada y manejada en metodoPrincipal.");
            // Aquí podríamos hacer algo antes de relanzarla, por ejemplo, registrar en un log.
            throw e; // Relanzamos la excepción
        }
    }

    // metodoLanzaExcepcion() lanza una excepcion y
    // metodoPrincipal() la atrapa en su catch y la relanza con "throw e";
    public static void metodoLanzaExcepcion() throws Exception {
        throw new Exception("Ocurrió un error en metodoLanzaExcepcion");
    }
}