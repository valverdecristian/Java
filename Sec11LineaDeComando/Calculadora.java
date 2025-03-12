package Sec11LineaDeComando;

public class Calculadora {
    public static void main(String[] args) {

        if(args.length != 3){
            System.err.println("Por favor ingresar una operacion y dos numeros (suma,resta,multi,div)");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double resultado = 0.00;

        switch (operacion){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multi":
                resultado = a*b;
                break;
            case "div":
                if(b== 0){
                    System.exit(-1);
                    System.err.println("no se puede dividir por zero");
                }
                resultado = (double)a/b;
                break;
            default:
                resultado = a+b;
        }

        System.out.println("Resultado: "+resultado);

    }
}
