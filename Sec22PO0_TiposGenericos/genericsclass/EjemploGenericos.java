package Sec22PO0_TiposGenericos.genericsclass;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topo", "Caballo"));
        transporteCaballos.add(new Animal("Longo", "Caballo"));

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transMaq = new Camion<>(3);
        transMaq.add(new Maquinaria("Bulldozer"));
        transMaq.add(new Maquinaria("Grua"));
        transMaq.add(new Maquinaria("Perforadora"));

        imprimirCamion(transMaq);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubishi"));
        transAuto.add(new Automovil("Chevrolet"));

        imprimirCamion(transAuto);
    }

    // como se repite el for, podemos implementar generico para codigo mas limpio
    public static <T> void imprimirCamion(Camion<T> camion){
        for (T t : camion) {
            if(t instanceof Animal){
                System.out.println(((Animal)t).getNombre() + " tipo: " + ((Animal)t).getTipo());
            } else if (t instanceof Automovil){
                System.out.println(((Automovil)t).getMarca());
            } else if (t instanceof Maquinaria){
                System.out.println(((Maquinaria)t).getTipo());
            }
        }
    }

}
