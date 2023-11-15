package examples.homework2.filip_timko;

public class BankAccount {
    private String accountName;
    private int accountNumber;
    private double currentBalance;

    public BankAccount(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.currentBalance = 0.0;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
        }
    }
}