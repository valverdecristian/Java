package Streams;

import java.util.List;

public class Demo {
    public static void run () {
        List<User> users = List.of(
            new User(14),
            new User(12),
            new User(18),
            new User(48)
        );


        // esta seria una forma tradicional para contar los elementos de una list
        // se lo conoce como PROGRAMACION IMPERATIVA
        // int count = 0;
        // for (User user : users) {
        //     if (user.age < 18) {
        //         count++;
        //     }
        // }

        // alternativa a la imperativa: PROGRAMACION DECLARATIVA
        // la cual se le indica que es lo queremos que haga (nunca el como)

        long cantidad = users.stream()
            .filter(user -> user.age < 18)
            .count();

        System.out.println("cantidad: " + cantidad);
    }
}
