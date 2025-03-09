package Sec06ClasesWrapper;

public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        boolean primitivoBoolean = num1 > num2; // false

        // las tres formas son validas y son lo mismo
        Boolean objBoolean = true;
        Boolean objBoolean2 = Boolean.valueOf(primitivoBoolean);
        Boolean objBoolean3 = Boolean.valueOf("false");

        System.out.println("primitivoBoolean = " + primitivoBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);
        System.out.println("objBoolean3 = " + objBoolean3);

        // al usar == compara por valor en boolean
        System.out.println("Comparando dos objetos boolean con == " + (objBoolean2==objBoolean3)); // true
        System.out.println("Comparando dos objetos boolean con equals " + (objBoolean2.equals(objBoolean3))); // true
        System.out.println("Comparando dos objetos boolean con == " + (objBoolean==objBoolean3)); // false

        // con el metodo booleanValue() obtenemos el valor primitivo
        boolean primitivoBoolean3 = objBoolean3.booleanValue();
        System.out.println("primitivoBoolean3 = " + primitivoBoolean3);
    }
}
