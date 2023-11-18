// BankAccount.java

package examples.homework2.Martin_Kristak.BankAccount;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double currentBalance;

    public BankAccount(String accountHolderName, int accountNumber, double currentBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
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

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
        } else {
            System.out.println("Invalid amount. Please enter a positive number less than or equal to the current balance.");
        }
    }
}