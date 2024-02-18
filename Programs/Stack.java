import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack {

    List<Integer> stack = new ArrayList<Integer>();
    int top = -1;

    void push(int x) {
        stack.add(x);
        top++;
        System.out.println(stack.get(top) + " is pushed");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        stack.remove(top);
        top--;
    }

    void print() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Print");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int x = sc.nextInt();
                    s.push(x);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.print();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
