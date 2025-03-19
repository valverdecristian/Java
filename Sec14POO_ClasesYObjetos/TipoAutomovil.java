package Sec14POO_ClasesYObjetos;

public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    PICKUP("Pickup", "Camioneta", 4),
    HATCHBACK("Hatchback", "Auto compacto", 4),
    COUPE("Coupé", "Auto pequeño", 2),
    FURGON("Furgon", "Auto utilitario", 4);

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
