package PropYMetPrivados;

public class User {
    static String tableName = "user123";
    double id = Math.random();
    String name;
    private int edad;

    User(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    // en este caso queremos devolver la edad asi que cambiamos el tipo de retorno
    public int saludar() {
        System.out.println("Hola mundo, soy " + tableName);
        System.out.println(this.edad);

        // llamando a metodo privado
        int edad = this.metodoPrivado();

        return edad;
    }

    // Metodo Privado: no lo puedo llamar desde main, pero
    // si podemos acceder a este, dentro de la misma clase de usuario
    private int metodoPrivado(){
        System.out.println("procesando datos...");
        return this.edad;
    }

    public static void main(String[] args) {
        User user = new User("Cristian", 30);
        user.saludar();
    }
}