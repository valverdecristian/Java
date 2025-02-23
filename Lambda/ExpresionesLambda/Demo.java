package Lambda.ExpresionesLambda;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Demo {

    public Demo(String message){}


    public static void run() {
        
        // push(new Notificable() {
        //     @Override
        //     public void push(String message){
        //         System.out.println("Enviado desde clase anonima: " + message);
        //     }
        // });
        // PASADO A LAMBDA

        // EXPRESION LAMBDA [tambien llamada funcion anonima]
        // en expresiones lambdas en los parametros no hace falta indicarle el tipo
        // en este caso pasamos de (String message) a (message)
        // incluso al ser un solo parametro, podemos eliminar los parentesis.
        // y en este caso podemos eliminar las llaves tambien. quedando todo en 1 linea.
        Notificable lambda = message -> System.out.println("Imprimiendo de lambda: " + message);

        push(lambda);

        // esta es la forma convencional
        push(message -> metodo(message));
        // en este caso estamos pasando una referencia
        push(Demo::metodo);
        // esto mismo se puede hacer con clases del Sistema
        push(System.out::println);

        // para pasarle una instancia al push primero tenemos que crearla
        Demo demo = new Demo("mi mensaje");
        push(demo::metodoInstancia);

        // llamando al constructor con new
        push(Demo::new);

        // NOTA: todas estas formas que tenemos nosotros para poder llamar
        // a un metodo que recibe una interface funcional (Notificable) son
        // completamente validos.
    }

    // METODOS POR REFERENCIA
    // tengo que pasarle los mismos parametros que nuestra interface Notificable
    public static void metodo(String message) {}


    // METODO (DE LA INSTANCIA DE UN OBJETO)
    public void metodoInstancia(String message){} 

    public static void push(Notificable n) {
        n.push("Chanchito feliz");
    }


    // Interfaces funcionales: CONSUMMER
    public static void incluidas() {
        List<String> list = List.of("Hola", "Mundo");

        // en vez de usar el forEach tradicional usamos este metodo:
        // list.forEach(elemento -> System.out.println(elemento));
        list.forEach(Demo::sendPush); // llamamos a sendPush


        // otra forma de hacer lo mismo [utilizando el metodo por referencia]:
        // list.forEach(System.out::println);

        // CADENA DE CONSUMMERS
        Consumer<String> notify = el -> System.out.println("Enviando a: "+ el);
        Consumer<String> store = el -> System.out.println("Guardando: "+ el);

        // con andThen le podemos pasar otro consummer
        list.forEach(notify.andThen(store));


    }

    public static void sendPush(String id) {
        System.out.println("Enviando notificacion push"+id);
    }

    // PREDICATE
    public static void combinacion() {
        Predicate<String> tieneAt = s -> s.contains("@");
        Predicate<String> minSeis = s -> s.length() > 5;

        // verificar el dominio
        Predicate<String> dominioTienePunto = s -> {
            var at = s.indexOf("@");
            if (at == -1) return false;

            var dominio = s.substring(at);
            System.out.println(dominio);
            return dominio.indexOf(".") > 1 && dominio.length() > 4;
        };

        var nuevoPredicate = tieneAt.and(minSeis).and(dominioTienePunto);
        System.out.println(nuevoPredicate.test("holamundo@x.co"));

    }


    // UNARY Y BINARY OPERATOR
    public static void unaryAndBynary() {
        
        UnaryOperator<Integer> inc2 = a -> a + 2;
        // Equivale a:
        // Function<Integer, Integer> incrementar = a -> a + 2;
        
        BinaryOperator<Integer> potencia = (a,b) -> (int)Math.pow(a, b);
        
        System.out.println("incremento: " + inc2.apply(5));
        System.out.println("resultado: " + potencia.apply(3, 3));


    }
}
