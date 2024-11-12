package Predicate;

import java.util.function.Predicate;

public class Ejercicio {
    public static void main(String[] args) {

                Predicate<Integer> esPar = numero -> numero % 2 == 0;

                int numero1 = 24;
                int numero2 = 23;

                String mensaje=String.format("""
                        
                        ¿ %d es par? %b
                        """,numero1,esPar);
                String mensaje2=String.format("""
                        ¿ %d es impar? %b
                        """,numero2,esPar);

                System.out.println(mensaje);
                System.out.println(mensaje2);
    }
}
