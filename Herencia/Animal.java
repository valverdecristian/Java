package Herencia;

// superclase
public class Animal {

    public String nombre;

    // constructor de la super clase
    public Animal(String nombre) {
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

    public static void main(String[] args) {
        // Perro perro = new Perro("Rex");
        // perro.hacerSonido();

        // aplicando polimorfismo
        Animal miAnimal = new Perro("Rex", 8);  // Referencia de la superclase
        
        // Downcasting explicito
        Perro miPerro = (Perro) miAnimal;

        System.out.println(miAnimal.hacerSonido());  // Llama al método sobrescrito en Perro

        Gato gato = new Gato("Felix", 9);
        System.out.println(gato.hacerSonido());

        Animal miAnimal2 = miAnimal; // tienen el mismo hashCode

        System.out.println(miAnimal.hashCode());
        System.out.println(miAnimal2.hashCode());

        // al tener el mismo hashCode y usar equals dara true
        // el resultado cambia ya que sobrescribimos equals
        System.out.println(miAnimal.equals(miAnimal2));

        System.out.println(miAnimal.toString());

        // upcasting: en el objeto gato si puedo acceder a correr, pero no con perro
        gato.correr();
        // miAnimal.correr(); // ❌ ERROR: No se puede acceder a métodos de Perro
        miPerro.correr(); // ✅ Ahora sí se puede acceder a métodos de Perro
    }
}