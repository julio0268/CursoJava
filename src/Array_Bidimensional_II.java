public class Array_Bidimensional_II {
    public static void main(String[] args) {

        int [][] matrix = {
                {12,2,21,12,34},
                {12,2,21,12,34},
                {12,2,21,12,34},
                {12,2,21,12,34}
        };

        for (int[]fila:matrix){
            System.out.println();
            for (int z: fila){
                System.out.print(z + " ");
            }
        }
        for (int i=0;i<4;i++){
            System.out.println();
            for (int j=0;j<4;j++){
                System.out.print(matrix[i][j] + " ");
            }
        }




    }
}
