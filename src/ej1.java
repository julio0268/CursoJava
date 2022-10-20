import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        /*1) Crea un array de 10 posiciones de números con valores pedidos por tec
        lado. Muestra por consola el indice y el valor al que corresponde. Haz
        dos métodos, uno para rellenar valores y otro para mostrar.*/

        int [] number = new int [10];

        for (int i = 0;i < number.length;i++){
             Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                    number [i] = entrada.nextInt();
                        System.out.println("Su número es: " + number[i]);
        }

        String var = "";

        for (int numeros:number){
            var += " " + numeros;
        }
            System.out.printf("Lista de números [%s]",var);


    }
}
