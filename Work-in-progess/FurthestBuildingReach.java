import java.util.Arrays;
import java.util.PriorityQueue;

public class FurthestBuildingReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue pq = new PriorityQueue<>();
        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                pq.add(diff);
            }
            if (pq.size() > ladders) {
                bricks -= (int) pq.poll();
            }
            if (bricks < 0) {
                return i;
            }
        }
        return heights.length - 1;
    }

    public static void main(String[] args) {
        FurthestBuildingReach fbr = new FurthestBuildingReach();
        int[] heights = { 4, 2, 7, 6, 9, 14, 12 };
        int bricks = 5;
        int ladders = 1;
        System.out.println(fbr.furthestBuilding(heights, bricks, ladders));
    }
}
