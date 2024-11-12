package Filter;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("", "Sonia", "Sofia", "Alejandro", "Alexander", "Anuel");

        List<String> ordenAlf = nombres.stream()
                .filter(n -> n.startsWith("Al")) /*No sabia que startsWith Existia*/.collect(Collectors.toList());
        System.out.println("Nombres que comienzan con 'Al': " + ordenAlf);
    }
}
