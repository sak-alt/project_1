package GeneralCoreJavaProgram.EncapsulationExample;

import java.util.Scanner;

public class EncapsulationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EncapsulationExample encapsulationExample = new EncapsulationExample();
        encapsulationExample.setBankAccount(123456);
        encapsulationExample.setBankBalance(20000000);

        System.out.println("Enter the Bank Account Number");
        int bankAccountNumberEnteredByUser = scanner.nextInt();
        if (encapsulationExample.getBankAccount() == bankAccountNumberEnteredByUser) {
            System.out.println(encapsulationExample.getBankBalance());
        } else {
            System.out.println("You are not the Valid Personnel");
        }
    }
}
