package BiConsumer;

import javax.swing.*;
import java.util.function.BiConsumer;

public class Ejercicio {
    public static void main(String[] args) {

        //1. Confirmacion con Los input 2. se ingresan los Imputs a través del .accept

        String usuario="Ingición";
        String password="Confirmada";

        String Usuario= JOptionPane.showInputDialog("Ingrese su usuario");
        String Password= JOptionPane.showInputDialog("Ingrese su password");

        BiConsumer<String,String>inicioSesion = (a,b)->{if(a.equals(Usuario) && b.equals(Password)) {

            System.out.println("Bienvenido");

        }else{
            JOptionPane.showMessageDialog(null,"Mamá se Metio un Pejelagarto");
        }
        };
        inicioSesion.accept(usuario,password);
    }
}
