class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int age = -1;
            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}