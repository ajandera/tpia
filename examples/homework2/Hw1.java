package homework2;

public class Hw1 {
    private String accountHolderName;
    private long accountNumber;
    private double balance;

    // Constructor to initialize the account
    public Hw1(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Getter and setter methods for encapsulation
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        Hw1 account = new Hw1("John Doe", 1234567890);

        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());

        account.deposit(1000.0);
        System.out.println("Initial Balance: $" + account.getBalance());

        account.withdraw(500.0);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
    }
}

