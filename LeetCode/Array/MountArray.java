public class MountArray {
    public boolean validMountainArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                return true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        MountArray ma = new MountArray();
        int[] arr = {0,3,2,1};
        System.out.println(ma.validMountainArray(arr));
    }
}
