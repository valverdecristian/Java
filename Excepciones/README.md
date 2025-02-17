## 📌 Excepciones:
* Son eventos que ocurren durante la ejecucion del programa y que interrumpen su flujo normal.
* Las excepciones evitan que el programa falle inesperadamente.
* Todas las excepciones heredan de Throwable.

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
    - Podemos forzar una excepcion con "throw"
    - Lanza una excepcion especifica.

### 📍 Declarar Excepciones en Métodos (throws)
    - Declara que un metodo puede generar una excepcion.

* Podemos crear Excepciones personalizadas (extendemos Exception)

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