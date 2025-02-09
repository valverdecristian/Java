package Interfaces;

public interface Volador {
    void volar();
}

class Pajaro implements Volador {
    @Override
    public void volar() {
        System.out.println("El pájaro vuela.");
    }

    public static void main(String[] args) {
        Pajaro pajaro = new Pajaro();
        pajaro.volar();
    }
}
