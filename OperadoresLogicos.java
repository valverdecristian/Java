public class OperadoresLogicos {
    
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a || b; // or
        boolean d = a && b; // and
        boolean e = !a; // not

        // compara el valor de ambas variables
        System.out.println(c); // true
        System.out.println(d); // false
        System.out.println(e); // false
    }
}
