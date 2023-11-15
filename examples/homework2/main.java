package examples.homework2;
public class main {
    public static void main(String[] args) {
        Homework2_Barvynska account = new Homework2_Barvynska();
        account.setAccountHolderName("Barvynska");
        account.setAccountNumber(1500);
        account.deposit(600);

        System.out.println("Account Holder Name:" + account.getAccountHolderName());
        System.out.println(account.getBalance());
    }
}