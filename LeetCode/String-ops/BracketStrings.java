import java.util.Scanner;

public class BracketStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] stack = new int[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack[++top] = 1;
            } else if (s.charAt(i) == ')') {
                if (top == -1) {
                    System.out.println("NO");
                    return;
                }
                if (stack[top] == 1) {
                    top--;
                } else {
                    System.out.println("NO");
                    return;
                }
            } else if (s.charAt(i) == '[') {
                stack[++top] = 2;
            } else if (s.charAt(i) == ']') {
                if (top == -1) {
                    System.out.println("NO");
                    return;
                }
                if (stack[top] == 2) {
                    top--;
                } else {
                    System.out.println("NO");
                    return;
                }
            } else if (s.charAt(i) == '{') {
                stack[++top] = 3;
            } else {
                if (top == -1) {
                    System.out.println("NO");
                    return;
                }
                if (stack[top] == 3) {
                    top--;
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if (top == -1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
