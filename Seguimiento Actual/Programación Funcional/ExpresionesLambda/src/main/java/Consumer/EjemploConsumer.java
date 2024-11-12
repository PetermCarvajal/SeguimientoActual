package Consumer;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {
        List<String> nombres =new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        Consumer<String> consumer = nombre ->System.out.println("Hola "+nombre+"!");
        nombres.forEach(consumer);
    }
}

