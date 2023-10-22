import java.io.*;
import java.util.*;

class Result {

    public static void typeCounter(String sentence) {
        int str = 0;
        int integer = 0;
        int doubl = 0;
        String[] words = sentence.split("\\s+"); // Split by one or more whitespaces

        for (String word : words) {
            try {
                // Use the parseInt and parseDouble methods to check for integers and doubles
                Integer.parseInt(word);
                integer++;
            } catch (NumberFormatException e) {
                try {
                    Double.parseDouble(word);
                    doubl++;
                } catch (NumberFormatException f) {
                    str++;
                }
            }
        }
        System.out.println("String: " + str);
        System.out.println("Integer: " + integer);
        System.out.println("Double: " + doubl);
    }

}

public class TypeChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}
