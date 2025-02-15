package InyeccionDeDependencias;

public class MotorCombustible implements Motor {
    @Override
    public void encender() {
        System.out.println("Motor de combustible encendido");
    }
}
