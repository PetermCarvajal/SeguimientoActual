package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Carlos", "Ana", "Pedro");
        List<String> nombresMayusculas = nombres.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(nombresMayusculas);
    }
}
