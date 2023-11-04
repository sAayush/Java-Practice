import java.util.ArrayList;
import java.util.List;

public class StackOps {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int ci = 0;
        for (int i = 1; i <= n; i++) {
            if (ci == target.length) {
                break;
            }
            if (target[ci] == i) {
                res.add("Push");
                ci++;
            } else {
                res.add("Push");
                res.add("Pop");
            }
        }
        return res;
    }

    public static void main(String[] args) {
        StackOps stackOps = new StackOps();
        int[] target = { 1, 3 };
        int n = 3;
        System.out.println(stackOps.buildArray(target, n));
    }
}
