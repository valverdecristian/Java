package Colecciones;

// CLASE QUE IMPLEMENTA LA INTERFAZ Comparable
// PARA PODER ORDENAR UNA LISTA DE EjemploComparable debemos implementar Comparable
public class EjemploComparable implements Comparable<EjemploComparable>{
    private String nombre;

    // agregamos la interface Comparator
    private Integer edad;

    public Integer getEdad() {
        return this.edad;
    }

    public EjemploComparable(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(EjemploComparable otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
