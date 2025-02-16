public class Garzon implements Atendible {
    @Override
    public void atender() {
        System.out.println("Atendiendo al cliente");
    }

    @Override
    public String toString() {
        return "Soy un Garzon, listo para atender";
    }
}
