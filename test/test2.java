public class test2 {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("Result: " + result);
    }
}
