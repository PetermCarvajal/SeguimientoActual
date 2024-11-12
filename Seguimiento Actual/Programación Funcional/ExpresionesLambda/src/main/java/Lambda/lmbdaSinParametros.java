
import javax.swing.*;
import java.util.function.Function;


public class lmbdaSinParametros {

    //La Sintaxis de las Expresiones Lambda General es  ()->{}

    // Para Hacer una Sin parametros No pones nada en ()
    Runnable tarea=()->{JOptionPane.showMessageDialog(null,"Ni en Pedo Esto lo Usaria");
    };

    Runnable tareaRemplazo=()->{JOptionPane.showMessageDialog(null, """
            
            Sobre Todo Con Este Que es Un Poco Más Comodo Aún
            
            //Pero Sin lambda
            """);
    };
    public void metodoParametros(){

 int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Número"));
    // El Valor solicitado y el valor lambda Son diferente Error Variable is already ...
        Function<Integer,Integer> parametro=(Integer a)->{
            int nullImginacion=a;
            for(int i = 0; i<=100; i++){
                nullImginacion+=i;
            }
            return nullImginacion;
        };
        int finalResult = parametro.apply(b);
        JOptionPane.showMessageDialog(null, "El resultado es: " + finalResult);
    }
    public void metodoParametrosS(){
        String a=JOptionPane.showInputDialog("Ingrese un nombre");
        Function<String,String>parametroS=(String s)->{
            s="Se Vera Cascada le van a meter a ";
            return  s+a;
        };

        String Stringfinal=parametroS.apply(a);
        JOptionPane.showMessageDialog(null, Stringfinal);
    }

}



public void main(String[] args) {
lmbdaSinParametros N=new lmbdaSinParametros();
N.tarea.run();
N.tareaRemplazo.run();
N.metodoParametros();
N.metodoParametrosS();
}
