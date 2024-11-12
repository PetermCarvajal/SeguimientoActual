package Distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> paresUnicos = numeros.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(paresUnicos);
    }
}
