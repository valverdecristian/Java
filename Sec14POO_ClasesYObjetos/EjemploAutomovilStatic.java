package Sec14POO_ClasesYObjetos;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil nissan = new Automovil("Nissan","Navara");
        Automovil nissan2 = new Automovil("Nissan","Navara");
        Automovil subaru = new Automovil("Subaru","Impreza");
        Automovil mazda = new Automovil("Mazda","BT-50");
        nissan.setTipo(TipoAutomovil.SEDAN);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        // podemos modificar colorPatente porque es default
        Automovil.setColorPatente("Verde");

        System.out.println(nissan.verDetalle()); // se ve modificado el color de la patente
        System.out.println(nissan2.verDetalle());
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());

        System.out.println();

        // leer la patente
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());

        // forma correcta de llamar a un metodo estatico de la clase
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));
    }
}
