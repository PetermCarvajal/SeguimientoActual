package Function;

import java.util.function.Function;

//Toma Una Entrada y Devuelve una Salida

public class EjemploFunction {
    public static void main(String[] args) {

        Function <String,String> toUpper = str -> str.toUpperCase();
        String uppercaseString = toUpper.apply("Hello");
        System.out.println("The uppercase String is "+uppercaseString);

    }
}
