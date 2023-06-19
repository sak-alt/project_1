package GeneralCoreJavaProgram.Arrays;

public class ThreeDimensionMatrix {
    public static void main(String[] args) {
        int[][][] matrix1 = {{{10, 20, 30}, {30, 40, 60}, {20, 50, 70}}};

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                for (int k = 0; k < matrix1[i][j].length; k++) {
                    System.out.print(matrix1[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
