package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio {
    public static void main(String[] args) {
    List <String> carrerasList=Arrays.asList("Ingeniría de Software","Ingeniería de Software","Ingeniería de Sistemas","Ingeniería Electrónica","Ingeniería Informática","Ingeniería en Computación");

    Stream <String> carrerasStream=carrerasList.stream();

        System.out.println("Lista de carreras ");
        carrerasStream.forEach(System.out::println);
    }
}
