import java.util.Arrays;

public class MonsterElimination {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] time = new int[dist.length];
        for (int i = 0; i < dist.length; i++) {
            time[i] = dist[i] / speed[i];
            if (dist[i] % speed[i] != 0) {
                time[i]++;
            }
        }
        Arrays.sort(time);
        for (int i = 0; i < time.length; i++) {
            if (time[i] <= i) {
                return i;
            }
        }
        return time.length;
    }

    public static void main(String[] args) {
        MonsterElimination me = new MonsterElimination();
        int[] dist = { 1, 3, 4 };
        int[] speed = { 1, 1, 1 };
        System.out.println(me.eliminateMaximum(dist, speed));
    }
}
