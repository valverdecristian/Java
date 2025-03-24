package Sec19POO_HerenciaYClasesAbstractas.org.form;

import Sec19POO_HerenciaYClasesAbstractas.org.form.elementos.*;
import Sec19POO_HerenciaYClasesAbstractas.org.form.elementos.select.Opcion;
import Sec19POO_HerenciaYClasesAbstractas.org.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpciones(java)
        .addOpciones(new Opcion("2", "Python"))
        .addOpciones(new Opcion("3", "JavaScript"))
        .addOpciones(new Opcion("4", "TypeScript"))
        .addOpciones(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value=\""+this.valor+"\">";
            }
        };

        saludar.setValor("Hola que tal este campo esta deshabilitado");
        username.setValor("john.die");
        password.setValor("a1b2");
        email.setValor("john.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("... mas de 5 años de experiencia ...");
        java.setSelected(true);

        // en vez de crear un Arraylist<>() lo refactorizamos
        List<ElementoForm> elementos = Arrays.asList(username, password,
                email, edad, experiencia, lenguaje, saludar);

        // esto lo podriamos simplificar a expresion lambda
        for(ElementoForm e:elementos){
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }

        elementos.forEach(e->{
            if(!e.esValido()){
                // usamos un alias o atajo [metodo de referencia]
                e.getErrores().forEach(System.err::println);
            }
        });
    }
}
