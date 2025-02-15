package Interfaces;

public class Main {
    public static void main(String[] args) {
        Garzon g1 = new Garzon();
        Garzon g2 = new Garzon();
        Garzon g3 = new Garzon();

        Restaurante r = new Restaurante();
        r.setGarzones(new Atendible[]{g1,g2,g3});


        r.llevarCerveza();
    }
}
