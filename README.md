# Java (Academia Hola Mundo)

## 📌 Caracteristicas:
* Lenguaje orientado a objetos.
* Es multiplataforma.
* Manejo automático de memoria.
* Evolución permanente (Actualmente version 22).
* Fuertemente tipado.

<br>

## 📌 Versiones de Java:
* JSE (Java Standard Edition)
    - Usos: Aplicaciones de escritorio, herramientas de desarrollo, aplicaciones científicas, y cualquier aplicación que no necesite servicios avanzados o consumo de un servidor.
* JEE/Jakarta (Java Enterprise Edition)
    - Usos: Aplicaciones web, aplicaciones empresariales, sistemas de comercio electrónico, aplicaciones de banca en línea, sistemas de gestión empresarial, y cualquier aplicación que requiera transacciones, seguridad, y escalabilidad.
    - Incluye tecnologias como Servlets, JSP, EJB y frameworks como Spring.

### 📍 ¿Que es un IDE?
un IDE es un entorno de desarrollo integrado. Es una aplicación informática que proporciona servicios integrales para facilitarle al desarrollador o programador el desarrollo de software.
Ejemplos de un IDE para Java: Netbeans, Intellij o Eclipse.

## 📌 ¿Que necesitamos para programar en Java?
* ✅ Un IDE.
* JRE (Java Runtime Environment).
* ✅ JDK (Java Development Kit): Incluye el compilador y JRE.
    - Desde Java 9, el JRE viene incluido en JDK.

<br>

## 📌 POO en Java:
* Clases: se escriben en PascalCase.
    - Convencion:
        * atributos.
            - constantes (static final).
            - propiedades de instancia.
        * constructor.
        * getters y setters.
        * metodos: publicos, privados y finalmente los estaticos.

* Objetos: instancia de clase. Los objetos tienen Propiedades y Metodos(). Los objetos se escriben en camelCase.

<br>

Metodos():
* De Clase: se definen con "static".
* De Objetos: dependen de una instancia.

<br>

## 📌 Control de flujo:
 * Operadores de comparacion (==, !=, <, >, etc.)
 * Operadores logicos (&&, ||, !)
 * Condicionales: if, if-else, if-else if-else, Switch.
 * Operador ternario (? :)
 * Bucles (for, while, do-while, for-each)
 * Palabras claves (break y continue)

<br>

## 📌 Entrada de datos con Scanner:
* se debe importar: java.util.Scanner;
* crear un objeto: Scanner scanner = new Scanner(System.in);
* Metodos comunes:
    - scanner.nextLine(); (Devuelve un String)
    - scanner.nextInt(); (Devuelve un int), etc.

<br>

### 📍 Clase Math

### 📍 Formato de numeros:
 - String.format()
 - DecimalFormat
 - NumberFormat.getCurrencyInstance(): para monedas locales.
 - NumberFormat.getPercentInstance(): para porcentajes.

### 📍 Overloading (Sobrecarga)
* Es cuando un mismo metodo o constructor tiene multiples versiones con diferentes parametros (cantidad o tipo)

* Method Overloading (Sobrecarga de metodos).
    - Podemos definir varios metodos con el mismo nombre, pero con diferentes parametros.
* Constructor Overloading (Sobrecarga de constructores).
    - Se usa cuando queremos inicializar objetos de diferentes maneras.

<br>

### 📍 Package (Paquete)
* Sirve para organizar clases e interfaces en grupos.
* Mejora la modularidad.
* Cada archivo de Java debe hacer referencia al paquete que pertenece.
* Se puede importar un paquete en otra clase con la palabra clave "import"
    - Ejemplo: import miPaquete.MiClase; // importa una clase de "miPaquete".
    - Otro Ej: import miPaquete.*; // importa todas las clases de "miPaquete".

### 📍 Estructura de carpetas

/proyecto/src/  
 ├── miPaquete/  
 │   ├── MiClase.java  
 ├── otroPaquete/  
 │   ├── OtraClase.java  
 ├── Main.java  


<br>

## 📌 Herencia:
* Es un concepto de la POO, que permite que una clase derive (herede) caracteristicas y comportamientos de otra.
* Esto ayuda a reutilizar codigo.
* Se implementa usando la palabra clave "extends"
* La superclase proporciona atributos y métodos.
* La subclase hereda esos atributos y metodos, y puede agregar o modificar su porpio comportamiento.
* Para cambiar el comportamiento de un metodo heredado usamos @override.
* Uso de "super" para acceder a la superclase:
    - que permite llamar al constructor de la superclase.
    - permite acceder a metodos de la superclase si fueron sobreescritos.

### 📍  Tipos de herencia
* Java no admite herencia multiple, pero si admite herencia jerarquica.
    - Simple -> class Perro extends Animal {}
    - Jerarquica -> class Perro extends Animal, class Gato extends Animal.
* Si se necesita compartir codigo entre varias clases, se puede usar interfaces (con implements)

<br>

## 📌 Object:
* Todas las clases extienden de Object (es redundante agregarlo)
* Cuando creamos una nueva instancia de nuestra clase base podemos ver que tenemos acceso a metodos de Object.

### 📍 Metodos
* equals(Object obj): compara si dos objetos son iguales. Por defecto, compara si son la misma instancia en memoria (misma referencia), pero se puede sobrescribir para comparar valores (sobrescribir equals).
* hashCode(): devuelve un numero entero que representa la posicion del objeto en memoria. Se usa en estructuras como HashMap y HashSet.
    - Si equals es sobrescrito, hashCode también debe serlo para mantener coherencia.
* toString(): devuelve una representación en texto del objeto. Por defecto, imprime el nombre de la clase y su referencia en memoria, pero se puede sobrescribir. (@override de toString)
* getClass(): devuelve la clase del objeto en tiempo de ejecución.

### 📍 Orden en el cual se ejecutan los contructores en Herencia.
* Siempre se va a ejecutar 1ro el constructor de la superclase y luego se va a ejecutar el constructor de la subclase.
* Cuando usamos la palabra clave "super" estamos llamando explicitamente al constructor de la superclase desde la subclase. Sino Java llama automaticamente al constructor SIN PARAMETROS de la superclase.
    - Si la superclase no tiene un constructor sin parametros, es obligatorio llamar a super(...) en la subclase.

### 📍 Modificadores de acceso:
* private: solo es accesible en la misma clase.
    - Uso común: atributos y metodos internos que no deben ser modificados desde fuera.
* public: accesible desde cualquier parte del código.
    - Uso común: métodos y atributos que deben ser accesibles globalmente.
* protected: accesible en la misma clase, en el mismo paquete y en subclases (herencia), pero no es accesible desde otras clases.
    - Uso común: métodos y atributos que deben ser accesibles en clases hijas, pero no en otra clases externas.
    - Problemas/MALA PRACTICA:
        * Rompe el principio de encapsulamiento.
        * Crea dependencias no deseadas.
        * Alternativa mas segura: usar private
* default (sin modificador): solo es accesible en la misma clase y en el mismo paquete.
    - Uso común: métodos y clases auxiliares dentro del mismo paquete.

### 📍 Method override:
* No es estrictamente necesario usar @override cuando sobrescribimos un metodo, pero es recomendable por las siguientes razones:
    - Ayuda a detectar errores en tiempo de compilacion.
    - Mejora la legibilidad del código.
    - Evita confusion con sobrecarga (overloading)

<br>

## 📌 Conversión de Objetos

### 📍 Upcasting (Conversion de Subclase a Superclase)
* Es cuando convertimos un objeto de una subclase en un objeto de su superclase.
    - Se hace automaticamente (casting implicito).
    - No se pierde informacion, pero se limitan los metodos disponibles a los de la superclase.
    - Ejemplo: Animal miAnimal = new Perro(); // Upcasting automático.
    - miAnimal puede acceder a metodos de Animal, pero no se puede acceder a metodos de Perro (se trata como un Animal)

### 📍 Downcasting (Conversión de Superclase a Subclase)
* Es cuando convertimos un objeto de una superclase en un objeto de su subclase.
    - No es automatico (requiere casting explicito)
    - Puede causar ClassCastException.
    - Ejemplo:
        - Animal miAnimal = new Perro(); // Upcasting
        - Perro miPerro = (Perro) miAnimal; // Downcasting explícito
        - miPerro.correr(); // ✅ Ahora sí se puede acceder a métodos de Perro
* Usar "instanceof" antes de un downcasting para evitar errores.

### 📍 Comparando objetos:
* Vamos a querer comparar distinos objetos en base a propiedades que estos tengan. Para estos casos podemos realizar el metodo @override de equals

<br>

## 📌 Polimorfismo:
* Es uno de los pilares fundamentales de la POO.
* Permite que una misma accion se comporte de manera diferente según el objeto que la ejecute.

### 📍  Tipos:
* Polimorfismo en tiempo de compilacion (Method overloading | sobrecarga de metodos)
* Polimorfismo en tiempo de ejecucion (Method overriding | sobreescritura de métodos usando herencia)

<br>

## 📌 Clases y Métodos Abstractos:
* Se utilizan para definir comportamientos genéricos que deben ser implementados por las subclases.

### 📍  Clase Abstracta
* es una clase que no puede instanciarse directamente. Sirve como base para otras clases. puede contener METODOS ABSTRACTOS (sin implementacion == solo se declara, no tiene llaves ni cuerpo) y metodos concretos (con implementacion dentro de la clase abstracta, osea posee un cuerpo {} con instrucciones que se ejecutaran cuando se llame al método.)

### 📍  Metodo Abstracto
* debe ser implementado por las subclases.

### 📍 Final (Class & Method):
* Una clase final no puede ser heredada.
* NO se puede extender (no puede tener subclases).
* Método final: No puede ser sobrescrito.
* Atributo final: No puede ser modificado despues de su asignacion inicial.

<br>

## 📌 Interfaces:
* Es una estructura que define un conjunto de métodos abstractos que una clase debe implementar. Sirve como un contrato que las clases deben seguir.
* Se implementan con "implements" en una clase.
* Una clase puede implementar multiples interfaces.
* No pueden contener implementacion en sus metodos (excepto default o static).
* Define métodos abstractos y constantes.
    - Las variables en interfaces son siempre "public static final" (constantes).
* Convenciones: depende del contexto cual deberiamos usar.
    - En Java suelen terminar en "Able". Ej: Runnable, Serializable.
* Los metodos no necesitan el modificador "public" porque es redundante.
* Una clase puede implementar multiples interfaces.
* Desde Java 8, se pueden agregar métodos con implementacion usando "default" y "static".
    - "default": para usar el metodo por defecto.
    - "static": para llamar al metodo estatico.

### 📍 Codigo estrechamente acoplado (Tightly coupled code):
* Se refiere a un diseño en el que los componentes o clases de un sistema dependen fuertemente entre sí, lo que hace que cualquier cambio en una parte afecte a otras. Esto reduce la flexibilidad y dificulta el mantenimiento del código.
* Problemas:
    - Dificil de mantener.
    - Menos reutilizable.
    - Más dificil de probar: es complicado hacer pruebas unitarias.
* ✅ La solucion: Loosely Coupled Code (Código Debilmente Acoplado).
    - Podemos usar inyeccion de dependencias e interfaces.
    - Beneficios: mas flexible, mas reutilizable, mas facil de probar.
* Conclusion: Usar interfaces, inyeccion de dependencias y principios SOLID ayuda a reducir el acoplamiento y hacer el código mas escalable.

### 📍 Inyeccion de Dependencias (Dependency Injection)
* Es un patrón de diseño que permite reducir el acoplamiento entre clases proporcionando las dependencias desde el exterior en lugar de instanciarlas dentro de la propia clase.
* En proyectos grandes, frameworks como Spring manejan las dependencias automaticamente.

<br>

## 📌 Generics (Genericos):
* Permiten definir clases, interfaces y metodos que pueden trabajar con diferentes tipos de datos sin necesidad de duplicar codigo.
* Estas listas solo pueden contener elementos del tipo especificado (String, Integer, etc.)
* Codigo reutilizable: mismo codigo para diferentes tipos sin duplicar lógica.
* Evita conversiones explicitas (no castings manuales).
* Codigo facil de entender.
* Solo pueden usarse con tipos de referencia: String, Integer, Double, etc.
* No se pueden usar tipos primitivos: int, double, char, etc.
* Para trabajar con primitivos, usamos sus clases contenedoras (Wrapper Classes). Ejemplo: Float, Boolean, Double, etc.
* Tambien podemos definir métodos genéricos: donde T es un parametro de tipo generico que se adapta a cualquier tipo de dato.
* Restricciones: si queremos limitar que tipos podemos agregar la palabra "extends". Ejemplo: public class Lista < T extends Number > {...}
* Tambien puede extender interfaces: public class Garzon implements Interface {}
* Si una clase necesita mas de un generico, se definen multiples parametros de tipo dentro de los corchetes angulares.
    - Ejemplo: public class Par < T,U >
    - Uso: Par < String, Integer >
    - Con Restriccion: public class Par < T extends Number, U extends Number >

### 📍 Metodos Genericos
* permiten definir operaciones reutilizables sin necesidad de que toda la clase sea genérica. Se usa <> justo antes del tipo de retorno.
    - Ejemplo: public static < T > void imprimirElemento(T elemento) {...}

### 📍 Utils como convencion
* en muchos proyectos se usa Utils o Helper para agrupar métodos (estaticos) utilitarios.

### 📍 Wildcards (?):
* son comodines usados en genéricos cuando queremos trabajar con tipos genericos sin especificar un tipo exacto.
* Se usa en parametros de metodos cuando queremos flexibilidad sin definir un tipo especifico.

    1) Unbounded (?)
        - para listas de cualquier tipo (solo lectura, no add).
    2) Upper Bounded (? extends T)
        - solo permite leer elementos (no se puede agregar elementos).
    3) Lower Bounded (? super T)
        - para agregar elementos (no se puede leer elementos).

### 📍 Boxing & Unboxing:
* Boxing: es el proceso de convertir un tipo primitivo en su clase contenedora.
* Unboxing: convertir una clase contenedora en su tipo primitivo.
* Java hace esto automaticamente, por lo que no es necesario hacer conversiones manuales.

<br>

## 📌 Excepciones:
* Son eventos que ocurren durante la ejecucion del programa y que interrumpen su flujo normal.
* Las excepciones evitan que el programa falle inesperadamente.
* Todas las excepciones heredan de Throwable.
* Personalizadas:
    - CONVENCION: NombreDelError"Exception"

### 📍 Jerarquia de Excepciones

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

<br>

### 📍 Diferencia clave
* Exception: Se deben capturar o controlar obligatoriamente.
* RuntimeException: Opcional manejarlas, pero pueden causar fallos si no se controlan.
* Error: Errores fatales que no deben manejarse.

### 📍 Capturar Excepciones:
1) try-catch
    - Si ocurre una excepcion dentro del try, se ejecuta el catch.
    - Si no hay excepcion, el catch se omite.
2) finally
    - Se ejecuta siempre.
3) Capturar multples excepciones
    - try-catch-catch
    - regla: Siempre poner "Exception" en el ultimo catch , porque captura cualquier error.

### 📍 Lanzar Excepciones (throw)
    - Podemos forzar una excepcion con "throw".
    - Lanza una excepcion especifica.
    - Ejemplo: throw new TipoDeExcepcion("Mensaje de error");
    - ✔ TipoDeExcepcion debe ser una subclase de Throwable
    - ✔ "Mensaje de error" es opcional.

### 📍 Declarar Excepciones en Métodos (throws)
    - Declara que un metodo puede generar una excepción.
    - Usamos la palabra reservada "throws"

* Podemos crear Excepciones personalizadas (extendemos Exception).

### 📍 Capturar, manejar y relanzar una excepcion
* Se pueden capturar excepciones, realizar operaciones y luego relanzarlas.
* Es util para loggear errores sin suprimirlos.
* Se pueden modificar antes de relanzarlas (throw new Exception(...)).
* Se debe evitar el "swallowing" de excepciones (capturarlas sin relanzarlas).
* 👉 Proceso: dentro del catch escribir un "throw e" y en el metodo, luego del nombre colocar "throws Exception".

### 📍 Excepciones mas comunes

* Input invalido.
* Dispositivo falla.
* Falta de conexion a internet.
* Limitaciones fisicas.
* Errores en el codigo.
* Una referencia nula.
* Archivos que no existen.
* Error al conectarse a la Base de Datos.

### 📍 Tipos de Excepciones

1) Checked (comprobadas)
    - Son detectadas en tiempo de compilación.
    - Deben manejarse obligatoriamente con try-catch o throws.
    - Ejemplo: IOException, SQLException, ParseException.
2) Unchecked (no comprobadas)
    - Son errores de logica detectados en tiempo de ejecucion.
    - No es obligatorio manejarlas, pero si no se controlan pueden causar fallos.
    - Ejemplo: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException.
3) Errors (errores de sistema)
    - Son fallos graves que no deben manejarse.
    - Ejemplo: StackOverflowError, OutOfMemoryError.

✅ Regla general: Podemos capturar Checked y Unchecked Exceptions con try-catch, pero no los errores (Error).

### 📍 Try-with-resource
* Es una estructura try que cierra automaticamente los recursos (como archivos, conexiones de DB, sockets, etc.) cuando termina su ejecucion.
* No es necesario llamar a close() manualmente.
* ✔ Sintaxis: try (recurso) {...} catch...
    - El recurso debe implementar la interfaz AutoCloseable o Closeable (como FileReader, BufferedReader, Connection, etc.)
    - Se puede declarar mas de un recurso dentro del parentesis.
* ✔ Menos errores y menos código en comparación con el cierre manual (finally).
* ✔ Siempre que sea posible, usa try-with-resources para evitar fugas de memoria.

### 📍 Exception Chaining (Cadena de Excepciones)
* Es una técnica en la que una excepción captura otra excepcion interna, permitiendo conservar el contexto original del error.
* ¿Como funciona?
    1) Podemos capturar una excepcion interna (Throwble cause).
    2) Lanzar una nueva excepcion envolviendo la anterior.
    3) Propagar la nueva excepcion, conservando el error original.

<br>

## 📌 Colecciones:


<br>

## 📌 Expresiones Lambda:


<br>

## 📌 Streams: