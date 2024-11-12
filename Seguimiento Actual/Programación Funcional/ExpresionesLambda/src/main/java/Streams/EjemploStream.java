package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {

    public static void main(String[] args) {
        // 1. Desde una Collection
        List<String> lista = Arrays.asList("Java", "Python", "JavaScript");
        Stream<String> streamDeList = lista.stream();

        // 2. Desde un array
        String[] array = {"Java", "Python", "JavaScript"};
        Stream<String> streamDeArray = Arrays.stream(array);

        // 3. Stream de valores directos
        Stream<String> streamDeValores = Stream.of("Java", "Python", "JavaScript");

        // 4. Stream infinito
        Stream<Integer> streamInfinito = Stream.iterate(1, n -> n + 1);

        // Ejemplo de uso: Imprimir los valores de cada stream
        System.out.println("Stream de lista:");
        streamDeList.forEach(System.out::println);

        System.out.println("\nStream de array:");
        streamDeArray.forEach(System.out::println);

        System.out.println("\nStream de valores:");
        streamDeValores.forEach(System.out::println);

        System.out.println("\nPrimeros 5 valores de stream infinito:");
        streamInfinito.limit(5).forEach(System.out::println);
    }
}
