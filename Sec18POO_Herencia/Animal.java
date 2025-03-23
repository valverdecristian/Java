package Sec18POO_Herencia;

// superclase
public class Animal {

    private String nombre;

    public Animal(){
        System.out.println("Inicializando contructor de Animal...");
    }

    public Animal(String nombre) {
        this();
        this.nombre = nombre;
    }

    // get y set
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String hacerSonido() {
        return "El animal hace un sonido";
    }

    @Override
    public String toString() {
        return "El animal se llama " + this.getNombre();
    }
}