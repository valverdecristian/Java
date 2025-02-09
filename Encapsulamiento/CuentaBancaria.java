package Encapsulamiento;

public class CuentaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Métodos públicos para acceder a los atributos privados
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado. Saldo actual: " + saldo + " Titular: " + titular);
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    // Getter para el saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter para el titular
    public void setTitular(String titular) {
        this.titular = titular;
    }
}