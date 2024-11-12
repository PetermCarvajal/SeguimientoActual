package Supplier;

import java.util.function.Supplier;
//No toma argumentos, Devuelve 1 Valor
public class EjemploSupplier {
    public static void main(String[] args) {
        Supplier<Integer> randomNumSupplier = ()->(int)(Math.random()*100);{
            int randomNum = randomNumSupplier.get();
            System.out.println("El Número Aleatorio es:"+randomNum);
        }

        }
    }
//No necesita de ; por alguna razón
