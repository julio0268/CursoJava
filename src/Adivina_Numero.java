import java.util.*;
public class Adivina_Numero {
    public static void main(String[] args){
        // REFUNDICIÓN -> CONVERTIR UN TIPO DE DATO A OTRO

        // El metodo Math.random devulve un valor aleatorio double
        int aleatorio=(int)(Math.random()*100);

        Scanner entrada = new Scanner(System.in);
        int numero=0;
        int intentos=0;
        // Mientras número sea diferente a aleatorio

       do{
            intentos++;
            System.out.println("Introduce un número, por favor");

            numero=entrada.nextInt();

            if(aleatorio < numero){
                System.out.println("Más bajo");
            }
            else if(aleatorio > numero){
                System.out.println("Más alto");
            }
        }while(numero != aleatorio);
        System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
    }
}
