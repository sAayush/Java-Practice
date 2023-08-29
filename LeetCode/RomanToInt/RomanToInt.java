import java.util.Scanner;

public class RomanToInt {

    public static int convert(String rom) {
        int sum = 0;
        for (int i = 0; i < rom.length(); i++) {
            if (rom.charAt(i) == 'I') {
                sum += 1;
            } else if (rom.charAt(i) == 'V') {
                if (i != 0) {
                    if (rom.charAt(i - 1) == 'I') {
                        sum += 3;
                    }
                } else {
                    sum += 5;
                }
            } else if (rom.charAt(i) == 'X') {
                if (i != 0) {
                    if (rom.charAt(i - 1) == 'I') {
                        sum += 8;
                    } else {
                        sum += 10;
                    }
                } else {
                    sum += 10;
                }
            } else if (rom.charAt(i) == 'L') {
                if (i != 0) {
                    if (rom.charAt(i - 1) == 'X') {
                        sum += 30;
                    } else {
                        sum += 50;
                    }
                } else {
                    sum += 50;
                }
            } else if (rom.charAt(i) == 'C') {
                if (i != 0) {
                    if (rom.charAt(i - 1) == 'X') {
                        sum += 80;
                    } else {
                        sum += 100;
                    }
                } else {
                    sum += 100;
                }
            } else if (rom.charAt(i) == 'D') {
                if (i != 0) {
                    if (rom.charAt(i - 1) == 'C') {
                        sum += 300;
                    } else {
                        sum += 500;
                    }
                } else {
                    sum += 500;
                }
            } else if (rom.charAt(i) == 'M') {
                if (i != 0) {
                    if (rom.charAt(i - 1) == 'C') {
                        sum += 800;
                    } else {
                        sum += 1000;
                    }
                } else {
                    sum += 1000;
                }
            } else {
                break;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String input = in.nextLine();
            System.out.println(convert(input));
        }
    }
}
