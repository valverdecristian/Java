package Herencia;

class Gato extends Animal {
    int edad;

    // constructor de la superclase
    public Gato(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }


    // sobreescribe un metodo con override =
    // polimorfismo en tiempo de ejecicion
    @Override
    public String hacerSonido() {
        // reutilizando un metodo de la clase padre (super)
        String x = super.hacerSonido();

        return "El gato maulla. " + x;
    }

    @Override
    public String toString(){
        return this.nombre;
    }

    public String correr() {
        return "El gato esta corriendo";
    }
}

