# 4️⃣ Manejo de Errores y Excepciones

## 📌 Excepciones

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

### 📍 Excepciones en Métodos (throws)

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