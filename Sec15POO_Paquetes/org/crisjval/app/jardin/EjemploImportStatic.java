package Sec15POO_Paquetes.org.crisjval.app.jardin;

// este import es para poder instanciar Persona
import Sec15POO_Paquetes.org.crisjval.app.hogar.ColorPelo;
import Sec15POO_Paquetes.org.crisjval.app.hogar.Persona;
// este import es para poder usar el metodo static Saludar()
import static Sec15POO_Paquetes.org.crisjval.app.hogar.Persona.Saludar;

public class EjemploImportStatic {
    public static void main(String[] args) {

        Persona persona = new Persona("Cristian");
        String saludo = Saludar();

        // si quiero usar solo CAFE debo importarlo como estatico
        persona.setColorPelo(ColorPelo.CAFE);

        System.out.println("saludo = " + saludo);
    }
}
