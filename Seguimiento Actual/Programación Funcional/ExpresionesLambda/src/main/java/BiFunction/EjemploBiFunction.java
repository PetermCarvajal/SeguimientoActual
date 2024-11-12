package BiFunction;

import java.util.function.BiFunction;

public class EjemploBiFunction {

    /*
    En Java Funcional es una Función transformadora que Toma 2 Argumentos de Diferentes Tipos y
    Devuelve un Resultado de Otro Tipo

    Pero no es Obligatorio que Lo haga
    */

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addNumbers = (a, b) -> a + b;

        int sum=addNumbers.apply(10, 20);
        System.out.println("the sum of 10 and 20 is "+sum);
    }
}
