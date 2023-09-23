public class DupeZero {
    public void duplicateZeros(int[] arr) {
        int[] newarr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < newarr.length; i++) {
            if (j >= arr.length) {
                break;
            }
            if (arr[i] == 0) {
                newarr[j] = 0;
                j++;
                if (j < newarr.length) {
                    newarr[j] = 0;
                    j++;
                }
            }
            else {
                newarr[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newarr[i];
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 4, 0, 2};
        DupeZero sol = new DupeZero();
        sol.duplicateZeros(arr);
    }
}
