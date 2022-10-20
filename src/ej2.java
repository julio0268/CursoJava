import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        /*2) Crea un array de números donde le indicamos por teclado el tamaño del array,
        rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla
        el valor de cada posición y la suma de todos los valores. Haz un método para rellenar
        el array (que tenga como parámetros los números entre los que tenga que generar),
        para mostrar el contenido y la suma del array y un método privado para generar número
        aleatorio (lo puedes usar para otros ejercicios).*/

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array");

        int num = input.nextInt();
        int suma=0;

        int [] numeros =new int[num];
        //System.out.println(num_ran);
        for (int i =0; i<numeros.length;i++){
            int num_ran = (int)Math.round(Math.random()*10);
            numeros[i]=num_ran;
            System.out.println("El valor de la poscición " + i +" es: " + numeros[i]);

            suma = suma+numeros[i];
            System.out.printf("La suma número %d es: %d \n",i,suma );
        }
            System.out.println(suma);
    }
}
