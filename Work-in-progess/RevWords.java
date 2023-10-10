public class RevWords {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse());
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        RevWords rw = new RevWords();
        String s = "the sky is blue";
        System.out.println(rw.reverseWords(s));
    }
}
