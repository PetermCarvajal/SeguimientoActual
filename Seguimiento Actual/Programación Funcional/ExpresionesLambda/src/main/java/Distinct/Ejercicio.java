package Distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Carlos", "Ana", "Carlos", "Pedro");
        List<String> nombresUnicos = nombres.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(nombresUnicos);
    }
}
