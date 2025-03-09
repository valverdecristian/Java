package Sec09ClaseSystem;

import java.util.Properties;

public class PropiedadesDeSistema {
    public static void main(String[] args) {

        // nombre de usuario del sistema operativo
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        // para listar todo
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
