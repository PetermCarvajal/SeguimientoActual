package Consumer;

import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<Integer> contador = new ArrayList<>();

        contador.add(3);
        contador.add(2);
        contador.add(1);
        contador.add(0);

        Consumer <Integer> consumer= temporizador ->System.out.println(temporizador);

        contador.forEach(consumer);

        System.out.println("Eso no Significa que no Acepte Classes Wrapper");
    }
}
