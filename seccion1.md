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
* Los String son objetos de java, de tipo de referencia.
* Se puede crear con `new String("texto")` o de forma literal `"texto"`.
* Es una secuencia de caracteres.
* Es una clase inmutable: cualquier cambio, ya sea de valor o invocando un metodo se va a crear una nueva instancia.
* Se concatena con el operador `+` o con el metodo `concat()`.
* El operador `==` compara por referencia, `equals()` compara por valor.
  - 💡 tambien se podria usar `equalsIgnoreCase()`
* 📢 Para concatenaciones frecuentes, es mejor usar `StringBuilder` o `StringBuffer` para mejorar el rendimiento.

<br>

### 📍 Clase Math (Métodos mas utiles)
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

## 📌 Control de flujo

- Operadores de comparacion: `==, !=, <, >, etc.`
- Operadores logicos: `&&, ||, !`
- Condicionales: `if, if-else, if-else if-else, Switch`
- Operador ternario: `? :`
- Bucles: `for, while, do-while, for-each`
- Palabras claves: `break y continue`

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