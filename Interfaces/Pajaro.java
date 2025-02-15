package Interfaces;

public class Pajaro implements Volador, Cantar {
    @Override
    public void volar() {
        System.out.println("El pájaro vuela.");
    }

    @Override
    public void cantar() {
        System.out.println("El pájaro canta.");
    }

    public static void main(String[] args) {
        Pajaro pajaro = new Pajaro();
        pajaro.volar();
        pajaro.cantar();
    }
}