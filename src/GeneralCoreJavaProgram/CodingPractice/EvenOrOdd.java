package GeneralCoreJavaProgram.CodingPractice;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = scanner.nextInt();

        int b = a % 2;

        if( b == 0)
        {
        System.out.println("The Number is even");
        }
        else{
        System.out.println("The Number is odd");
    }
    }


}
