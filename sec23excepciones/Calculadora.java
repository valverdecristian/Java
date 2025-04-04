package sec23excepciones;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivForZeroException {
        if(divisor == 0){
            // al ser chequeada estamos obligados a declararla con "throws"
            // o capturarla con try-catch al momento de invocar este metodo.
            throw new DivForZeroException("No se puede dividir por zero");
        }
        return numerador/(double)divisor;
    }

    public double dividir(String numerador, String divisor)
            throws DivForZeroException, FormatNumException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        } catch (NumberFormatException nfe) {
            throw new FormatNumException("debe ingresar un numero en el numerador y divisor");
        }

    }
}
