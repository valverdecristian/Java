package Sec16POO_EjemploFacturas.appfacturas;

import Sec16POO_EjemploFacturas.appfacturas.modelo.*;
import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNif("5555-5");
        cliente1.setNombre("Cristian");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura: ");
        Factura factura1 = new Factura(scanner.nextLine(), cliente1);

        Producto producto1;

        System.out.println();

        for (int i = 0; i < 2; i++) {
            producto1 = new Producto();
            System.out.print("Ingrese producto n° " + producto1.getCodigo() + ": ");
            producto1.setNombre(scanner.nextLine());

            System.out.print("Ingrese el precio: ");
            producto1.setPrecio(scanner.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura1.addItemFactura(new ItemFactura(scanner.nextInt(), producto1));

            System.out.println();
            scanner.nextLine();
        }

        // System.out.println(factura1.generarDetalle());
        System.out.println(factura1);
    }
}
