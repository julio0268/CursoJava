public class Uso_Arrays {
    public static void main(String[] args) {
        // Para declarar un array

        /*int [] mi_matriz = new int[5];

        mi_matriz [0]=5;
        mi_matriz [1]=6;
        mi_matriz [2]=34;
        mi_matriz [3]=3;
        mi_matriz [4]=-12;*/

        // declarar un array
        int mi_matriz[] ={5, 6, 34, 3, -12};

        for(int i=0;i<mi_matriz.length;i++){
            System.out.println("valor del indice " + i + " = " + mi_matriz[i]);

        }
    }
}
