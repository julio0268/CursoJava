public class Declaraciones_Operadores {
    public static void main (String [] args){


        // Para declarar una constante se pone la palabra final antes de declarar la variable
        final double apulgadas = 2.54;

        double cm = 6;

        double resultado = cm/apulgadas;

        int operador1, operador2, resultado1;

        operador1=9;
        operador2=7;
        resultado1 = operador1 + operador2;

        System.out.println(resultado1);
        System.out.println("En " + cm + "cm hay " + resultado + "pulgadas");
    }
}
