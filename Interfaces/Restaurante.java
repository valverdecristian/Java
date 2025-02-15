package Interfaces;

public class Restaurante {

    private Atendible[] garzones;

    // Inyeccion con setters
    public void setGarzones (Atendible[] garzones){
        this.garzones = garzones;
    }

    public void llevarCerveza() {
        for (var garzon: garzones){
            garzon.atenderMesa();
        }
    }
}
