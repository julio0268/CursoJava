public class Uso_Arrays_III {
    public static void main(String[] args) {
        int []matriz_aleatorio = new int[150];

        for(int i = 0; i < matriz_aleatorio.length;i++ ){

            matriz_aleatorio[i]= (int)Math.round(Math.random()*100);
        }

        // Recorrer un array con un bucle for
        for(int numeros:matriz_aleatorio){
            System.out.print(numeros + " ");
        }
    }
}
