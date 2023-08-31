import java.util.Scanner;

public class CustomerBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of customers: ");
        int cust = sc.nextInt();

        System.out.println("Enter the number of banks: ");
        int bank = sc.nextInt();

        int[][] arr = new int[cust][bank];

        for (int i = 0; i < cust; i++) {
            for (int j = 0; j < bank; j++) {
                System.out.println("Enter the amount of money customer " + (i + 1) + " has in bank " + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int tempmax = 0;
        int maxcust = 0;

        for (int i = 0; i < cust; i++) {
            for (int j = 0; j < bank; j++) {
                tempmax += arr[i][j];
            }
            if (tempmax > max) {
                max = tempmax;
                tempmax = 0;
                maxcust = i + 1;
            }
        }
        System.out
                .println("Customer " + maxcust + " has the maximum amount of money in the bank which is " + max + ".");

    }
}