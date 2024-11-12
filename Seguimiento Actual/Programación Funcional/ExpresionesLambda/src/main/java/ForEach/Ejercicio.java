package ForEach;

import java.util.Arrays;
import java.util.List;

public class Ejercicio {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Carlos", "Ana", "Pedro");
        nombres.forEach(System.out::println);
    }
}
