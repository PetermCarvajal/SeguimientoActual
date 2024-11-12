package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> cuadrados = numeros.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(cuadrados);
    }
}
