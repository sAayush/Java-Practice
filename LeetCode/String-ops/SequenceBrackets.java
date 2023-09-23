import java.util.Stack;

public class SequenceBrackets {
    public static int isValid(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int tempmax = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(1);
            } else {
                if (stack.isEmpty()) {
                    continue;
                }
                if (stack.peek() == '(') {
                    stack.push(1);
                } else {
                    stack.push(0);
                }
            }
        }

        System.out.println(stack);

        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) == 1) {
                max++;
            } else {
                tempmax = max;
                max = 0;
            }
        }

        return Math.max(max, tempmax);
    }

    public static void main(String[] args) {
        String s = "()(()";
        System.out.println(isValid(s));
    }
}
