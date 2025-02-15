package InyeccionDeDependencias;

public class MotorElectrico implements Motor {
    @Override
    public void encender() {
        System.out.println("Motor eléctrico encendido.");
    }
}
