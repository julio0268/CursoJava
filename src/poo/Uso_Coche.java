package poo;
import javax.swing.*;


public class Uso_Coche {
    public static void main(String[] args) {


        //coche micoche = new coche();  //INSTANCIAR UN A CLASE. UN EJEMPLAR DE COCHE
        //System.out.println(Renault.dime_largo());
        //System.out.println("Este coche tiene "+ Renault.largo + " ruedas.");


        coche micoche = new coche();

        micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));// objeto->micoche -- metodo->establece_color.


        System.out.println(micoche.dime_datos_generales());

        System.out.println(micoche.dime_color());

        micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));

        System.out.println(micoche.dime_asientos());

        micoche.configura_climatiador(JOptionPane.showInputDialog("¿Tiene climatizador?"));

        System.out.println(micoche.dime_climatizador());

        System.out.println(micoche.dime_peso_coche());

        System.out.println("El precio final del coche es: " + micoche.precio_coche());

    }

}
