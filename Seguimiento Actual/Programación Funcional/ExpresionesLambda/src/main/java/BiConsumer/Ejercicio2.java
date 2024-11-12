package BiConsumer;

import javax.swing.*;
import java.util.function.BiConsumer;

public class Ejercicio2 {
    public static void main(String[] args) {

        int input = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
        int input2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));

        BiConsumer<Integer, Integer> tablaExc = (a, b) -> {
            int max = Math.max(a, b);
            for (int i = 1; i <= max; i++) {
                if (i <= a) {
                    System.out.print(a * i + " ");
                }
                if (i <= b) {
                    System.out.print(b * i + " ");
                }
                System.out.println("Vuelta: " + i);
            }
        };

        tablaExc.accept(input, input2);
    }
}