import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Number of elements: ");

            int num = scanner.nextInt();
            int[] arr = new int[num];

            System.out.println("Enter values: ");
            for (int i = 0; i < num; i++) {
                arr[i] = scanner.nextInt();

            }

            System.out.println("Target: ");
            int target = scanner.nextInt();

            for (int i = 0; i < num; i++) {
                for (int j = i; j < num; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println(i + j);
                    }
                }
            }
        }
    }
}
