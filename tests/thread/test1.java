package tests.thread;

public class test1 {
    public static void main(String[] args) {
        int res = 0;
        try {
            res = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Result: " + res);
    }
}