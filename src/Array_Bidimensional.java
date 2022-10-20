public class Array_Bidimensional {
    public static void main(String[] args) {

        int [][] matrix = new int[4][5];

        matrix[0][0]=32;
        matrix[0][1]=45;
        matrix[0][2]=123;
        matrix[0][3]=12;
        matrix[0][4]=21;

        matrix[1][0]=34;
        matrix[1][1]=54;
        matrix[1][2]=4;
        matrix[1][3]=43;
        matrix[1][4]=32;

        matrix[2][0]=121;
        matrix[2][1]=12;
        matrix[2][2]=23;
        matrix[2][3]=4233;
        matrix[2][4]=23;

        matrix[3][0]=12;
        matrix[3][1]=12;
        matrix[3][2]=213;
        matrix[3][3]=231;
        matrix[3][4]=21;

        //System.out.println("Valor almacenado en la posición 2, 3 " + matrix[2][3]);

        for (int i=0; i<4;i++){
            System.out.println();
            for (int j =0; j<5;j++){

                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
