package Lambda.previo;

public class Main {
    public static void main(String[] args) {
        Demo.run();
    }
}

/** Analisis:
 *  El codigo usa Interfaces Funcionales y Polimorfismo para manejar notificaciones.
 *  
 *  1) Main.java
 *      - Es el punto de entrada del programa.
 *      - Llama a Demo.run()
 * 
 *  2) Demo.java
 *      - Ejecuta push(new Notification())
 *      - push() recibe un objeto que implementa Notificable y llama a su metodo push(String message)
 * 
 *  3) Notificable.java
 *      - Es una interfaz funcional que define un único método push(String message)
 * 
 *  4) Notification.java
 *      - Implementa la interfaz Notificable y define la logica del metodo push(String message).
 *      - Muestra un mensaje en pantalla cuando se llama.
 */