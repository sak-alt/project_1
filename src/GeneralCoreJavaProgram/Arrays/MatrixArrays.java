package GeneralCoreJavaProgram.Arrays;

public class MatrixArrays {
    public static void main(String[] args) {
        int[][] matrix1 = {{10, 20}, {30, 40}};
        int[][] matrix2 = {{10, 20}, {30, 40}};
        int[][] sumOfMatrix = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumOfMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sumOfMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("##########################################################");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("##########################################################");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
