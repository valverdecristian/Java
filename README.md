# Java (Academia Hola Mundo)

Java es fuertemente tipado

Caracteristicas:
* Lenguaje orientado a objetos.
* Es multiplataforma.
* Manejo automático de memoria.
* Evolución permanente (Actualmente version 22).

<br>

Java tiene dos versiones:
* JSE (Java Standard Edition)
    - Usos comunes: Aplicaciones de escritorio, herramientas de desarrollo, aplicaciones científicas, y cualquier aplicación que no necesite servicios avanzados o consumo de un servidor.
* JEE/Jakarta (Java Enterprise Edition)
    - Usos comunes: Aplicaciones web, aplicaciones empresariales, sistemas de comercio electrónico, aplicaciones de banca en línea, sistemas de gestión empresarial, y cualquier aplicación que requiera transacciones, seguridad, y escalabilidad.

un IDE es un entorno de desarrollo integrado. Es una aplicación informática que proporciona servicios integrales para facilitarle al desarrollador o programador el desarrollo de software.
Ejemplos de un IDE para Java: Netbeans, Intellij o Eclipse.

<br>

¿Que necesitamos para programar en Java?
* Un IDE.
* JRE (Java Runtime Environment).
* JDK (Java Development Kit): Incluye el compilador y JRE.
* Antes (hasta Java 8) habia que instalar ambos programas, ahora JRE viene incluido en JDK.

<br>

Orientación a Objetos:
* Clases: se escriben en PascalCase.
    - Convencion:
        * atributos.
            - constantes.
            - propiedades de instancia.
        * constructor.
        * getters y setters.
        * metodos: publicos y luego los privados; finalmente los estaticos.
* Objetos: instancia de clase. Los objetos tienen Propiedades y Metodos(). Los objetos se escriben en camelCase.

<br>

Metodos():
* De Clase: se les llama static.
* De los objetos: no es necesario "static".

<br>

Clase Math

<br>

Formato de numeros:
 - String.format()
 - DecimalFormat
 - NumberFormat.getCurrencyInstance(): para monedas locales.
 - NumberFormat.getPercentInstance(): para porcentajes.

<br>

 Clase Scanner:
  - se debe importar la clase: java.util.Scanner;
  - crear un objeto Scanner: Scanner scanner = new Scanner(System.in);
  - leer datos desde la consola: scanner.nextLine(); (devuelve un String)
    si queremos obtener otro tipo debemos usar otro metodo.

<br>

Control de flujo:
 * Operadores de comparacion.
 * Operadores logicos.
 * if / if-else if-else.
 * Operador ternario.
 * Switch.
 * For.
 * While.
 * Do While.
 * Break y Continue.
 * For each.

<br>

Métodos:
* Method Overloading (Sobrecarga de metodos).
* Constructor Overloading (Sobrecarga de constructores)

<br>

Paquetes:
* se debe hacer referencia al paquete que pertenece.

<br>

Modificadores de Acceso:
* las Clases:
    - publicas: cualquier otra clase de nuestra app puede utilizarla
    - sin especificar: tienen acceso otras clases del mismo paquete
* Propiedades y metodos:
    - default: es cuando no agregamos nada (acceso desde el mismo paquete)
    - public: cualquier otra clase dentro de nuestra app
    - private: acceso dentro de la misma clase
    - protected: acceso dentro del mismo paquete o subclases.

<br>

Herencia:
* Es un concepto de la POO, que permite que una clase derive (herede) caracteristicas y comportamientos de otra.
* Esto ayuda a reutilizar codigo.
* Se implementa usando la palabra clave "extends"
* La superclase proporciona atributos y métodos.
* La subclase hereda esos atributos y metodos, y puede agregar o modificar su porpio comportamiento.
* Para cambiar el comportamiento de un metodo heredado usamos @override.
* Uso de "super" para acceder a la superclase:
    - que permite llamar al constructor de la superclase.
    - permite acceder a metodos de la superclase si fueron sobreescritos.
* Tipos de herencia: Java no admite herencia multiple, pero si admite herencia jerarquica.
    - Simple -> class Perro extends Animal {}
    - Jerarquica -> class Perro extends Animal, class Gato extends Animal.
* Java no permite herencia multiple entre clases. Si se necesita compartir codigo entre varias clases, se puede usar interfaces (con implements)

<br>

Object:
* Todas las clases extienden de Object (es redundante agregarlo)
* Cuando creamos una nueva instancia de nuestra clase base podemos ver que tenemos acceso a metodos de Object.
    - equals(Object obj): compara si dos objetos son iguales. Por defecto, compara si son la misma instancia en memoria (misma referencia), pero se puede sobrescribir para comparar valores (sobrescribir equals).
    - hashCode(): devuelve un numero entero que representa la posicion del objeto en memoria. Se usa en estructuras como HashMap y HashSet.
        * Si equals es sobrescrito, hashCode también debe serlo para mantener coherencia.
    - toString(): devuelve una representación en texto del objeto. Por defecto, imprime el nombre de la clase y su referencia en memoria, pero se puede sobrescribir. (@override de toString)
    - getClass(): devuelve la clase del objeto en tiempo de ejecución.

<br>

Orden en el cual se ejecutan los contructores en Herencia.
* Siempre se va a ejecutar 1ro el constructor de la superclase y luego se va a ejecutar el constructor de la subclase.
* Cuando usamos la palabra clave "super" estamos llamando explicitamente al constructor de la superclase desde la subclase. Sino Java llama automaticamente al constructor SIN PARAMETROS de la superclase.
    - Si la superclase no tiene un constructor sin parametros, es obligatorio llamar a super(...) en la subclase.

<br>

Modificadores de acceso:
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

<br>

Method override:
* No es estrictamente necesario usar @override cuando sobrescribimos un metodo, pero es recomendable por las siguientes razones:
    - Ayuda a detectar errores en tiempo de compilacion.
    - Mejora la legibilidad del código.
    - Evita confusion con sobrecarga (overloading)

<br>

Upcasting (Conversion de Subclase a Superclase)
* Es cuando convertimos un objeto de una subclase en un objeto de su superclase.
    - Se hace automaticamente (casting implicito).
    - No se pierde informacion, pero se limitan los metodos disponibles a los de la superclase.
    - Ejemplo: Animal miAnimal = new Perro(); // Upcasting automático.
    - miAnimal puede acceder a metodos de Animal, pero no se puede acceder a metodos de Perro (se trata como un Animal)

Downcasting (Conversión de Superclase a Subclase)
* Es cuando convertimos un objeto de una superclase en un objeto de su subclase.
    - No es automatico (requiere casting explicito)
    - Puede causar ClassCastException.
    - Ejemplo:
        - Animal miAnimal = new Perro(); // Upcasting
        - Perro miPerro = (Perro) miAnimal; // Downcasting explícito
        - miPerro.correr(); // ✅ Ahora sí se puede acceder a métodos de Perro
* Usar "instanceof" antes de un downcasting para evitar errores.
