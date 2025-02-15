package Herencia;

// subclase
class Perro extends Animal {
    int edad;

    // constructor de la superclase
    public Perro(String nombre, int edad) {
        super(nombre); // llama al constructor de la super clase
        this.edad = edad;
    }


    // sobreescribe un metodo con override =
    // polimorfismo en tiempo de ejecicion
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

    // comparando objetos
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Perro) {
            // no basta con solo preguntar si obj es intancia de Perro
            // sino que tambien tenemos que hacer el casting
            var p = (Perro)obj;
            return this.nombre.equals(p.nombre);
        }

        return super.equals(obj);
    }
}
