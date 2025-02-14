package Metodos;

public class ParametrosComoArrays {
    public static void main(String[] args){
        int r = suma(new int[] {1,4,7,9});

        System.out.println(r);
    }

    static int suma (int[] numeros){
        int resultado = 0;

        for(int numero: numeros){
            resultado += numero;
        }

        return resultado;
    }
}
