import javax.swing.*;

public class Entrada_ejemplo3 {
    public static void main(String[] args){
        String Nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");

        String edad = JOptionPane.showInputDialog("Introduce la edad, por favor");

        // El metodo parse.int convierte un String en un Int
        int edad_usuario= Integer.parseInt(edad);

        System.out.println("Hola " + Nombre_usuario + ". El año que viene tendrás " + edad_usuario + " años");


    }
}
