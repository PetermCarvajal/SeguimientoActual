package Function;

import javax.swing.*;
import java.util.function.Function;

public class Ejercicio {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese la contraseña");

        Function<String, Boolean> func = value -> !Boolean.parseBoolean(value);

        Boolean esIncorrecta = func.apply(input);

        if (esIncorrecta) {
            System.out.println("La contraseña es incorrecta.");
        } else {
            System.out.println("La contraseña es correcta.");
        }
    }
}
