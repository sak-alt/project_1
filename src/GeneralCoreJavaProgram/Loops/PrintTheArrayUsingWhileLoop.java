package GeneralCoreJavaProgram.Loops;

import java.util.Scanner;

public class PrintTheArrayUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of array : ");
        int[] n = new int[3];
        int index = 0;
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();
        while (index < n.length) {
            System.out.print(n[index] + " ");
            index++;
        }
    }
}
