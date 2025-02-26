# Java (Academia Hola Mundo) 🚀

## 📌 Caracteristicas:

- Lenguaje orientado a objetos.
- Es multiplataforma.
- Manejo automático de memoria.
- Evolución permanente (Actualmente version 22).
- Fuertemente tipado.

<br>

## 📌 Versiones de Java:

- **JSE (Java Standard Edition)**
  - Usos: Aplicaciones de escritorio, herramientas de desarrollo, aplicaciones científicas, y cualquier aplicación que no necesite servicios avanzados o consumo de un servidor.
- **JEE/Jakarta (Java Enterprise Edition)**
  - Usos: Aplicaciones web, aplicaciones empresariales, sistemas de comercio electrónico, aplicaciones de banca en línea, sistemas de gestión empresarial, y cualquier aplicación que requiera transacciones, seguridad, y escalabilidad.
  - Incluye tecnologias como Servlets, JSP, EJB y frameworks como Spring.

### 📍 ¿Que es un IDE?

un **IDE** es un entorno de desarrollo integrado. Es una aplicación informática que proporciona servicios integrales para facilitarle al desarrollador o programador el desarrollo de software.
Ejemplos de un IDE para Java: Netbeans, Intellij o Eclipse.

## 📌 ¿Que necesitamos para programar en Java?

- ✅ Un IDE. Por ejemplo: [Descargar Intellij IDEA](https://www.jetbrains.com/es-es/idea/download/?section=windows)
- JRE (Java Runtime Environment).
- ✅ JDK (Java Development Kit): Incluye el compilador y JRE. [Descargar JDK](https://www.oracle.com/ar/java/technologies/downloads/)
  - Desde Java 9, el JRE viene incluido en JDK.

<br>

## 📌 POO en Java:

- **Clases**: se escriben en PascalCase.

  - Convencion:
    - atributos.
      - constantes (static final).
      - propiedades de instancia.
    - constructor.
    - getters y setters.
    - metodos: publicos, privados y finalmente los estaticos.

- **Objetos**: instancia de clase. Los objetos tienen Propiedades y Metodos(). Los objetos se escriben en camelCase.

<br>

Metodos():

- De Clase: se definen con `static`.
- De Objetos: dependen de una instancia.

<br>

## 📌 Control de flujo:

- Operadores de comparacion: `==, !=, <, >, etc.`
- Operadores logicos: `&&, ||, !`
- Condicionales: `if, if-else, if-else if-else, Switch`
- Operador ternario: `? :`
- Bucles: `for, while, do-while, for-each`
- Palabras claves: `break y continue`

<br>

## 📌 Entrada de datos con Scanner:
- El `Scanner` es una clase de Java que permite leer datos ingresados por el usuario.
- se debe importar: `java.util.Scanner;`
- crear un objeto: `Scanner scanner = new Scanner(System.in);`
- Metodos comunes:
  - `scanner.nextLine()`: leer una línea completa.
  - `scanner.nextInt()`: leer un número entero
  - `scanner.nextDouble()`: leer un número decimal.

```java
import java.util.Scanner;  // Importar Scanner

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear Scanner

        // Pedir y leer datos del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();  // Capturar String
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();  // Capturar entero
        
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();  // Capturar decimal
        
        System.out.print("Ingrese su inicial: ");
        char inicial = scanner.next().charAt(0);  // Capturar primer carácter
        
        // Mostrar la información capturada
        System.out.println("\n📌 Datos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Inicial: " + inicial);
        
        scanner.close(); // Cerrar el Scanner (buena práctica)
    }
}
```
💡 Consideraciones importantes
👉 Evitar errores al cambiar de tipo de datos: si se usa `nextInt()` o `nextDouble()` antes de `nextLine()`, puede quedar un salto de línea (`\n`) pendiente en el buffer. Se recomienda agregar un `scanner.nextLine()` despues de capturar números.

```java
System.out.print("Ingrese su edad: ");
int edad = scanner.nextInt();
scanner.nextLine(); // Consumir el salto de línea

System.out.print("Ingrese su nombre: ");
String nombre = scanner.nextLine();
```

<br>

### 📍 Clase Math
La clase `Math` es una utilidad que proporciona métodos y constantes para realizar operaciones matemáticas comunes. No es necesario importarla ni crear una instancia para usarla.

* `Math.random()`: genera un número aleatorio entre `0.0` y `1.0`.
* `Math.abs(x)`: devuelve el valor absoluto de `x`.
* `Math.max(a,b)`: deuvelve el mayor entre `a` y `b`.
* `Math.round(x)`: redondea al entero mas cercano.
* `Math.pow(base, exp)`: calcula `base^exponente`.
* `Math.sqrt(x)`: calcula la raiz cuadrada de `x`.

<br>

### 📍 Formato de numeros

- `String.format("formato", valor)`
  * `%d`: entero.
  * `%f`: numero decimal.
  * `%nf`: numero decimal con `n` decimales.

- `DecimalFormat`: permite definir formatos personalizados para números, como la cantidad de decimales o el uso de separadores.

- `NumberFormat.getCurrencyInstance()`: permite dar formato de monera local a un número.

- `NumberFormat.getPercentInstance()`: permite formatear un numero como porcentaje.

<br>

### 📍 Overloading (Sobrecarga)
Es cuando un mismo metodo o constructor tiene multiples versiones con diferentes parametros (cantidad o tipo).

- Method Overloading (Sobrecarga de metodos).
  - Podemos definir varios metodos con el mismo nombre, pero con diferente numero o tipo de parametros.

```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
    
    // Método sobrecargado para sumar tres números enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    // Método sobrecargado para sumar dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("Suma de 2 enteros: " + calc.sumar(5, 10));       // 15
        System.out.println("Suma de 3 enteros: " + calc.sumar(5, 10, 15));  // 30
        System.out.println("Suma de 2 decimales: " + calc.sumar(5.5, 2.2)); // 7.7
    }
}
```

- Constructor Overloading (Sobrecarga de constructores).
  - Se usa cuando queremos inicializar objetos de diferentes maneras.

```java
public class Persona {
    String nombre;
    int edad;

    // Constructor sin parámetros (valores por defecto)
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    // Constructor con un parámetro (nombre)
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    // Constructor con dos parámetros (nombre y edad)
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona();               // Usa el constructor sin parámetros
        Persona p2 = new Persona("Ana");          // Usa el constructor con un parámetro
        Persona p3 = new Persona("Carlos", 25);   // Usa el constructor con dos parámetros

        p1.mostrarInfo(); // Nombre: Desconocido, Edad: 0
        p2.mostrarInfo(); // Nombre: Ana, Edad: 0
        p3.mostrarInfo(); // Nombre: Carlos, Edad: 25
    }
}
```

<br>

### 📍 Package (Paquete)

- Sirve para organizar clases e interfaces en grupos.
- Mejora la modularidad.
- Cada archivo de Java debe hacer referencia al paquete que pertenece.
- Se puede importar un paquete en otra clase con la palabra clave `import`.

```java
import miPaquete.MiClase; // importa una clase de "miPaquete".
import miPaquete.*; // importa todas las clases de "miPaquete".
```

<br>

### 📍 Estructura de carpetas

```java
/proyecto/src/
 ├── miPaquete/
 │   ├── MiClase.java
 ├── otroPaquete/
 │   ├── OtraClase.java
 ├── Main.java
```

<br>

## 📌 Herencia:

- Es un concepto de la POO, que permite que una clase derive (herede) caracteristicas y comportamientos de otra.
- Esto ayuda a reutilizar codigo.
- Se implementa usando la palabra clave `extends`
- La `superclase` proporciona atributos y métodos.
- La `subclase` hereda esos atributos y metodos, y puede agregar o modificar su porpio comportamiento.
- Para cambiar el comportamiento de un metodo heredado usamos `@override`.
- Uso de `super` para acceder a la superclase:
  - que permite llamar al constructor de la superclase.
  - permite acceder a metodos de la superclase si fueron sobreescritos.

<br>

### 📍 Tipos de herencia

- Java no admite herencia multiple, pero si admite herencia jerarquica.

```java
class Perro extends Animal {} // Simple

class Perro extends Animal {} // Jerarquica
class Gato extends Animal {} // Jerarquica
```

- Si se necesita compartir codigo entre varias clases, se puede usar interfaces (con `implements`)

<br>

## 📌 Object:

- Todas las clases extienden de Object (es redundante agregarlo)
- Cuando creamos una nueva instancia de nuestra clase base podemos ver que tenemos acceso a metodos de Object.

<br>

### 📍 Métodos

- `equals(Object obj)`: compara si dos objetos son iguales. Por defecto, compara si son la misma instancia en memoria (misma referencia), pero se puede sobrescribir para comparar valores (sobrescribir equals).
- `hashCode()`: devuelve un numero entero que representa la posicion del objeto en memoria. Se usa en estructuras como `HashMap` y `HashSet`.
  - Si `equals` es sobrescrito, `hashCode` también debe serlo para mantener coherencia.
- `toString()`: devuelve una representación en texto del objeto. Por defecto, imprime el nombre de la clase y su referencia en memoria, pero se puede sobrescribir. (`@override de toString`)
- `getClass()`: devuelve la clase del objeto en tiempo de ejecución.

<br>

### 📍 Orden en el cual se ejecutan los contructores en Herencia

- Siempre se va a ejecutar primero el constructor de la superclase y luego se va a ejecutar el constructor de la subclase.
- Cuando usamos la palabra clave `super` estamos llamando explicitamente al constructor de la superclase desde la subclase. Sino Java llama automaticamente al constructor **SIN PARAMETROS** de la superclase.
  - Si la superclase no tiene un constructor sin parametros, es obligatorio llamar a `super(...)` en la subclase.

<br>

### 📍 Modificadores de acceso

- **private**: solo es accesible en la misma clase.
  - Uso común: atributos y metodos internos que no deben ser modificados desde fuera.
- **public**: accesible desde cualquier parte del código.
  - Uso común: métodos y atributos que deben ser accesibles globalmente.
- **protected**: accesible en la misma clase, en el mismo paquete y en subclases (herencia), pero no es accesible desde otras clases.
  - Uso común: métodos y atributos que deben ser accesibles en clases hijas, pero no en otra clases externas.
  - Problemas/MALA PRACTICA:
    - Rompe el principio de encapsulamiento.
    - Crea dependencias no deseadas.
    - Alternativa mas segura: usar private
- **default** (sin modificador): solo es accesible en la misma clase y en el mismo paquete.
  - Uso común: métodos y clases auxiliares dentro del mismo paquete.

<br>

### 📍 Method override

No es estrictamente necesario usar `@override` cuando sobrescribimos un metodo, pero es recomendable por las siguientes razones:

- ✅ Ayuda a detectar errores en tiempo de compilación.
- ✅ Mejora la legibilidad del código.
- ✅ Evita confusion con sobrecarga (overloading)

<br>

## 📌 Conversión de Objetos:

### 📍 Upcasting (Conversion de Subclase a Superclase)

Es cuando convertimos un objeto de una subclase en un objeto de su superclase.
Se hace automaticamente (casting implicito). <br>
No se pierde informacion, pero se limitan los metodos disponibles a los de la superclase. Ejemplo:

```java
Animal miAnimal = new Perro(); // Upcasting automático.
```

- miAnimal puede acceder a metodos de Animal, pero no se puede acceder a metodos de Perro (se trata como un Animal)

<br>

### 📍 Downcasting (Conversión de Superclase a Subclase)

Es cuando convertimos un objeto de una superclase en un objeto de su subclase. <br>
No es automatico (requiere casting explicito) <br>
Puede causar `ClassCastException`. <br>
Ejemplo:

```java
Animal miAnimal = new Perro(); // Upcasting
Perro miPerro = (Perro) miAnimal; // Downcasting explícito
miPerro.correr(); // ✅ Ahora sí se puede acceder a métodos de Perro
```

- Usar "instanceof" antes de un downcasting para evitar errores.

<br>

### 📍 Comparando objetos
Vamos a querer comparar distinos objetos en base a propiedades que estos tengan. Para estos casos podemos realizar el metodo `@override` de `equals`, ya que por defecto `equals()` compara si dos referencias apuntan al mismo objeto en memoria.

```java
class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Sobrescribimos equals() para comparar por contenido
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Si es el mismo objeto, son iguales
        if (obj == null || getClass() != obj.getClass()) return false; // Si no son del mismo tipo, son distintos
        
        Persona persona = (Persona) obj; // Convertimos obj a Persona
        return this.nombre.equals(persona.nombre); // Comparamos los nombres
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");

        System.out.println(p1.equals(p2)); // true (ahora compara nombres)
        System.out.println(p1.equals(p3)); // false (nombres diferentes)
    }
}
```

<br>

## 📌 Polimorfismo:

- Es uno de los pilares fundamentales de la POO.
- Permite que una misma accion se comporte de manera diferente según el objeto que la ejecute.

### 📍 Tipos

- Polimorfismo en tiempo de compilacion (Method overloading | sobrecarga de metodos)
- Polimorfismo en tiempo de ejecucion (Method overriding | sobreescritura de métodos usando herencia)

<br>

## 📌 Clases y Métodos Abstractos:

- Se utilizan para definir comportamientos genéricos que deben ser implementados por las subclases.

### 📍 Clase Abstracta

- es una clase que no puede instanciarse directamente.
- Sirve como base para otras clases.
- Puede contener `METODOS ABSTRACTOS` (sin implementacion == solo se declara, no tiene llaves ni cuerpo) y `METODOS CONCRETOS` (con implementacion dentro de la clase abstracta, osea posee un cuerpo {} con instrucciones que se ejecutaran cuando se llame al método.)

### 📍 Metodo Abstracto

- debe ser implementado por las subclases.

### 📍 Final (Class & Method)

- Una clase final no puede ser heredada.
- NO se puede extender (no puede tener subclases).
- Método final: No puede ser sobrescrito.
- Atributo final: No puede ser modificado despues de su asignacion inicial.

<br>

## 📌 Interfaces:

- Es una estructura que define un conjunto de métodos abstractos que una clase debe implementar. Sirve como un contrato que las clases deben seguir.
- Se implementan con `implements` en una clase.
- Una clase puede implementar multiples interfaces.
- No pueden contener implementacion en sus metodos (excepto default o static).
- Define métodos abstractos y constantes.
  - Las variables en interfaces son siempre `public static final` (constantes).
- Convenciones: depende del contexto cual deberiamos usar.
  - En Java suelen terminar en "Able". Ej: Runnable, Serializable.
- Los metodos en interfaces no necesitan el modificador `public` porque es redundante.
- Desde Java 8, se pueden agregar métodos con implementacion usando `default` y `static`.
  - `default`: para usar el metodo por defecto.
  - `static`: para llamar al metodo estatico.

### 📍 Codigo estrechamente acoplado (Tightly coupled code)

- Se refiere a un diseño en el que los componentes o clases de un sistema dependen fuertemente entre sí, lo que hace que cualquier cambio en una parte afecte a otras. Esto reduce la flexibilidad y dificulta el mantenimiento del código.
- 📢 Problemas:
  - Dificil de mantener.
  - Menos reutilizable.
  - Más dificil de probar: es complicado hacer pruebas unitarias.
- ✅ La solucion: Loosely Coupled Code (Código Debilmente Acoplado).
  - Podemos usar inyeccion de dependencias e interfaces.
  - Beneficios: mas flexible, mas reutilizable, mas facil de probar.
- 👉 Conclusion: Usar interfaces, inyeccion de dependencias y principios SOLID ayuda a reducir el acoplamiento y hacer el código mas escalable.

### 📍 Inyeccion de Dependencias (Dependency Injection)

- Es un patrón de diseño que permite reducir el acoplamiento entre clases proporcionando las dependencias desde el exterior en lugar de instanciarlas dentro de la propia clase.
- En proyectos grandes, frameworks como Spring manejan las dependencias automaticamente.
- ✅ EN DEFINITIVA: Para pasar la dependencia desde afuera (Inyeccion de Dependencias) usamos una interfaz. Por ejemplo: tenemos una clase llamada `ProveedorA` y `ProveedorB` que implementan una interfaz `ProveedorInterface`, luego tenemos otra clase (`Tienda`) que utiliza esta interfaz (en vez de `Proveedor`) y puede instanciar un objeto que implementa esta interfaz como lo son `ProveedorA` o `ProveedorB`.

```java
class Tienda {
    private Proveedor proveedor;

    public Tienda(Proveedor proveedor) { // 🔹 Se inyecta la dependencia
        this.proveedor = proveedor;
    }

    public void vender() {
        proveedor.suministrarProducto();
    }
}

// Interfaz
interface Proveedor {
    void suministrarProducto();
}

// Implementaciones
class ProveedorA implements Proveedor {
    @Override
    public void suministrarProducto() {
        System.out.println("Proveedor A: Enviando productos...");
    }
}

class ProveedorB implements Proveedor {
    @Override
    public void suministrarProducto() {
        System.out.println("Proveedor B: Enviando productos...");
    }
}

public class Main {
    public static void main(String[] args) {
        Tienda tienda1 = new Tienda(new ProveedorA());
        tienda1.vender(); // Proveedor A: Enviando productos...

        Tienda tienda2 = new Tienda(new ProveedorB());
        tienda2.vender(); // Proveedor B: Enviando productos...
    }
}
```

<br>

## 📌 Generics (Genericos):

- Permiten definir clases, interfaces y metodos que pueden trabajar con diferentes tipos de datos sin necesidad de duplicar codigo.
- Estas clases, interfaces o métodos solo pueden contener elementos del tipo especificado (String, Integer, etc.)
- Codigo reutilizable: mismo codigo para diferentes tipos sin duplicar lógica.
- Evita conversiones explicitas (no castings manuales).
- Codigo facil de entender.
- Solo pueden usarse con tipos de referencia: `String`, `Integer`, `Double`, etc.
- No se pueden usar tipos primitivos: `int`, `double`, `char`, etc.
- Para trabajar con primitivos, usamos sus clases contenedoras (`Wrapper Classes`). Ejemplo: `Float`, `Boolean`, `Double`, etc.
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

### 📍 Boxing & Unboxing

- Boxing: es el proceso de convertir un tipo primitivo en su clase contenedora.
- Unboxing: convertir una clase contenedora en su tipo primitivo.
- Java hace esto automaticamente, por lo que no es necesario hacer conversiones manuales.

<br>

## 📌 Excepciones:

- Son eventos que ocurren durante la ejecucion del programa y que interrumpen su flujo normal.
- Las excepciones evitan que el programa falle inesperadamente.
- Todas las excepciones heredan de Throwable.
- Personalizadas:
  - CONVENCION: `NombreDelError"Exception"`

### 📍 Jerarquia de Excepciones

```java
Throwable
 ├── Exception (Excepciones comprobadas)
 │   ├── IOException
 │   ├── SQLException
 │   ├── ParseException
 │   ├── (Otras...)
 │
 ├── RuntimeException (Excepciones NO comprobadas)
 │   ├── NullPointerException
 │   ├── ArrayIndexOutOfBoundsException
 │   ├── IllegalArgumentException
 │   ├── ArithmeticException
 │   ├── (Otras...)
 │
 └── Error (Errores del sistema)
     ├── StackOverflowError
     ├── OutOfMemoryError
     ├── (Otros...)
```

<br>

### 📍 Diferencia clave

- `Exception`: Se deben capturar o controlar obligatoriamente.
- `RuntimeException`: Opcional manejarlas, pero pueden causar fallos si no se controlan.
- `Error`: Errores fatales que no deben manejarse.

### 📍 Capturar Excepciones

1. `try-catch`
   - Si ocurre una excepcion dentro del try, se ejecuta el catch.
   - Si no hay excepcion, el catch se omite.
2. `finally`
   - Se ejecuta siempre.
3. Capturar multples excepciones
   - `try-catch-catch`
   - 📢 regla: Siempre poner `Exception` en el ultimo catch , porque captura cualquier error.

### 📍 Lanzar Excepciones (throw)

    - Podemos forzar una excepcion con `throw`.
    - Lanza una excepcion especifica.
    - Ejemplo:

```java
    throw new TipoDeExcepcion("Mensaje de error");
```

    - ✔ TipoDeExcepcion debe ser una subclase de Throwable
    - ✔ "Mensaje de error" es opcional.

### 📍 Declarar Excepciones en Métodos (throws)

    - Declara que un metodo puede generar una excepción.
    - Usamos la palabra reservada "throws"

- Podemos crear Excepciones personalizadas (extendemos Exception).

### 📍 Capturar, manejar y relanzar una excepcion

- Se pueden capturar excepciones, realizar operaciones y luego relanzarlas.
- Es util para loggear errores sin suprimirlos.
- Se pueden modificar antes de relanzarlas (throw new Exception(...)).
- Se debe evitar el "swallowing" de excepciones (capturarlas sin relanzarlas).
- 👉 Proceso: dentro del catch escribir un "throw e" y en el metodo, luego del nombre colocar "throws Exception".

### 📍 Excepciones mas comunes

- Input invalido.
- Dispositivo falla.
- Falta de conexion a internet.
- Limitaciones fisicas.
- Errores en el codigo.
- Una referencia nula.
- Archivos que no existen.
- Error al conectarse a la Base de Datos.

### 📍 Tipos de Excepciones

1. Checked (comprobadas)
   - Son detectadas en tiempo de compilación.
   - Deben manejarse obligatoriamente con try-catch o throws.
   - Ejemplo: IOException, SQLException, ParseException.
2. Unchecked (no comprobadas)
   - Son errores de logica detectados en tiempo de ejecucion.
   - No es obligatorio manejarlas, pero si no se controlan pueden causar fallos.
   - Ejemplo: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException.
3. Errors (errores de sistema)
   - Son fallos graves que no deben manejarse.
   - Ejemplo: StackOverflowError, OutOfMemoryError.

✅ Regla general: Podemos capturar Checked y Unchecked Exceptions con try-catch, pero no los errores (Error).

### 📍 Try-with-resource

- Es una estructura try que cierra automaticamente los recursos (como archivos, conexiones de DB, sockets, etc.) cuando termina su ejecucion.
- No es necesario llamar a close() manualmente.
- ✔ Sintaxis: try (recurso) {...} catch...
  - El recurso debe implementar la interfaz AutoCloseable o Closeable (como FileReader, BufferedReader, Connection, etc.)
  - Se puede declarar mas de un recurso dentro del parentesis.
- ✔ Menos errores y menos código en comparación con el cierre manual (finally).
- ✔ Siempre que sea posible, usa try-with-resources para evitar fugas de memoria.

### 📍 Exception Chaining (Cadena de Excepciones)

- Es una técnica en la que una excepción captura otra excepcion interna, permitiendo conservar el contexto original del error.
- ¿Como funciona?
  1. Podemos capturar una excepcion interna (Throwble cause).
  2. Lanzar una nueva excepcion envolviendo la anterior.
  3. Propagar la nueva excepcion, conservando el error original.

<br>

## 📌 Colecciones:

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

<br>

## 📌 Expresiones Lambda:

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

### 📍 Composición de funciones

Es una tecnica en programacion funcional (FP) donde combinamos multiples funciones pequeñas para formar una nueva funcion mas compleja. <br>
Esto se puede lograr usando metodos como `addThem()` y `compose()` en la interfaz `Function<T, R>`. <br>
📢 `andThen` encadena multiples funcione, ejecutandolas en secuencia: primero la funcion original y luego la nueva. Tambien se usa en `Consumer<T>` para ejecutar varias acciones consecuentemente. <br>
📢 `compose` ejecuta primero la nueva función y luego la original. <br>
❌ Evitar **NullPointerException**: si alguna de las funciones es `null`, se lanzara un NullPointerException.

<br>

### 📍 Composición de predicados

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

## 📌 Streams:

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

### 📍 Operaciones en Streams

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
🔹 `reduce(BinaryOperator<T>)` → Reduce los valores a un único resultado. <br>
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