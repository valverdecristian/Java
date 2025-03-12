package Sec11LineaDeComando;

public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos n " + i + ": " + args[i]);
        }
    }
}

/*  PASOS:
    En la terminal:
    dir
    cd Sec11LineaDeComando
    javac -d . ArgumentosLineaComando.java -encoding utf8
    java Sec11LineaDeComando.ArgumentosLineaComando argumento1 argumento2 "tercer parametro"
 */

/*  System.exit
    0: Cuando sale todo bien
    1: Exception
    -1: Error
 */