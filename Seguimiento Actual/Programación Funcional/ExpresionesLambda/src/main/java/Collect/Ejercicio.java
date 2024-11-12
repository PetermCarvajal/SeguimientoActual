package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Carlos", "Ana", "Pedro");
        String nombresConcatenados = nombres.stream()
                .collect(Collectors.joining(", "));

        System.out.println(nombresConcatenados); }

}
