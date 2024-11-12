package BiConsumer;

import java.util.function.BiConsumer;

public class EjemploBiConsumer {
    public static void main(String[] args) {
        //BiConsumer Recibe 2 Parametros Pero no Devuelve Nada

        BiConsumer<String,Integer> printDetails = (name, age)->System.out.println(name+" tiene "+age+" años");

        //.accept es un metodo que recibe 2 parametros de cualquier Tipo  para realizar la Operacion del biConsumer

        printDetails.accept("Jhon",25);
        printDetails.accept("Ana",17);


    }
}
