package Ejercicios;
/** PARTE 1:
 * Crear la clase VideoGames.
 * Propiedades: name (Str), price (double) y category (Str)
 * Agregar Getters y Setters para todas las propiedades.
 */

import java.text.NumberFormat;

/** PARTE 2:
 * Modificar nuestro metodo de setCategory
 * Va a tener que validar que la categoria que estamos pasando
 * en el metodo exista dentro de un array.
 * Contenido del array: action, rpg, adventure y racing
 * Estas categorias deberan estar dentro de una propiedad static.
 */

/** PARTE 3:
 * Tomar getCategory y pasarlo todo a mayusculas y agregarle un punto final.
 */

/** PARTE 4
 * Tomar nuestra clase VideoGames y cuando nosotros creemos una instancia de
 * VideoGames en el contructor tenemos que pasarle el nombre y el precio que va
 * a tener esta instancia de VideoGames.
 * Ademas si el precio es menor que 10 hay que asignarle el valor de 10 al precio.
 */

/** PARTE 5
 * Darle formato al precio (getPrice)
 */

public class VideoGames {
    public static void main(String[] args) {

        // una vez creada la clase, creamos una instancia
        VideoGames vg = new VideoGames("Pokemon", 12.5);
        vg.setCategory("adventure");
        System.out.println(vg.getCategory());
        System.out.println(vg.getName());
        System.out.println(vg.getPrice());
    }

    // propiedades:
    String name;
    double price;
    String category;

    static String[] categories = {"action","rpg","adventure","racing"};

    // parte 4
    VideoGames(String name, double price){
        this.name = name;
        if (price < 10){
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    // metodos getters y setters
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPrice(){
        // parte 5
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nf.format(this.price);
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getCategory(){
        // parte 3
        return this.category.toUpperCase() + ".";
    }

    // parte 2
    public void setCategory(String category){
        boolean isInList = false;

        for (String c : VideoGames.categories) {
            if(c.equals(category)){
                isInList = true;
                break;
            }
        }

        if(isInList){
            this.category = category;
        }
        else {
            System.out.println("No esta en la lista");
        }
    }

}