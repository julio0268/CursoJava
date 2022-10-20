import java.util.*;
public class Entrada_ejemplo2 {
    public static void main(String[] args){
        // programa que pida dos datos y que haga operaciones basicas
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int a = entrada.nextInt();
        System.out.println("Introduce otro número: ");
        int b = entrada.nextInt();

        int resultado_Sum =a+b;
        int resultado_Res = a-b;
        int resultado_div = a/b;
        int resultado_mul = a*b;

        System.out.println("El resultado de sumar " + a + " + " + b+ " es: "+ resultado_Sum+"");
        System.out.println("El resultado de restar " + a + " - " + b+ " es: "+ resultado_Res+"");
        System.out.println("El resultado de dividir " + a + " / " + b+ " es: "+ resultado_div+"");
        System.out.println("El resultado de multiplicar " + a + " * " + b+ " es: "+ resultado_mul+"");
    }
}
