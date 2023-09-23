import java.util.Scanner;

// Given a ransom note and a magazine, return true if the ransom note can be constructed from the magazines; otherwise, return false.
// Each letter in the magazine string can only be used once in your ransom note.

public class RansomNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a note: ");
        String note = sc.nextLine();
        System.out.println("Enter a magazine: ");
        String mag = sc.nextLine();

        int count = 0;

        for (int i = 0; i < mag.length(); i++) {
            for (int j = 0; j < note.length(); j++) {
                if (mag.charAt(i) == note.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        if (count == note.length()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
