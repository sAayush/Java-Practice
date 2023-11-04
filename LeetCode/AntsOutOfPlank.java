public class AntsOutOfPlank {
    public int getLastMoment(int n, int[] left, int[] right) {
        int max = 0;
        for (int i = 0; i < left.length; i++) {
            if (left[i] > max) {
                max = left[i];
            }
        }
        for (int i = 0; i < right.length; i++) {
            if (n - right[i] > max) {
                max = n - right[i];
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        AntsOutOfPlank a = new AntsOutOfPlank();
        int n = 4;
        int[] left = {4,3};
        int[] right = {0,1};
        System.out.println(a.getLastMoment(n, left, right));
    }
}
