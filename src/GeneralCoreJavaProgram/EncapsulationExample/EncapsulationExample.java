package GeneralCoreJavaProgram.EncapsulationExample;

public class EncapsulationExample {
    private int bankBalance;

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            bankBalance += amount;
            System.out.println("Deposit successful. New balance: " + bankBalance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && bankBalance >= amount) {
            bankBalance -= amount;
            System.out.println("Withdrawal successful. New balance: " + bankBalance);
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }
}
