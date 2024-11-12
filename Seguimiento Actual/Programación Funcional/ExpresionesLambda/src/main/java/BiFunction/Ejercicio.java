package BiFunction;

import java.util.function.*;
public class Ejercicio {

    public static void main(String[] args) {

        //Funcion <Tipo de datos de entrada,TdE,Tipo dato Salida>
        BiFunction<String,String,String> concatString = (a,b)->a+b;
                                        //Nombre de la Funcion=(parametros que recibe)->Operación
        String contatenar=concatString.apply("Hola Señor"," ¿Qué es lo que vamos a hacer Hoy?");
        System.out.println(contatenar);

    }
}
