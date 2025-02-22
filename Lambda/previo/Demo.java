package Lambda.previo;

public class Demo {
    public static void run() {
        
        push(new Notification());
    }

    public static void push(Notificable n) {
        n.push("Chanchito feliz");
    }
}
