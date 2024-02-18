import java.util.ArrayList;
import java.util.List;

public class SeqDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            int num = i;
            for (int j = i + 1; j <= 9; j++) {
                num = num * 10 + j;
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        result.sort(null);
        return result;
    }

    public static void main(String[] args) {
        SeqDigits sd = new SeqDigits();
        int low = 100;
        int high = 300;
        System.out.println(sd.sequentialDigits(low, high));
    }
}
