package Colecciones;

import java.util.Iterator;

// copiado de la carpeta Generics
// la clase tiene que implementar Iterable
// (para poder tomar las instancias de Lista e itarlas)
public class Lista<T> implements Iterable<T> {
    private T[] data = (T[]) new Object[10];
    private int length = 0;

    public void add(T t){
        data[length++] = t;
    }

    // queremos obtener un elemento
    public T get(int index) {
        return data[index];
    }

    // implementamos el metodo iterator si o si
    @Override
    public Iterator<T> iterator() {
        return new ListaIterator(this);
    }

    // creamos una clase privada (que solo va a poder ser usada en este contexto)
    private class ListaIterator implements Iterator<T> {

        private Lista<T> lista;
        private int index = 0;

        // le pasamos la lista atravez de un constructor
        public ListaIterator(Lista<T> lista) {
            this.lista = lista;
        }


        @Override
        public boolean hasNext() {
            return this.index < this.lista.length;
        }

        @Override
        public T next() {
            return this.lista.data[this.index++];
        }
    }
}
