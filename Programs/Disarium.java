package Programs;

import java.util.Scanner;

public class Disarium {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter val: ");
            int num = sc.nextInt();
            int temp = num;
            int count = 0;
            int sum = 0;

            while (num > 0) {
                num = num / 10;
                count++;
            }

            num = temp;

            while (num > 0) {
                int rem = num % 10;
                sum = (int) (sum + Math.pow(rem, count));
                count--;
                num /= 10;
            }
            if (sum == temp) {
                System.out.println("Diarium");
            } else {
                System.out.println("no");
            }
        }
    }
}