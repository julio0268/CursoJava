import javax.swing.*;

public class Factorial {
    public static void main(String[] args){
        Long resultado=1L;

        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce número"));

        for(int i=numero;i>0;i--){

            resultado=resultado*i;
        }
        System.out.println("El Factorial de " + numero + " es " +resultado);
    }
}
