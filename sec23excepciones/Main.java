package sec23excepciones;

import javax.swing.*;
import java.text.Normalizer;

public class Main {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("ingrese un entero");
        int divisor;
        double division;

        try {
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10, divisor);
            System.out.println(division);

            double division2 = cal.dividir("10", "5");
            System.out.println("division2 = " + division2);
        }
        catch (NumberFormatException nfe){
            System.out.println("Se detecto una excepcion: ingresar un valor numerico: " + nfe.getMessage());
        }
        catch (FormatNumException fe){
            System.out.println("Se detecto una excepcion. Ingrese un num valido: " + fe.getMessage());
            fe.printStackTrace(System.out);
        }
        catch (Exception e){
            // el tipo Exception es el mas generico
            System.err.println("Capturamos la excepcion en tiempo de ejecucion: " + e.getMessage());
        }
        finally {
            System.out.println("Este espacio se puede usar para cerrar un archivo o finalizar alguna conexion");
        }
    }
}
