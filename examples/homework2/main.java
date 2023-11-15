package examples.homework2;

public class main {
    public static void main(String[] args) {
        Homework2Myroslava account = new Homework2Myroslava();
        account.setAccountHolderName("Myroslava Davyd");
        account.setAccountNumber(1100);
        account.deposit(400);

        System.out.println("Account Holder Name:" + account.getAccountHolderName());
        System.out.println(account.getBalance());
}
}
