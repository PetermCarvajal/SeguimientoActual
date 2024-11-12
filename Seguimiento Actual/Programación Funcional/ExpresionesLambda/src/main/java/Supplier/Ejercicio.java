package Supplier;

import java.util.function.Supplier;

public class Ejercicio <T> {

    private T object;
    public Ejercicio(T object){
        this.object = object;
    }

    public T getObject(){
        return object;
    }

    public static void main(String[] args) {
        Ejercicio <String> EjercicioString = new Ejercicio<>("Hay Esto Esta Largo");
        Supplier <Ejercicio<String>> supplier = () -> EjercicioString;

        Ejercicio <String> EjercicioString1=new Ejercicio<>(" y esta Haciendo Hambre (6)");
        Supplier <Ejercicio<String>> supplier1 = () -> EjercicioString1;

        System.out.println(supplier.get().getObject()+" "+supplier1.get().getObject());
    }
}
