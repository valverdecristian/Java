package Herencia;

// subclase
class Perro extends Animal {
    int edad;

    // constructor de la superclase
    public Perro(String nombre, int edad) {
        super(nombre); // llama al constructor de la super clase
        this.edad = edad;
    }


    // sobreescribe un metodo con override
    @Override
    public String hacerSonido() {
        return "El perro ladra";
    }

    @Override
    public String toString(){
        return this.nombre;
    }

    public String correr() {
        return "El perro esta corriendo";
    }
}
