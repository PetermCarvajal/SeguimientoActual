package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ejercicio {
    public static void main(String[] args) {
        List<String> Anios = new ArrayList<>();

        //Los Consumer No Pueden Recibir Los Tipos de Datos Primitivos (int)

        Anios.add("1");Anios.add("2");Anios.add("3");Anios.add("4");Anios.add("5");Anios.add("6");Anios.add("7");Anios.add("8");Anios.add("9");Anios.add("10");Anios.add("11");Anios.add("12");Anios.add("13");Anios.add("14");Anios.add("15");Anios.add("16");Anios.add("17");Anios.add("18");Anios.add("19");Anios.add("20");Anios.add("21");Anios.add("22");Anios.add("23");Anios.add("24");

        Consumer <String> consumer = numero->System.out.println(numero);
        Anios.forEach(consumer);
        System.out.println("Feliz Cumpleaños");

    }
}




