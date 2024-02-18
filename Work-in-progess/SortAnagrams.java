import java.util.List;
import java.util.*;

public class SortAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map < String, List < String >> map = new HashMap < > ();

    }

    public static void main(String[] args) {
        SortAnagrams sa = new SortAnagrams();
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(sa.groupAnagrams(strs));
    }
}