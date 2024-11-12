package Sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 3, 8, 1);
        List<Integer> numerosDescendentes = numeros.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        System.out.println(numerosDescendentes);
    }
}
