package BiFunction;

import javax.swing.*;
import   java.util.function.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> exponente = (a, b) -> Math.pow(a, b);

        // y Como desde cuando esto no sirve para Exponente **

        //Esa Funcion Obliga a que sea Double Parece

        int input = Integer.parseInt(JOptionPane.showInputDialog(null,"Por Favor Ingrese un Número"));
        int input2 =Integer.parseInt(JOptionPane.showInputDialog(null,"Por Favor Ingrese un Número"));

        double Resultado=exponente.apply(input,input2);
        JOptionPane.showMessageDialog(null,"El Rsultado de "+input+" Exponenciado a "+input+" es: "+Resultado);
    }
}
