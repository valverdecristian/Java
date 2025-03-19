package Sec14POO_ClasesYObjetos;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        // el objeto aun no tiene estado, valores por defecto.
        System.out.println("auto.fabricante = " + auto.getFabricante()); // null
        System.out.println("auto.modelo = " + auto.getModelo()); // null
        System.out.println("auto.color = " + auto.getColor()); // "gris" [valor por defecto]
        System.out.println("auto.cilindrada = " + auto.getCilindrada()); // 0.0

        // otra instancia de Automovil
        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setColor("rojo");
        mazda.setCilindrada(3.0);

        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        System.out.println(mazda.verDetalle());
        System.out.println(auto.verDetalle());
        System.out.println(mazda.acelerar(3000));
        System.out.println(mazda.frenar());

        System.out.println(mazda.acelerarFrenar(2000));

        // principio de encapsulamiento
        System.out.println("Kms por litro: " +mazda.calcularConsumo(300, 0.6f));
        System.out.println("Kms por litro: " +mazda.calcularConsumo(300, 60));

        // otro objeto Automovil
        Automovil nissan = new Automovil("Nissan","Navara");
        Automovil nissan2 = new Automovil("Nissan","Navara");
        System.out.println(nissan.verDetalle());

        System.out.println("---- Metodo equals() ----");
        System.out.println("nissan == nissan2 = " + (nissan == nissan2)); // false
        System.out.println("nissan.equals(nissan2) = " + nissan.equals(nissan2)); // true

        System.out.println("---- Metodo toString() de forma Explicita e Implicita ----");
        System.out.println(nissan.toString());
        System.out.println(nissan);
    }
}
