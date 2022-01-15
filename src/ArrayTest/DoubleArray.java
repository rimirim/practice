package ArrayTest;

public class DoubleArray {
    final int RANGE = 10;
    final int DIM = 2;

    private int [][] mat2;

    public void initMatrix () {
        mat2 = new int [DIM][DIM];
        // 배열 인덱스 [0][0] [0][1] [1][0] [1][1]

        System.out.println("이중 배열 생성");

        for (int i = 0; i < DIM; i++){
            for (int j =0; j <DIM; j++) {
                mat2[i][j] = (int)(Math.random() * RANGE);
            }

        }
    }

    public void printMatrix () {
        for (int i = 0; i < DIM; i++){
            for (int j =0; j < DIM; j++){
                System.out.printf("%2d", mat2[i][j]);
            }
            System.out.println();
        }
    }
}

