package ArrayTest;

public class TripleArray {

    final int RANGE = 10;
    final int DIM = 3;

    private int [][][] mat3;

    public void initMatrix () {
        mat3 = new int [DIM][DIM][DIM];

        System.out.println("삼중 배열 생성");

        for (int i = 0; i < DIM; i++){
            for (int j = 0; j < DIM; j++){
                for (int k =0; k < DIM; k++){

                    mat3[i][j][k] = (int)(Math.random() * RANGE);

                }
            }
        }
    }
    public void printMatrix () {
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                for (int k = 0; k < DIM; k++) {
                    System.out.printf("%2d", mat3[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
