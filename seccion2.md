# 2️⃣ Programación Orientada a Objetos (POO)

## 📌 POO en Java

### 📍 Clase (Class)

* Es un molde para crear multiples objetos.
* Se escriben en `PascalCase`.
* Lo recomendable es una clase por archivo.

- Convencion/Orden dentro de una clase:
  1) Atributos.
    - Constantes (static final).
    - Propiedades de instancia.
  2) Constructor.
  3) Getters y Setters.
  4) Metodos.
    - publicos, privados y finalmente los estaticos.

<br>

## 📌 Encapsulamiento

El encapsulamiento es uno de los principios fundamentales de la POO. Su objetivo es proteger los datos de una clase y restringir el acceso directo a ellos desde fuera de la clase.

### 📍 Principio de Encapsulamiento
Es un proceso de agrupar o encapsular los datos (atributos) y metodos para proteger estos datos y que solo puedan ser accedidos o modificados a traves de getters y setters.

### 📍 ¿Cómo se implementa el encapsulamiento?

1) Declarar los atributos como `private`.
2) Proveer metodos `public` de acceso (`getters`) y modificacion (`setters`).
3) Usar modificadores de acceso: private, protected, public.

### 📍 Principio de Ocultación
Es la practica de esconder los detalles internos de la implementacion de una clase o componente, exponiendo solo lo necesario. Se logra utilizando modificadores de acceso e implementando abstracciones a través de interfaces o clases abstractas.

### 📍 Modificadores de acceso

- **private**: solo es accesible en la misma clase.
  - Uso común: atributos y metodos internos que no deben ser modificados desde fuera.
- **public**: accesible desde cualquier parte del código.
  - Uso común: métodos y atributos que deben ser accesibles globalmente.
- **protected**: accesible en la misma clase, en el mismo paquete y en subclases (herencia), pero no es accesible desde otras clases.
  - Uso común: métodos y atributos que deben ser accesibles en clases hijas, pero no en otra clases externas.
  - 💡 Problemas/MALA PRACTICA:
    - ❌ Rompe el principio de encapsulamiento.
    - ❌ Crea dependencias no deseadas.
    - ✅ Alternativa mas segura: usar private
- **default** (sin modificador): solo es accesible en la misma clase y en el mismo paquete.
  - Uso común: métodos y clases auxiliares dentro del mismo paquete.

```java
// Clase Banco con Encapsulamiento y Ocultación
public class Banco {
    private double saldo; // Encapsulación con private

    // Constructor
    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Getter para consultar el saldo (Proporciona solo lo necesario)
    public double getSaldo() {
        return saldo;
    }

    // Método público para realizar un depósito (Oculta la lógica interna)
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado. Saldo actual: $" + saldo);
        } else {
            System.out.println("Cantidad inválida.");
        }
    }

    // Método público para realizar un retiro
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Saldo actual: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }
}

// Clase Principal para probar el ejemplo
public class Main {
    public static void main(String[] args) {
        Banco miBanco = new Banco(500);

        // Acceso controlado a través de métodos públicos
        miBanco.depositar(200);
        miBanco.retirar(100);

        // Consultar saldo
        System.out.println("Saldo final: $" + miBanco.getSaldo());
    }
}
```

<br>

## 📌 Object

- Todas las clases extienden de Object (es redundante agregarlo)
- Cuando creamos una nueva instancia de nuestra clase base podemos ver que tenemos acceso a metodos de Object.

### 📍 Métodos de Object

- `equals(Object obj)`: compara si dos objetos son iguales. Por defecto, compara si son la misma instancia en memoria (misma referencia), pero se puede sobrescribir para comparar valores (sobrescribir equals).
- `hashCode()`: devuelve un numero entero que representa la posicion del objeto en memoria. Se usa en estructuras como `HashMap` y `HashSet`.
  - Si `equals` es sobrescrito, `hashCode` también debe serlo para mantener coherencia.
- `toString()`: devuelve una representación en texto del objeto. Por defecto, imprime el nombre de la clase y su referencia en memoria, pero se puede sobrescribir. (`@override de toString`)
- `getClass()`: devuelve la clase del objeto en tiempo de ejecución.

<br>

## 📌 Polimorfismo

- Es uno de los pilares fundamentales de la POO.
- Permite que una misma accion se comporte de manera diferente según el objeto que la ejecute.

### 📍 Tipos de Polimorfismo

- Polimorfismo en tiempo de compilacion (Method overloading)
- Polimorfismo en tiempo de ejecucion (Method overriding)

### 📍 Method/Constructor Overloading (Sobrecarga de Métodos/Constructores)
Es cuando un mismo metodo o constructor tiene multiples versiones con diferentes parametros (cantidad o tipo).

- Method Overloading (Sobrecarga de metodos).
  - Podemos definir varios metodos con el mismo nombre, pero con diferente numero o tipo de parametros.

- Constructor Overloading (Sobrecarga de constructores).
  - Se usa cuando queremos inicializar objetos de diferentes maneras.

### 📍 Var-args (Argumentos variables)
Los `var-args` permiten declarar un método que acepte una cantidad variable de argumentos del mismo tipo. Se define utilizando `...` despues del tipo de dato. Internamente los argumentos se manejan como un array.

* [Ver codigo de Sobrecargas/Overloading](./Sec17POO_SobrecargaDeMetodos/)

### 📍 Method Overriding (Sobrescritura)
Es cuando una subclase redefine un método de su superclase para cambiar su comportamiento.

### 📍 Anotacion @override

No es estrictamente necesario usar `@override` cuando sobrescribimos un metodo, pero es recomendable por las siguientes razones:

- ✅ Ayuda a detectar errores en tiempo de compilación.
- ✅ Mejora la legibilidad del código.
- ✅ Evita confusion con sobrecarga (overloading)

<br>

## 📌 Final

- Se usa para indicar que algo `no puede cambiar`.
- Clase final: no puede ser heredada.
- Método final: No puede ser sobrescrito (overriding).
- Atributo final: No puede ser modificado despues de su asignacion inicial.
- 💡 Uso común:
  - Se usa `final` en constantes un 99% (`static final`).
  - El atributo final se escribe completamente en mayusculas y separado por gion bajo.

<br>

## 📌 Atributos y Métodos Estaticos

- Usa atributos estáticos para información compartida por todas las instancias, como contadores o configuraciones globales.

- Usa métodos estáticos para funciones independientes que no requieren datos específicos de un objeto. En metodos estaticos solo se puede usar atributos estaticos.

- 💡 Evita el uso excesivo de static, ya que puede generar dependencias innecesarias y dificultar la mantenibilidad del código.

<br>

## 📌 Enumeradores/Enum

- Los enumeradores representan un conjunto fijo de constantes con nombres significativos.
- Pueden tener atributos y metodos como cualquier otra clase.
- Pueden ser utilizados en sentencias switch para facilitar la logica condicional.
- Por convención, las constantes de un enum se escriben en mayusculas.

```java
public class EjemploEnum {
    public enum EstadoPedido {
        PENDIENTE, EN_PROCESO, COMPLETADO, CANCELADO;
    }

    public static void main(String[] args) {
        EstadoPedido estado = EstadoPedido.EN_PROCESO;

        // uso de switch con flechas
        String mensaje = switch (estado) {
            case PENDIENTE -> "El pedido está pendiente.";
            case EN_PROCESO -> "El pedido está en proceso.";
            case COMPLETADO -> "El pedido ha sido completado.";
            case CANCELADO -> "El pedido fue cancelado.";
        };

        System.out.println(mensaje);
    }
}
```

<br>

## 📌 Package (Paquete)

- Sirve para organizar clases e interfaces en grupos.
- Mejora la modularidad.
- Cada archivo de Java debe hacer referencia al paquete que pertenece.
- Se puede importar un paquete en otra clase con la palabra clave `import`.
- Para importar todas las clases usamos el * (wildcard).
- Tambien podemos importar metodos y atributos estaticos con `import static`.
- El modificador default en las clases/atributos/metodos hara que solo este disponible en ese paquete.

```java
import miPaquete.MiClase; // importa una clase de "miPaquete".
import miPaquete.*; // importa todas las clases de "miPaquete".
```

### 📍 Estructura de carpetas

```java
/proyecto/src/
 ├── miPaquete/
 │   ├── MiClase.java
 ├── otroPaquete/
 │   ├── OtraClase.java
 ├── Main.java
```

* [Ver codigo de Paquetes](./Sec15POO_Paquetes/)

<br>

## 📌 Herencia

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

### 📍 Orden en el cual se ejecutan los contructores en Herencia

- Siempre se va a ejecutar primero el constructor de la superclase y luego se va a ejecutar el constructor de la subclase.
- Cuando usamos la palabra clave `super` estamos llamando explicitamente al constructor de la superclase desde la subclase. Sino Java llama automaticamente al constructor **SIN PARAMETROS** de la superclase.
  - Si la superclase no tiene un constructor sin parametros, es obligatorio llamar a `super(...)` en la subclase.

<br>


## 📌 Conversión de Objetos

### 📍 Upcasting (Conversión de Subclase a Superclase)

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

* [Ver codigo de Herencia](./Sec18POO_Herencia/)

<br>

## 📌 Clases y Métodos Abstractos

- Se utilizan para definir comportamientos genéricos que deben ser implementados por las subclases.

### 📍 Clase Abstracta

- es una clase que no puede instanciarse directamente.
- Sirve como base para otras clases.
- Puede contener `METODOS ABSTRACTOS` (sin implementacion == solo se declara, no tiene llaves ni cuerpo) y `METODOS CONCRETOS` (con implementacion dentro de la clase abstracta, osea posee un cuerpo {} con instrucciones que se ejecutaran cuando se llame al método.)

### 📍 Metodo Abstracto

- debe ser implementado por las subclases.

<br>

## 📌 Interfaces

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