package Sec14POO_ClasesYObjetos;

public class Motor {

    private double cilindrada;
    private TipoMotor tipo;

    public Motor() {
    }

    public Motor(double cilindrada, TipoMotor tipo) {
        this();
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
