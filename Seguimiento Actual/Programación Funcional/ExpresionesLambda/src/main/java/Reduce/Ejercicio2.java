package Reduce;

import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Manzana","Banana","Melon","Sandia");
        String palabraMasLarga = palabras.stream()
                .reduce("", (a, b) -> a.length() > b.length() ? a : b);

        System.out.println(palabraMasLarga);
    }
}
