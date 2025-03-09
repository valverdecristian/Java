package Sec09ClaseSystem;

import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("Sec09ClaseSystem/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "mi valor guardado");

            System.setProperties(p);
            System.getProperties().list(System.out);

        } catch (Exception e){
            System.out.println("no existe el archivo = " + e);
            System.err.println("texto en rojo");
            System.exit(1);
        }
    }

    // para textos que marquen un error es mejor usar "System.err" en vez de "System.out"
    // System.exit(0) -> cuando hay un error es distinto de cero
}
