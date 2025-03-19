package Sec14POO_ClasesYObjetos;

public enum Color {
    ROJO("rojo"),
    AMARILLO("amarillo"),
    AZUL("azul"),
    BLANCO("blanco"),
    GRIS("gris"),
    NARANJO("naranjo");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    // al implementar el toString, va a mostrar los valores asignados y no los de defecto
    @Override
    public String toString() {
        return this.color;
    }
}
