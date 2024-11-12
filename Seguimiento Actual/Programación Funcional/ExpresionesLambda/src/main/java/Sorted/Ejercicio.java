package Sorted;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Ejercicio {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("banana", "apple", "orange");
        List<String> palabrasOrdenadas = palabras.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(palabrasOrdenadas);
    }
}
