package examples.homework2;

public class Homework2_Barvynska {
    private String accountHolderName;
    private int accountNumber;
    private double currentBalance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {

        return accountNumber;
    }
    public double getBalance() {
        return currentBalance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
            return true;
        }
        return false;
    }
}
