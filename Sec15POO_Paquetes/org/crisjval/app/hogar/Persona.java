package Sec15POO_Paquetes.org.crisjval.app.hogar;

public class Persona {

    // este atributo al ser public se puede usar cuando se importe el package
    private static String nombre;
    private ColorPelo colorPelo;

    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";

    public Persona() {
    }

    public Persona(String nombre) {
        this();
        Persona.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        Persona.nombre = nombre;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    public static String Saludar(){
        return "Mi nombre es: " + Persona.nombre;
    }
}