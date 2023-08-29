import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> list = new ArrayList<String>();
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("")) {
                    break;
                } else {
                    list.add(input);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
