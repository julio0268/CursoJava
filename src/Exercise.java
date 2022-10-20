import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        int f=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer valor ");

        int m= input.nextInt();

        System.out.println("Ingrese el primer valor ");

        int n= input.nextInt();

        int [][] array = new int[m][n];

        for (int i=0, k=1;i< array.length;i++){
            System.out.println();
            for (int j=0 ;j < array[i].length;j++){

                array[i][j] = k++;

                f=f+k;

                System.out.print(array[i][j]+ " ");


            }

        }
        System.out.println("\n La suma de los numeros es: " + f + " ");
        for(int u =0;u< f;u++){

        }
    }
}
