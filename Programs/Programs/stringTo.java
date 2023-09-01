package Programs;
import java.util.Scanner;

public class stringTo {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your sentence:");
            String s = sc.nextLine();

            String[] words = s.split(" ");
            int count=0;


            for (String word : words) {
                System.out.println("\"" + word +"\"");
                count++;
            }System.out.println("Number of words:"+count);
        }
    }
}
