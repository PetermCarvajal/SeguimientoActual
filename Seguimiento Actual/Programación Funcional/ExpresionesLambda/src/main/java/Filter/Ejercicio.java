package Filter;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ejercicio {
    public static void main(String[] args) {
        List<Integer> numeros= Arrays.asList(10,25,17,18,86,9,5,100,1999,200,244,15,4);
        List<Integer>multiplos5=numeros.stream().filter(n->n%5==0).collect(Collectors.toList());

        System.out.println(multiplos5);
    }
}
