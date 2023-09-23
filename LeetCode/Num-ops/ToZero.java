import java.util.Scanner;

// Given a positive integer num, return the number of steps to reduce it to zero.
// If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

public class ToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int num = sc.nextInt();
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        System.out.println("Steps: " + steps);
    }
}
