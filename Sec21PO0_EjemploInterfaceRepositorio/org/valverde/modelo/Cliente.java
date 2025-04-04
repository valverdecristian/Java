package Sec21PO0_EjemploInterfaceRepositorio.org.valverde.modelo;

import java.util.Objects;

public class Cliente extends BaseEntity {
    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        // super: va a la clase padre para asignar un id incremental
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "id=" + id +
                " nombre='" + nombre + '\'' +
                " apellido='" + apellido + '\'';
    }
}
