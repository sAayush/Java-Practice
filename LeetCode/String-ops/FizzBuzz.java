import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a postive integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Invalid input.");
            System.exit(0);
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                } else if (i % 3 == 0) {
                    System.out.print("Fizz ");
                } else if (i % 5 == 0) {
                    System.out.print("Buzz ");
                } else {
                    System.out.print(i + " ");
                }
            }

        }
    }
}
