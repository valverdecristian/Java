package Sec18POO_Herencia;

// subclase - usamos final para restringir la herencia
final class Perro extends Animal {
    int edad;
    String raza;

    // constructor de la superclase
    public Perro(String nombre, int edad) {
        super(nombre); // llama al constructor de la super clase
        this.edad = edad;
    }

    public Perro(String nombre, int edad, String raza) {
        this(nombre, edad);
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // sobreescribe un metodo con override =
    // polimorfismo en tiempo de ejecicion
    @Override
    public String hacerSonido() {
        return "El perro ladra";
    }

    @Override
    public String toString(){
        return super.toString() + " y tiene " + this.getEdad();
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
            return this.getNombre().equals(p.getNombre());
        }

        return super.equals(obj);
    }
}
