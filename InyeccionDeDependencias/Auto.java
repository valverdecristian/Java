package InyeccionDeDependencias;

// Auto ya NO depende de una implementacion especifica de Motor
// Auto funciona con cualquier tipi de Motor
public class Auto {
    private Motor motor; // dependencia inyectada.

    // se pasa el Motor al constructor en lugar de instanciarlo dentro de la clase
    public Auto(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        motor.encender();
        System.out.println("El auto esta en marcha.");
    }
}
