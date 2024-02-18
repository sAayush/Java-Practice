public class SortCharFreq {
    public String frequencySort(String s) {
        int freq[] = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int max = 0;
            int maxIndex = 0;
            for (int j = 0; j < 26; j++) {
                if (freq[j] > max) {
                    max = freq[j];
                    maxIndex = j;
                }
            }
            if (max == 0) {
                break;
            }
            for (int k = 0; k < max; k++) {
                sb.append((char) (maxIndex + 'a'));
            }
            freq[maxIndex] = 0;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SortCharFreq scf = new SortCharFreq();
        String s = "tree";
        System.out.println(scf.frequencySort(s));
    }
}
