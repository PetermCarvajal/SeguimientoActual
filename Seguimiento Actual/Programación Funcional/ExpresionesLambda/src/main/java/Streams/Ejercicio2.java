package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio2 {
    public static void main(String[] args) {

        Stream<Integer>Temporizador = Stream.of(10,9,8,7,6,5,4,3,2,1,0);
        System.out.println("T-");
        Temporizador.forEach(System.out::println);
    }
}
