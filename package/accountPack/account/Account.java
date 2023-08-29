package account;

public class Account {
    private String name;
    private double income;

    public Account(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + income);
        System.out.println();
    }
}