package Sec14POO_ClasesYObjetos;

public class Automovil {

    // atributos
    // puedo darle un valor por defecto
    // al ser privados se puede acceder para leer o modificar dentro de la misma clase
    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    private int capacidadTanque = 40;
    private Persona conductor;
    private Rueda[] ruedas;

    private TipoAutomovil tipo = TipoAutomovil.PICKUP;

    // atributo estatico (compartido por todas las instancias)
    private static String colorPatente = "Naranja";
    private static int capacidadTanqueStatic = 40;

    private int id;
    private static int ultimoId;

    // constructor
    public Automovil(){
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo);
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadTanque = capacidadTanque;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque, Persona conductor, Rueda[] ruedas, TipoAutomovil tipo) {
        this(fabricante, modelo, color, cilindrada, capacidadTanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
        this.tipo = tipo;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // getters y setters
    public String getFabricante(){
        return this.fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getColor(){
        return this.color;
    }

    public double getCilindrada(){
        return this.cilindrada;
    }

    public int getCapacidadTenque(){
        return this.capacidadTanque;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public void setCapacidadTanque(int capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }

    // getter y setter estaticos
    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    // metodos
    public String verDetalle(){
        return "auto.id = " + this.id +
                "\nauto.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo() +
                "\nauto.tipo = " + this.getTipo().getDescripcion() +
                "\nauto.color = " + this.getColor() +
                "\nauto.patenteColor = " + Automovil.colorPatente +
                "\nauto.cilindrada = " + this.getCilindrada();
    }

    // no hace falta el this de forma explicita.
    public String acelerar (int rpm){
        return "el auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return fabricante + " " + modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        // obtenemos el rendimiento de kms recorridos por litro de bencina.
        return km/(capacidadTanque*porcentajeBencina);
    }

    public static float calcularConsumoEstatico(int km, float porcentajeBencina){
        return km/(capacidadTanqueStatic*porcentajeBencina);
    }

    // sobrecarga de metodos
    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(capacidadTanque*(porcentajeBencina/100f));
    }

    @Override
    public boolean equals(Object obj) {
        // comparamos por referencia
        if(this == obj){
            return true;
        }

        // tenemos que validar que sea distinto de nulo y que sea una instancia adecuada
        if(!(obj instanceof Automovil)){
            return false;
        }

        // tenemos que hacer un cast
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equalsIgnoreCase(a.getFabricante()) &&
                this.modelo.equalsIgnoreCase(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil {" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", id='" + id + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
