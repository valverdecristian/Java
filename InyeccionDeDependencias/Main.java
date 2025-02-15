package InyeccionDeDependencias;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto(new MotorCombustible());
        auto1.arrancar();

        Auto auto2 = new Auto(new MotorElectrico());
        auto2.arrancar();
    }
}
