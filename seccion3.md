# 3️⃣ Programación Genérica y Manejo de Datos

## 📌 Generics (Genericos)

- Permiten definir clases, interfaces y metodos que pueden trabajar con diferentes tipos de datos sin necesidad de duplicar codigo.
- Estas clases, interfaces o métodos solo pueden contener elementos del tipo especificado (String, Integer, etc.)
- Codigo reutilizable: mismo codigo para diferentes tipos sin duplicar lógica.
- Evita conversiones explicitas (no castings manuales).
- Codigo facil de entender.
- Solo pueden usarse con tipos de referencia: `String`, `Integer`, `Double`, etc.
- No se pueden usar tipos primitivos: `int`, `double`, `char`, etc.
- Para trabajar con primitivos, usamos sus clases contenedoras.
- Tambien podemos definir métodos genéricos: donde `T` es un parametro de tipo generico que se adapta a cualquier tipo de dato.
- Restricciones: si queremos limitar que tipos podemos agregar la palabra `extends`. Ejemplo:

```java
public class Lista <T extends Number> {}
```

- Tambien puede extender interfaces:

```java
public class Garzon implements Interface {}
```

- Si una clase necesita mas de un generico, se definen multiples parametros de tipo dentro de los corchetes angulares.

```java
public class Par <T, U> {
    private T primero;
    private T segundo;

    // constructor
    public Par(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    // En el metodo main especificamos el tipo de cada generic
}
```

### 📍 Metodos Genericos

- permiten definir operaciones reutilizables sin necesidad de que toda la clase sea genérica. Se usa <> justo antes del tipo de retorno.
  - Ejemplo:

```java
public static <T> void imprimirElemento(T elemento) {}
```

### 📍 Utils como convencion

- en muchos proyectos se usa Utils o Helper para agrupar métodos (estaticos) utilitarios.

### 📍 Wildcards (?)

- son comodines usados en genéricos cuando queremos trabajar con tipos genericos sin especificar un tipo exacto.
- Se usa en parametros de metodos cuando queremos flexibilidad sin definir un tipo especifico.

  1. Unbounded `?`
     - para listas de cualquier tipo (solo lectura, no add).
  2. Upper Bounded `? extends T`
     - solo permite leer elementos (no se puede agregar elementos).
  3. Lower Bounded `? super T`
     - para agregar elementos (no se puede leer elementos).

```java
package Wildcards;

import java.util.List;
import java.util.ArrayList;

public class WildcardEjemplo {
    // ✅ `?` Permite listas de cualquier tipo
    public static void imprimirLista(List<?> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }

    // ✅ `? extends Animal` → Puede recibir listas de Animal o subclases (Perro, Gato)
    public static void hacerSonidos(List<? extends Animal> animales) {
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }

    // ✅ `? super Perro` → Puede recibir List<Perro> o List<Animal> (pero NO List<Gato>)
    public static void agregarPerro(List<? super Perro> lista) {
        lista.add(new Perro()); // 👌 Se puede agregar un Perro
        // lista.add(new Animal()); // ❌ No se puede agregar Animal
        // lista.add(new Gato());   // ❌ No se puede agregar Gato
    }

    public static void main(String[] args) {
        // ✅ Lista de enteros
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        imprimirLista(numeros); // ✅ Funciona con cualquier tipo de lista

        // ✅ Lista de Animales
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());

        hacerSonidos(animales); // ✅ "Guau Guau!" "Miau Miau!"

        // ✅ Lista de Perros (subclase de Animal)
        List<Perro> perros = new ArrayList<>();
        perros.add(new Perro());
        perros.add(new Perro());

        hacerSonidos(perros); // ✅ Funciona porque `Perro extends Animal`

        // ✅ Usamos `? super Perro`
        agregarPerro(animales); // ✅ OK, porque List<Animal> es un supertipo de Perro
        agregarPerro(perros);   // ✅ OK, porque List<Perro> es Perro mismo
    }
}
```

<br>

## 📌 Colecciones

![Texto alternativo](https://cdn.codegym.cc/images/article/b00f3a19-6b56-487b-9f66-cd339b17304e/800.webp)

- Las colecciones en Java son estructuras `dinamicas` que permiten almacenar y manipular grupos de objetos de manera eficiente.
- Son mas flexibles que los arrays (porque pueden cambiar de tamaño).
- Las colecciones estan definidas dentro del paquete `java.util`.

### 📍 Framework Collections

- Iterable
- Collection
  - add
  - remove
  1. List
  2. Queue (Cola o fila)
     - FIFO (primer elemento)
     - LIFO (ultimo elemento)
  3. Set

### 📍 Interface Collection

La interfaz `Collection<E>` es una superinterfaz. Define metodos generales para manipular grupos de objetos, pero no se puede instanciar directamente.
Caracteristicas:

- Es generica (`<E>` representa el tipo de Elementos)
- Proporciona métodos como `add()`,`remove()`, `contains()`, etc.
- Se extiende en otras interfaces como `List`, `Set` y `Queue`.

### 📍 Jerarquia de Collection

             Collection<E>  (Interfaz principal)
                  │
        ┌─────────┴─────────┐
        │                   │
      List<E>              Set<E>
    (Permite duplicados)  (No permite duplicados)
        │                   │
    ArrayList<E>        HashSet<E>
    LinkedList<E>       TreeSet<E>
    Vector<E>           LinkedHashSet<E>

✅ Aunque no se puede instanciar directamente, podemos utilizar una implementacion concreta como `ArrayList`, `HashSet`, etc.

### 📍 Interface List

- Es una subinterfaz de `Collection<E>`.
- Permite elementos duplicados y mantiene el orden de inserción.
- Cada elemento tiene un índice (como los arrays)

Implementaciones comunes: <br>

    `ArrayList<E>` mas rapido para busquedas, basado en arrays.
    `LinkedList<E>` mas eficiente en inserciones/eliminaciones.
    `Vector<E>` similar a `ArrayList`, pero sincronizado.

- Metodos Principales de `List<E>`
  - `add(E e)`: agrega un elemento.
  - `get(int index)`: obtiene un elemento en una posicion especifica.
  - `set(int index, E e)`: modifica un elemento.
  - `remove(int index)`: elimina un elemento en una posicion especifica.
  - `indexOf(E e)`: devuelve la posicion de un elemento.
  - `size()`: devuelve la cantidad de elementos.

### 📍 Interface Comparable

- Permite ordenar objetos personalizados mediante el metodo `compareTo(T o)`.
- Podemos crear una clase que implementa `Comparable`.
  - `class MiClase implement Comparable<MiClase>`
- Implementaciones deben sobrescribir `compareTo()`.
- Se usa en `Collections.sort()` y estructuras de datos ordenadas (`TreeSet`, `TreeMap`)

### 📍 Interface Set (Conjunto)

Un `Set` representa un conjunto de elementos únicos, sin duplicados. <br>
No garantiza orden: `HashSet` no mantiene un orden especifico. <br>
Opera con conjuntos: operaciones como `union`, `diferencia` e `inserccion`.

### 📍 Interface Deque (Cola de Doble extremos)

Una `Deque` es una lista lineal que permite insertar y eliminar elementos desde ambos extremos. <br>
Las Deques se pueden implementar utilizando arrays o listas enlazadas. <br>
Puede actuar como una pila (Stack) o como una cola (Queue). <br>
Implementaciones comunes: `ArrayDeque` y `LinkedList`. <br>

### 📍 Interface Map

La interfaz `Map<K, V>` representa una estructura de datos clave-valor. <br>
No extiende de Collections. <br>
✔ Cada clave (K) es única (no puede haber claves duplicadas). <br>
✔ Cada clave está asociada a un valor (V), que puede repetirse. <br>
✔ Permite valores `null`, pero solo una clave `null`. <br>

### 📍 Principales implementaciones de `Map<K, V>`

- `HashMap<K, V>`: no garantiza orden, insercion rápida.
- `LinkedHashMap<K, V>`: mantiene el orden de inserción.
- `TreeMap<K, V>`: ordena las claves de forma natural o con un `Comparator`.
- `Hashtable<K, V>`: similar a `HashMap`, pero sincronizado (hilo seguro).

### 📍 Metodos Principales de `Map<K, V>`

- `put(K clave, Valor)`: agrega un par clave-valor (si la clave ya existe, sobrescribe el valor).
- `get(K clave)`: devuelve el valor asociado a la clave o null si no existe.
- `remove(K clave)`: elimina el par clave-valor.
- `containsKey(K clave)`: verifica si la clave existe en el Map.
- `containsValue(V valor)`: verifica si el valor existe en el Map.

### 📍 Recorriendo un `Map<K, V>`

- Usando `entrySet()`

```java
for (Map.Entry<String, Integer> entrada : stock.entrySet()) {
    System.out.println(entrada.getKey() + " -> " + entrada.getValue());
}
```

- Usando `keySet()`

```java
for (String clave : stock.keySet()) {
    System.out.println(clave);
}
```

- Usando `values()`

```java
for (Integer cantidad : stock.values()) {
    System.out.println(cantidad);
}
```