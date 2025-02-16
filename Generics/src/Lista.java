

public class Lista<T>{
    private T[] data = (T[]) new Object[10];
    private int length = 0;

    public void add(T t){
        data[length++] = t;
    }

    // queremos obtener un elemento
    public T get(int index) {
        return data[index];
    }
}
