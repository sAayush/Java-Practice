public class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int test = (minutesToTest / minutesToDie) + 1;
        int i = 0;
        while (Math.pow(test, i) < buckets) {
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        PoorPigs pp = new PoorPigs();
        System.out.println(pp.poorPigs(1000, 15, 60));
    }
}
