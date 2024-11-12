package ForEach;

import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.forEach(n -> System.out.println("Número: " + n + ", Cuadrado: " + (n * n)));
    }
}
