
// Utils es una convencion que se utiliza para crear nuestras propias herramientas
// otra convencion es que los metodos dentro de esta clase suelen ser static
public class Utils {

    public static <T extends Number> T max(T a, T b) {
        return a.doubleValue() > b.doubleValue() ? a:b;
    }
}
