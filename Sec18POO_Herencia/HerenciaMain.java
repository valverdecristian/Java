package Sec18POO_Herencia;

public class HerenciaMain {
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

        System.out.println("comparten el mismo hashCode");
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

        // class tiene toda la metadata de la clase
        Class claseGato = gato.getClass();
        // con este while navega-itera en la jerarquia de clase y muestra toda la info incluso el package
        while (claseGato.getSuperclass() != null){
            String hija = claseGato.getName();
            String padre = claseGato.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);

            claseGato = claseGato.getSuperclass();
        }
    }
}
