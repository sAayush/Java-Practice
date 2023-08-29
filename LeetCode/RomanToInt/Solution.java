import java.util.Scanner;

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'I') {
                result += 1;
            } else if (currentChar == 'V') {
                if (i != 0) {
                    if (s.charAt(i - 1) == 'I') {
                        result += 3;
                    } else {
                        result += 5;
                    }
                } else {
                    result += 5;
                }
            } else if (currentChar == 'X') {
                if (i != 0) {
                    if (s.charAt(i - 1) == 'I') {
                        result += 8;
                    } else {
                        result += 10;
                    }
                } else {
                    result += 10;
                }
            } else if (currentChar == 'L') {
                if (i != 0) {
                    if (s.charAt(i - 1) == 'X') {
                        result += 30;
                    } else {
                        result += 50;
                    }
                } else {
                    result += 50;
                }
            } else if (currentChar == 'C') {
                if (i != 0) {
                    if (s.charAt(i - 1) == 'X') {
                        result += 80;
                    } else {
                        result += 100;
                    }
                } else {
                    result += 100;
                }
            } else if (currentChar == 'D') {
                if (i != 0) {
                    if (s.charAt(i - 1) == 'C') {
                        result += 300;
                    } else {
                        result += 500;
                    }
                } else {
                    result += 500;
                }
            } else if (currentChar == 'M') {
                if (i != 0) {
                    if (s.charAt(i - 1) == 'C') {
                        result += 800;
                    } else {
                        result += 1000;
                    }
                } else {
                    result += 1000;
                }
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String input = in.nextLine();
            int result = new Solution().romanToInt(input);
            System.out.println(result);
        }
    }
}