import java.util.*;
import javax.swing.*;
public class Areas {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Circulo");

        int figura=entrada.nextInt();

        switch(figura){

            case 1:
                int lado =Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                // El metodo Math.pow recibe dos parametros, la base y el exponente.
                System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));

                break;

            case 2:
                int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El área del rectángulo es: " + base*altura );
                break;

            case 3:

                base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));

                altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                System.out.println("El área del triángulo es " + (base*altura)/2);
                break;
            case 4:

                int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));

                System.out.print("El área del circulo es ");
                // La instrucción .printf, imprime con formato, cortando los decimales.
                // Math.PI es una constante que viene definida en java
                // Math.pow recibe dos parametros la base y el exponente y las eleva.
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
                break;

            default:
                System.out.println("La opción no es correcta");
        }
    }
}
