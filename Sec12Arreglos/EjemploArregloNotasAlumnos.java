package Sec12Arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMat=0, sumNotasHis=0, sumNotasLen=0;

        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para Matematicas");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMat += claseMatematicas[i];
            sumNotasHis += claseHistoria[i];
            sumNotasLen += claseLenguaje[i];
        }

        System.out.println("promedio clase Matematicas: " + (sumNotasMat/claseMatematicas.length));
        System.out.println("promedio clase Lenguaje: " + (sumNotasLen/claseLenguaje.length));
        System.out.println("promedio clase Historia: " + (sumNotasHis/claseHistoria.length));

        System.out.println("Ingrese el id del alumno (de 0 a 6): ");
        int id = scanner.nextInt();
        double promedioAlumno = (claseMatematicas[id]+claseLenguaje[id]+claseHistoria[id])/3;
        System.out.println("promedio de alumno "+ id + ": " + promedioAlumno);
    }
}
