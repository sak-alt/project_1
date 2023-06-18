package GeneralCoreJavaProgram.Arrays;

public class SubtractionOfMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{50, 70}, {45, 40}};
        int[][] matrix2 = {{10, 16}, {45, 56}};
        int[][] sumOfMatrix = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumOfMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(sumOfMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
