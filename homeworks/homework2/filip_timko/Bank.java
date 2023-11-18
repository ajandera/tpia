package examples.homework2.filip_timko;

public class Bank {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("Filip Timko", 56635);
            account.deposit(500);
            account.withdraw(200);
            System.out.println("Account Holder: " + account.getAccountName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Final Balance: " + account.getCurrentBalance());
        }

}
