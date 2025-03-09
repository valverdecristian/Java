# 1️⃣ Fundamentos de Java

## 📌 Caracteristicas de Java

- Lenguaje orientado a objetos.
- Es multiplataforma.
- Manejo automático de memoria.
- Evolución permanente (Actualmente version 22).
- Fuertemente tipado.

<br>

## 📌 Versiones de Java

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

## 📌 Tipos Básicos

### 📍 Variables
* Sintaxis: `TipoDato nombreVariable;`
* Hay dos categorias de Tipos:
  - **primitivos**: almacenan un solo valor en memoria.
    * byte, short, int, long, float, double, char, boolean.
  - **de referencia**: no almacenan el valor, sino una referencia a un objeto en memoria.
    * 👉 Arreglos, las clases (String, Scanner, ArrayList, etc.), las interfaces, objetos creados con `new`.
  - **Inferencia de Tipos (Java 10+)**
    * Desde Java 10, se puede usar `var` para que el compilador infiera el tipo de la variable. Nota: var solo funciona en variables locales, no en atributos de clase.

```java
public class Primitivos {
    public static void main(String[] args) {
        byte numByte = 7;

        System.out.println("numByte = " + numByte); // 7
        System.out.println("tipo byte corresponde en byte a: " + Byte.BYTES); // 1
        System.out.println("tipo byte corresponde en bites a: " + Byte.SIZE); // 8
        System.out.println("valor maximo de un byte: " + Byte.MAX_VALUE); // 127
    }
}
```

<br>

### 📍 Sistema Numérico

| **Sistema Numérico** | **Prefijo**  | **Dígitos Utilizados** |
|-----------------|---------|------------------|
| Decimal (Base 10) | *Ninguno* | 0-9 |
| Binario (Base 2) | `0b` | 0, 1 |
| Octal (Base 8) | `0` | 0-7 |
| Hexadecimal (Base 16) | `0x` | 0-9, A-F |

<br>

### 📍 Entrada de datos con Scanner
- El `Scanner` es una clase de Java que permite leer datos ingresados por el usuario.

```java
import java.util.Scanner; // se debe importar Scanner

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // se debe crear el objeto

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
        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Inicial: " + inicial);
        
        scanner.close(); // Cerrar el Scanner (buena práctica)
    }
}
```
💡 Consideraciones importantes <br>
👉 Evitar errores al cambiar de tipo de datos: si se usa `nextInt()` o `nextDouble()` antes de `nextLine()`, puede quedar un salto de línea (`\n`) pendiente en el buffer. Se recomienda agregar un `scanner.nextLine()` despues de capturar números.

```java
System.out.print("Ingrese su edad: ");
int edad = scanner.nextInt();
scanner.nextLine(); // Consumir el salto de línea

System.out.print("Ingrese su nombre: ");
String nombre = scanner.nextLine();
```

<br>

### 📍 Conversión de Tipos
En Java, es comun convertir datos entre tipos primitivos y Strings.

* De String a primitivos
  - se usan los metodos `parseX()` de las clases contenedoras (`Wrapper Classes`). Ejemplo:`Integer`, `Float`, `Boolean`, `Double`, etc.

* De primitivos a String
  - se usa `String.valueOf()` o concatenacion con `""`
  - tambien se puede usar `Integer.toString(int)`, `Double.toString(double)`, etc.

```java
int numero = Integer.parseInt("123"); // Convierte "123" a int
double decimal = Double.parseDouble("3.14"); // Convierte "3.14" a double
boolean esVerdadero = Boolean.parseBoolean("true"); // Convierte "true" a boolean

String texto = String.valueOf(456); // Convierte int a String
String otroTexto = 789 + ""; // También convierte int a String
```

<br>

### 📍 Conversión entre tipos primitivos

* Conversion Implicita (widening casting)
  - ocurre automáticamente cuando se convierte un tipo más pequeño a uno mas grande. No hay perdida de datos.
  - 📢 Regla de conversión automática: byte → short → int → long → float → double

* Conversión Explícita (narrowing casting)
  - se hace manualmente cuando se convierte un tipo más grande a uno más pequeño.
  - Puede haber perdida de datos.
    1) perdida de presicion (truncamiento).
    2) perdida por desbordamiento (overflow).
  - Se usa `(tipo)` antes de la variable a convertir.
  - 📢 Regla de conversión manual: double → float → long → int → short → byte

```java
int num = 100;
double numDouble = num; // Se convierte automáticamente a double
System.out.println(numDouble); // 100.0

double pi = 3.1416;
int entero = (int) pi; // Conversión explícita (se pierde la parte decimal)
System.out.println(entero); // 3
```

<br>

### 📍 Tipo String: Cadenas
* String es un tipo de referencia.
* Se puede crear con `new String("texto")` o de forma literal `"texto"`.
* Es una secuencia de caracteres.
* Es una clase inmutable: cualquier cambio, ya sea de valor o invocando un metodo se va a crear una nueva instancia.
* Se concatena con el operador `+` o con el metodo `concat()`.
* El operador `==` compara por referencia, `equals()` compara por valor.
  - 💡 tambien se podria usar `equalsIgnoreCase()`
* 📢 Para concatenaciones frecuentes, es mejor usar `StringBuilder` o `StringBuffer` para mejorar el rendimiento.

```java
StringBuilder sb = new StringBuilder("Hola");
sb.append(" Juan!");
System.out.println(sb.toString()); // "Hola Juan!"
```

<br>

### 📍 Validación de String
1) Validar si un String es nulo o vacío.
  - Usando `isEmptry()`, verifica si la cadena está vacia, pero no detecta `null`.
  - Desde Java 11 usando `isBlank()`, ademas de verificar si esta vacio, tambien detecta si solo contiene espacios en blanco.
2) Validar si un String contiene solo números.
  - Usando `matches()` con una expresión regular (`Regex`).
3) Validar contenido especifico.
  - Si contiene una palabra o caracter especifico. Usando `contains()`.
  - Si comienza o termina con algo especifico. Usando `startsWith()` o `endsWith()`.

```java
// validar si un String es nulo, vacío o contiene solo espacios en blanco
if (texto == null || texto.isBlank()) {
    System.out.println("string invalido");
}

// validar si un String contiene solo numeros
String numero = "12345";
System.out.println(numero.matches("\\d+")); // true (solo dígitos)

// validar formato con Expresiones Regulares
String email = "usuario@email.com";
boolean esValido = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
System.out.println(esValido); // true
```

<br>

## 📌 Sec04Operadores

1) Sec04Operadores aritmeticos: `+, -, *, /, %`
2) Sec04Operadores de Asignación: `=, +=, -=, *=, /=, %=`
3) Sec04Operadores de Incremento y Decremento: `++` y `--`
    - pre: `++a, --a`
    - post: `a++, a--`
```java
int a = 5;
int b = ++a;  // Pre-incremento: a se incrementa antes de asignarse a b
System.out.println(a); // 6
System.out.println(b); // 6

int c = 5;
int d = c++;  // Post-incremento: c se asigna a d y luego se incrementa
System.out.println(c); // 6
System.out.println(d); // 5
```

4) Sec04Operadores Relacionales: `==, !=, <, >, <=, >=`
5) Sec04Operadores Lógicos: `&&, ||, !, &, |`
    - `&&, ||` hacen efecto corto-circuito.
    - si la primera expresión de `&&` es false, no se evalua la 2da expresión.
    - si la primera expresion de `||` es true, no se evalua la 2da expresión.
6) Operador Ternario: `(condicion) ? valorTrue : valorFalse;`
7) Sec04Operadores unarios: `+` y `-`
```java
int num = 5;
System.out.println(-num); // -5
```

<br>

### 📍 Operador instanceof
El operador `instanceof` se usa para verificar si un objeto es una instancia de una clase, una interfaz, una clase abstracta o incluso de un subtipo.

* Sintaxis:
```java
objeto instanceof Clase
```

* Si el objeto pertenece a la Clase o a una subclase de esta, devuelve `true`.
* Ejemplo:
```java
class Animal {}
class Perro extends Animal {}

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        
        System.out.println(miAnimal instanceof Animal); // true
        System.out.println(miAnimal instanceof Perro);  // true
        System.out.println(miAnimal instanceof String); // false
    }
}
```

* 💡 Nota: instanceof no funciona con tipos primitivos, solo con clases y objetos.

<br>

## 📌 Flujo de control

- Condicionales: `if, if-else, if-else if-else, switch case`
- Bucles: `for, while, do-while, for-each`
    * Utilizamos `for` cuando conocemos los limites del bucle.
- Palabras claves: `break y continue`
- Labels (etiquetas): se pueden aplicar en un for como en un while.

```java
bucle1: for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        if (i == 2) {
            continue bucle1;
        }
        System.out.println("i = " + i + " , j = " + j);
    }
}

System.out.println("=======================");

bucle2: for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        if (i == 2) {
            break bucle2;
        }
        System.out.println("i = " + i + " , j = " + j);
    }
}
```

<br>

## 📌 Clases Wrapper (de Envoltorio)
Son clases que permiten tratar los tipos primitivos como objetos.
Proporcionan metodos utiles para manipular valores numericos, convertir tipos de datos y trabajar con colecciones que requieren objetos en lugar de primitivos (por ejemplo, en `ArrayList<Integer>`).

### 📍 Tipos Primitivos y su correspondiente Clase Wrapper

| **Tipo Primitivo** | **Clase Wrapper**  |
|--------------------|-------------------|
| `byte`            | `Byte`             |
| `short`           | `Short`            |
| `int`             | `Integer`          |
| `long`            | `Long`             |
| `float`           | `Float`            |
| `double`          | `Double`           |
| `char`            | `Character`        |
| `boolean`         | `Boolean`          |

<br>

### 📍 Autoboxing y Unboxing
✅ Autoboxing: Conversión automática de un tipo primitivo a su clase Wrapper. <br>
✅ Unboxing: Conversión automática de un objeto Wrapper a su tipo primitivo. <br>

```java
// Autoboxing: convertir int a Integer
Integer numObj = 10;  // Equivalente a Integer numObj = Integer.valueOf(10);

// Unboxing: convertir Integer a int
int numPrim = numObj; // Equivalente a int numPrim = numObj.intValue();
```

### 📍 Métodos útiles en las Clases Wrapper
```java
// conversion de String a primitivo
int num = Integer.parseInt("123");      // Convierte "123" a int
double d = Double.parseDouble("3.14");  // Convierte "3.14" a double
boolean b = Boolean.parseBoolean("true"); // Convierte "true" a boolean

// conversion de primitivo a String
String s = Integer.toString(123);  // "123"
String s2 = Double.toString(3.14); // "3.14"

// obtener el valor del Wrapper
Integer obj = 42;
int prim = obj.intValue(); // Convierte Integer a int
```

### 📍 Metodo valueOf()
Es un método estatico que recibe String o primitivo y retorna un Objeto Wrapper.
```java
Integer numero = Integer.valueOf("100"); // 100
Double decimal = Double.valueOf("10.5"); // 10.5
Boolean bool = Boolean.valueOf("true"); // true

Integer num = Integer.valueOf(42); // 42
Double pi = Double.valueOf(3.14); // 3.14
```

💡 Por lo general, `valueOf()` es preferible si necesitas un objeto Wrapper, mientras que `parseX()` es mejor cuando solo se necesita un valor primitivo.

### 📍 Constantes de Integer
```java
Integer.MIN_VALUE
Integer.MAX_VALUE
```

<br>

## 📌 Paso por Valor vs Paso por Referencia
En Java, cuando pasamos datos a un método, estos pueden ser pasados por valor o por referencia, dependiendo del tipo de dato.

### 📍 Paso por Valor
Los tipos primitivos (int, double, boolean, etc.) se pasan por valor, lo que significa que el método recibe una copia del valor original y cualquier cambio dentro del método no afecta al valor original.

### 📍 Paso por Referencia
Los objetos y arreglos se pasan por copia de referencia. Se puede modificar su contenido, pero no cambiar la referencia original desde el método. Es decir, se pasa la dirección de memoria del objeto en lugar de una copia del valor. Cualquier modificación dentro del método afectará directamente al objeto original.

* [Ver codigo de Valor vs Referencia](./Sec07ValorVsReferencia/)

<br>

## 📌 Clases Date y Calendar
* 🕰️ Date (obsoleta, pero aun usada):
    - La clase `Date` representa una fecha y hora, pero tiene metodos obsoletos.
    - Para formatearla y manipularla, se recomienda usar `SimpleDateFormat`.
* 📅 Calendar (mas flexible que Date):
    - `Calendar` es una clase abstracta que se obtiene con `Calendar.getInstance()`.
    - Permite modificar partes especificas de la fecha (año, mes, día, hora, etc.).
    - ✅ Nota: Los meses en Calendar comienzan en 0 (Enero).
* 📝 SimpleDateFormat (formateo y parsing):
    - Se usa para convertir `Date` a `String` con un formato especifico y viceversa.
    - Se usa para formatear fechas, pero para cálculos es mejor Calendar o LocalDate.

* [Ver codigo de Date y Calendar](./Sec08DateYCalendar/)

<br>

## 📌 Clase System

### 📍 Propiedades del Sistema (System.getProperty)
+ `user.name`: nombre del usuario del SO.
+ `user.home`: directorio principal del usuario.
+ `user.dir`: directorio del trabajo actual.
+ `System.getProperties().list(System.out)`: listar todas las propiedades del sistema.

### 📍 Variables de Entorno (System.getenv)
+ `System.getenv()` devuelve un mapa con todas las variables de entorno del sistema.
+ Es posible definir nuevas variables de entorno desde la terminal con `setx VARIABLE "valor"`.

### 📍 Ejecutar Programas del Sistema
+ Se usa `Runtime.getRuntime().exec(comando)` para ejecutar programas externos.
+ En Windows se puede abrir el Bloc de notas (`notepad`).

* [Ver codigo de Clase System](./Sec09ClaseSystem/)

<br>

## 📌 Clase Math
La clase `Math` es una utilidad que proporciona métodos y constantes para realizar operaciones matemáticas comunes. No es necesario importarla ni crear una instancia para usarla.

* `Math.random()`: genera un número aleatorio entre `0.0` y `1.0`.
* `Math.abs(x)`: devuelve el valor absoluto de `x`.
* `Math.max(a,b)`: deuvelve el mayor entre `a` y `b`.
* `Math.round(x)`: redondea al entero mas cercano.
* `Math.pow(base, exp)`: calcula `base^exponente`.
* `Math.sqrt(x)`: calcula la raiz cuadrada de `x`.

### 📍 Clase Random
Random se usa para generar numeros pseudoaleatorios de diferentes tipos(int, double, boolean, float, etc.). <br>
Para usar Random, primero debemos importar la clase:
```java
import java.util.Random;
```

* [Ver codigo de Clase Math](./Sec10ClaseMath/)

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

## 📌 Package (Paquete)

- Sirve para organizar clases e interfaces en grupos.
- Mejora la modularidad.
- Cada archivo de Java debe hacer referencia al paquete que pertenece.
- Se puede importar un paquete en otra clase con la palabra clave `import`.

```java
import miPaquete.MiClase; // importa una clase de "miPaquete".
import miPaquete.*; // importa todas las clases de "miPaquete".
```

<br>

## 📌 Estructura de carpetas

```java
/proyecto/src/
 ├── miPaquete/
 │   ├── MiClase.java
 ├── otroPaquete/
 │   ├── OtraClase.java
 ├── Main.java
```