package Encapsulamiento;

public class User {

    static String tableName = "user123";
    double id = Math.random();
    String name;
    String email;

    private String password = "12345678";

    User(String name){
        this.name = name;
    }

    // Constructor Overloading
    User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void login(){
        System.out.println("llamando a base de datos");
    }
    
    private void validatePassword(){
        System.out.println("Verificando la contraseña ");
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        System.out.println("Encriptando clave...");
        String encryptedPassword = password;
    }

    // Method Overloading
    public void setPassword(String password, String encryption){
        System.out.println("Encriptando la contraseña...");
    }

    public static void main(String[] args) {
        User user = new User("Cristian");
        user.login();

        String pass = user.getPassword();
        System.out.println(pass);

        user.setPassword("13134545");
        System.out.println(user.getPassword());

        // usamos el segundo contructor
        User user2 = new User("Jorge", "crizthian2010@gmail.com");
        user2.login();
    }
}
