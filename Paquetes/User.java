package Paquetes;

public class User {

    String name;

    // con el modificador de acceso en el contructor (public) y asi en el
    // main no habra algun error al querer acceder.
    public User(String name){
        this.name = name;

        Permission p = new Permission();
    }
}
