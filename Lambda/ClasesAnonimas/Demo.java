package Lambda.ClasesAnonimas;

public class Demo {
    public static void run() {
        
        // PARTE MODIFICADA DE LAMBDA.PREVIO
        // nosotros sabemos que en teoria no deberiamos crear instancias de interfaces
        // por esto en esta parte del codigo estamos creando una CLASE ANONIMA
        push(new Notificable() {
            @Override
            public void push(String message){
                System.out.println("Enviado desde clase anonima: " + message);
            }
        });
    }

    public static void push(Notificable n) {
        n.push("Chanchito feliz");
    }
}
