package GeneralCoreJavaProgram.Arrays;

import java.util.Arrays;

public class ThreeDimensionMatrix {
    public static void main(String[] args) {
        int[][][] matrix1 = {{10, 20, 30}, {30, 40, 60}, {20, 50, 70}};


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {

                }
                System.out.print(matrix1[i][j][k] + " ");
            }
            System.out.println();
        }
    }
}
