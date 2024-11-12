package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("banana", "apple", "orange", "apple");
        Set<String> palabrasUnicas = palabras.stream()
                .collect(Collectors.toSet());

        System.out.println(palabrasUnicas);
    }
}
