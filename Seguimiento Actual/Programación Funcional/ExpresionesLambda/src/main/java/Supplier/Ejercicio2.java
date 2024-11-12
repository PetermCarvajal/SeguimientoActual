package Supplier;

import java.util.function.Supplier;

public class Ejercicio2<N, A> {
    private N numero;
    private A frase;

    // Constructor privado que acepta ambos parámetros
    private Ejercicio2(N numero, A frase) {
        this.numero = numero;
        this.frase = frase;
    }

    public A getFrase() {
        return frase;
    }

    public N getNumero() {
        return numero;
    }

    public void setNumero(N numero) {
        this.numero = numero;
    }

    public void setFrase(A frase) {
        this.frase = frase;
    }

    public static void main(String[] args) {
        Ejercicio2<Integer, String> a = new Ejercicio2<>(5,"Long years");

        Supplier<Ejercicio2<Integer,String>>supplier= () -> a;

        System.out.println(supplier.get().getNumero()+" "+supplier.get().getFrase());

    }
}
