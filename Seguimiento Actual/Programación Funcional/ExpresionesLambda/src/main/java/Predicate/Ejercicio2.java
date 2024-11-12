package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<String> palabras = List.of("manzana", "pera", "banana", "uva", "durazno", "kiwi");

        Predicate<String> masDeCincoCaracteres = palabra -> palabra.length() > 5;

        Predicate<String> contieneA = palabra -> palabra.contains("a");

        Predicate<String> filtroCombinado = masDeCincoCaracteres.and(contieneA);

        List<String> palabrasFiltradas = new ArrayList<>();

        for (String palabra : palabras) {
            if (filtroCombinado.test(palabra)) {
                palabrasFiltradas.add(palabra);
            }
        }
        System.out.println("Palabras que tienen más de 5 caracteres y contienen la letra 'a': " + palabrasFiltradas);
    }
}
