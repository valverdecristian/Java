# 5️⃣ Programación Funcional

## 📌 Expresiones Lambdas

Son una forma concisa de escribir implementaciones de interfaces funcionales (interfaces con un solo método abstracto) en Java. <br>
Facilitan la Programación Funcional (FP), eliminando la necesidad de crear clases anonimas innecesarias. <br>
No requieren nombre ni modificadores de acceso. <br>
Se pueden usar con `metodos por referencia`.

### 📍 Métodos por referencia

En Java podemos referenciar metodos estáticos o de instancia en lugar de escribir expresiones lambda explicitas. <br>

💡 Ejemplo de equivalencias entre Lambda y Método por Referencia:

```java
push(message -> System.out.println(message)); // Expresión Lambda
push(System.out::println); // Método por referencia
```

### 💡 Tipos de referencia a métodos

1. Referencia a un método estático

```java
push(Demo::metodo);

// equivalente a:
push(message -> Demo.metodo(message));
```

2. Referencia a un método de instancia de un objeto en particular

```java
Demo demo = new Demo("mensaje");
push(demo::metodoInstancia);

// equivalente a:
push(message -> demo.metodoInstancia(message));
```

3. Referencia a un método de instancia de un objeto arbitrario de un tipo específico

```java
push(String::toUpperCase);

// equivalente a:
push(message -> message.toUpperCase());
```

4. Referencia a un constructor

```java
push(Demo::new);

// equivalente a:
push(message -> new Demo(message));
```

<br>

### 📍 Interfaces Funcionales en Java

Java provee varias **interfaces funcionales** en el paquete `java.util.function` que se pueden usar con expresiones lambda.

| **Interfaz**     | **Parámetro** | **Retorno**  | **Descripción**                                       |
| ---------------- | ------------- | ------------ | ----------------------------------------------------- |
| `Consumer<T>`    | ✅            | ❌           | Ejecuta una acción sobre `T` y no devuelve resultado. |
| `Supplier<T>`    | ❌            | ✅           | No recibe parámetros, pero devuelve un resultado `T`. |
| `Function<T, R>` | ✅            | ✅           | Toma `T` y devuelve `R` (transformación).             |
| `Predicate<T>`   | ✅            | ✅ (boolean) | Evalúa una condición y retorna `true` o `false`.      |

### 📍 **Ejemplo de Uso**

```java
import java.util.function.*;

public class EjemploInterfacesFuncionales {
    public static void main(String[] args) {
        // Consumer: imprime el mensaje (retorna void)
        Consumer<String> consumer = message -> System.out.println("Mensaje: " + message);
        consumer.accept("Hola");

        // Supplier: retorna un valor sin recibir parámetros
        // sirve para poder retrasar la ejecucion de un metodo, util para fechas en DB.
        Supplier<Double> supplier = () -> Math.random();
        System.out.println("Número aleatorio: " + supplier.get());

        // Function: transforma un String a su longitud
        Function<String, Integer> function = String::length;
        System.out.println("Longitud: " + function.apply("Lambda"));

        // Predicate: verifica si la longitud de una palabra es mayor a 5
        Predicate<String> predicate = word -> word.length() > 5;
        System.out.println("¿Es largo? " + predicate.test("Lambda"));
    }
}
```

<br>

### 📍 Composición de Function

Es una tecnica en programacion funcional (FP) donde combinamos multiples funciones pequeñas para formar una nueva funcion mas compleja. <br>
Esto se puede lograr usando metodos como `addThem()` y `compose()` en la interfaz `Function<T, R>`. <br>
📢 `andThen` encadena multiples funcione, ejecutandolas en secuencia: primero la funcion original y luego la nueva. Tambien se usa en `Consumer<T>` para ejecutar varias acciones consecuentemente. <br>
📢 `compose` ejecuta primero la nueva función y luego la original. <br>
❌ Evitar **NullPointerException**: si alguna de las funciones es `null`, se lanzara un NullPointerException.

<br>

### 📍 Composición de Predicate

Podemos combinar multiples `Predicate` usando metodos como:
* `and(Predicate<T> other)`: ambas condiciones deben ser `true`.
* `or(Predicate<T> other)`: al menos una condicion debe ser `true`.
* `negate()`: invierte el resultado.
* `test(T t)`: evalua la condicion y devuelve true o false.
* `isEqual(Object targetRef)`: devuelve un Predicate que compara si el valor es igual al especificado.
* 📢 se usa mucho con `filter()` en `Stream`.

```java
// AND(Predicate<T> other)
Predicate<Integer> esPar = num -> num % 2 == 0;
Predicate<Integer> esMayorA10 = num -> num > 10;

Predicate<Integer> esParYMayorA10 = esPar.and(esMayorA10);
System.out.println(esParYMayorA10.test(12)); // true (es par y >10)
System.out.println(esParYMayorA10.test(8)); // false (es par pero no >10)


// ISEQUAL()
Predicate<String> esHola = Predicate.isEqual("Hola");
System.out.println(esHola.test("Hola")); // true
System.out.println(esHola.test("Chau")); // false
```

<br>

### 📍 UnaryOperator y BinaryOperator
`UnaryOperator<T>` y `BinaryOperator<T>` son interfaces funcionales en el paquete `java.util.function`, que extienden `Function<T, R`. <br>
Se usan para aplicar operaciones sobre un valor (Unary) o combinar dos valores (Binary). <br>

1) **UnaryOperator** toma un valor y devuelve otro del mismo tipo despues de aplicarle una operacion.

```java
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        
        // incrementar un numero
        UnaryOperator<Integer> incrementar = num -> num + 1;
        System.out.println(incrementar.apply(5)); // 6

        // convertir texto a mayusculas
        UnaryOperator<String> aMayusculas = String::toUpperCase;
        System.out.println(aMayusculas.apply("hola")); // HOLA

    }
}
```

<br>

2) **BinaryOperator** recibe dos valores del mismo tipo y devuelve otro del mismo tipo. Se usa mucho en reducciones, como `reduce()` en `Stream`.

```java
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

      // Sumar dos numeros
      BinaryOperator<Integer> sumar = (a, b) -> a + b;
      System.out.println(sumar.apply(5, 3)); // 8

      // Obtener el String mas largo
      BinaryOperator<String> masLargo = (a, b) -> a.length() > b.length() ? a : b;
      System.out.println(masLargo.apply("Hola", "Programación")); // "Programación"

    }
}
```

<br>

## 📌 Streams

Los `Streams` permiten procesar secuencias de elementos de manera funcional y declarativa. Los Streams facilitan operaciones como el filtrado, la transformación y la agregación de datos de una manera fluida y concisa.

<br>

### 📍 Caracteristicas principales de Streams
✅ Inmutables → No modifican la colección original, sino que generan nuevos resultados. <br>
✅ Pueden ser secuenciales o paralelos → `stream()` vs `parallelStream()`. <br>
✅ Pueden trabajar con operaciones intermedias y terminales. <br>
✅ Lazy Evaluation (Evaluación perezosa) → las operaciones intermedias no se ejecutan hasta que no se llama a una operación terminal. <br>

### 📍 Ejemplo básico de Stream

```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan", "Ana", "Carlos", "Pedro", "María");

        // Usando Stream para filtrar nombres que comienzan con "C" y mostrarlos
        nombres.stream()
               .filter(n -> n.startsWith("C")) // Intermedia: Filtra los nombres que empiezan con "C"
               .map(String::toUpperCase)      // Intermedia: Convierte a mayúsculas
               .forEach(System.out::println); // Terminal: Imprime el resultado
    }
}
```

### 📍 Operaciones en Streams: Intermedias y Terminales

**OPERACIONES INTERMEDIAS (transforman el Stream)** <br>
🔹 `filter(Predicate<T>)` → Filtra elementos según una condición. <br>
🔹 `map(Function<T, R>)` → Transforma cada uno de los elemento. <br>
🔹 `flatMap(Function<T, Stream<R>>)` → Aplana estructuras de datos anidadas. <br>
🔹 `sorted(Comparator<T>)` → Ordena los elementos. <br>
🔹 `distinct()` → Elimina duplicados. <br>
🔹 `limit(n)` → Toma los primeros n elementos. <br>
🔹 `skip(n)` → Salta los primeros n elementos. <br>
🔹 `takeWhile(Predicate<T>)` → Toma elementos desde el inicio del Stream hasta que la condicion deje de cumplirse. <br>
🔹 `dropWhile(Predicate<T>)` → Descarta elementos desde el inicio del Stream mientras la condicion se cumpla. 📌 Nota: A diferencia de filter(), no analiza todo el Stream, solo los elementos iniciales. <br>

**OPERACIONES TERMINALES (ejecutan el Stream)** <br>
🔹 `forEach(Consumer<T>)` → Itera sobre los elementos. <br>
🔹 `collect(Collectors.toList())` → Convierte el Stream en una lista. <br>
🔹 `count()` → Cuenta los elementos del Stream. <br>
🔹 `reduce(BinaryOperator<T>)` → Reduce los elementos de un `Stream<T>` a un único resultado. <br>
🔹 `reduce(T identidad, BinaryOperator<T>)` → Tiene un valor identidad que se usa cuando el Stream esta vacio. Devuelve un T directamente, sin `Optional<T>`
🔹 `findFirst()` → Retorna el primer elemento (opcional). <br>
🔹 `findAny()` → Retorna cualquier elemento (opcional). <br>
🔹 `anyMatch(Predicate<T>)` → Retorna true si algún elemento cumple la condición. <br>
🔹 `allMatch(Predicate<T>)` → Retorna true si todos cumplen la condición. <br>
🔹 `noneMatch(Predicate<T>)` → Retorna true si ningun elemento cumple la condición. <br>
🔹 `toArray()` → Convierte el Stream en un array. <br>

### 📍 flatMap(`Function<T, Stream<R>>`)
`flatMap` es una operacion intermedia que se utiliza para transformar cada elemento de un Stream en otro Stream y luego aplanar los resultados en un solo Stream. Es util cuando se trabaja con estructuras de datos anidadas o cuando cada elemento se mapea a multiples elementos. <br> <br>

Diferencia entre `map()` y `flatMap()`: <br>
* map(): transforma cada elemento en otro elemento, **sin aplanar**.
* flatMap(): transforma y aplana estructuras anidadas, convirtiendo `Stream<Stream<T>>` en `Stream<T>`.

<br>

📢 **Cuándo usar flatMap()** <br>
✅ Cuando trabajas con listas dentro de listas y necesitas una única lista plana. <br>
✅ Cuando tienes cadenas de texto separadas por espacios y necesitas palabras individuales. <br>
✅ Cuando tienes objetos con listas internas y quieres un único flujo de datos. <br>

### 📍 Ejemplo

```java
import java.util.List;
import java.util.stream.Stream;

public class EjemploFlatMapStrings {
    public static void flatMap() {
        var stream = Stream.of(List.of(1,2,3), List.of(4,5));

        stream.flatMap(l -> l.stream())
            .forEach(System.out::println);
    }
}
```

📢 Conclusión:

* Usa `map()` cuando transformas cada elemento de forma individual.
* Usa `flatMap()` cuando necesitas transformar y aplanar datos anidados.

### 📍 Creación de Streams con `iterate()` y `generate()`

Java proporciona dos formas de generar Streams infinitos: <br>
* `iterate(seed, function)`: genera una secuencia aplicando una función repetitivamente.
* `generate(Supplier<T>)`: genera valores sin depender del anterior, util para valores aleatorios y constantes.

```java
// 1) con el metodo iterate
var s = Stream.iterate(0, x -> x +1);
s.limit(5).forEach(x -> System.out.println(x)); // no olvidar el metodo LIMIT

// 2) con el metodo generate
Stream.generate(() -> new Random().nextInt(100))
      .limit(5)
      .forEach(x -> System.out.println(x));
```

📢 Nota: Como ambos Streams pueden ser infinitos, es importante usar `.limit(n)` para evitar ejecuciones interminables.

### 📍 Peek()
El metodo `peek()` se usa para depurar y visualizar elementos dentro de un Stream sin modificar su flujo. Es util para ver como se tranforman los elementos.

<br>

### 📍 Reducers (metodos terminales)
Los reducers en Java re refieren a operaciones de reducción que combinan los elementos de un `Stream` en un solo resultado. <br>
Principales metodos:
* `reduce()`: aplica una funcion acumuladora a los elementos del Stream y devuelve un unico valor.
* `collect()`: convierte un Stream en una colección.
* metodos de resumen: `sum()`, `count()`, `min()`, `max()`.

<br>

### 📍 Collectors
Es una clase utilitaria en Java. <br>
Proporciona metodos estaticos para recopilar elementos de un `Stream` en estructuras como listas, conjuntos, mapas o cadenas de texto. <br>
Se usa con el método `collect()` de los Stream. <br>
Permite agrupar (`groupingBy()`), particionar (`partitioningBy()`) y unir (`joining()`) datos de forma eficiente.

<br>

1) Convertir un Stream en List o Set

```java
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploCollectors {
    public static void main(String[] args) {
        Stream<String> nombresStream = Stream.of("Ana", "Juan", "Pedro", "Ana");

        List<String> listaNombres = nombresStream.collect(Collectors.toList());
        System.out.println(listaNombres); // [Ana, Juan, Pedro, Ana]

        // Convertir a un Set (elimina duplicados)
        Set<String> setNombres = Stream.of("Ana", "Juan", "Pedro", "Ana")
                                       .collect(Collectors.toSet());
        System.out.println(setNombres); // [Ana, Juan, Pedro]
    }
}
```
<br>

2) Unir elementos en un String con joining()

```java
import java.util.List;
import java.util.stream.Collectors;

public class EjemploCollectorsJoining {
    public static void main(String[] args) {
        List<String> nombres = List.of("Java", "Streams", "Collectors");

        String resultado = nombres.stream()
                                  .collect(Collectors.joining(" - "));

        System.out.println(resultado); // Java - Streams - Collectors
    }
}
```

<br>

### 📍 Range()
El metodo `range()` pertenece a la clase IntStream y LongStream, dentro del paquete java.util.stream. Se usa para generar un flujo de numeros en un rango especifico, excluyendo el valor final. <br>
Para incluir el valor final utilizamos `rangeClosed()`.

```java
// sintaxis:
IntStream.range(inicio, fin)
LongStream.range(inicio, fin)
```