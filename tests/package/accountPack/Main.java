import account.Account;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("John Doe", 50000);
        Account acc2 = new Account("Jane Smith", 75000);

        acc1.print();
        acc2.print();
    }
}