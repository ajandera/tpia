package examples.homework2.Martin_Kristak.BankAccount;

public class Bank {
    public static void main(String[] args) {
    BankAccount account = new BankAccount("John Doe", 123456789, 0.0);
    System.out.println("Initial balance: " + account.getCurrentBalance());

    account.deposit(1000);
    System.out.println("After depositing 1000: " + account.getCurrentBalance());

    account.withdraw(500);
    System.out.println("After withdrawing 500: " + account.getCurrentBalance());
}
}
