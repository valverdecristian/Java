package Sec18POO_Herencia;

final class Gato extends Animal {
    int edad;
    String raza;

    public Gato(){
        System.out.println("Inicializando contructor de Gato");
    }

    public Gato(String nombre, int edad) {
        super(nombre); // invoco al contructor del padre
        this.edad = edad;
    }

    public Gato(String nombre, int edad, String raza) {
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
        // reutilizando un metodo de la clase padre (super)
        String x = super.hacerSonido();
        return "El gato maulla. " + x;
    }

    @Override
    public String toString(){
        return super.toString() + " y tiene " + this.getEdad() + " años de edad y es de raza " + this.getRaza();
    }

    public String correr() {
        return "El gato esta corriendo";
    }
}

