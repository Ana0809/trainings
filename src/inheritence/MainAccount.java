package inheritence;

public class MainAccount {
    public static void main(String[] args) {
        Account ac = new Account(100);
        ac.deposit(50);
        ac.withdraw(10);
        System.out.println(ac.getBalance());
        System.out.println(ac.getAccountNumber());
    }
}


