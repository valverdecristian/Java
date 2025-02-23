package Streams;

public class User {

    public int age;
    public String email;
    public Mandos mando;

    public User(int age, String email, Mandos mando) {
        this.age = age;
        this.email = email;
        this.mando = mando;
    }

    public User(int age, String email) {
        this.age = age;
        this.email = email;
    }

    public User(int age) {
        this.age = age;
    }

}
