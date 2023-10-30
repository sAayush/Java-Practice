public class BinaryListSort {
    public int[] sortByBits(int[] arr) {
        int[] count = new int[arr.length];
        int i = 0;
        for (int num : arr) {
            count[i] = Integer.bitCount(num);
            i++;
        }
        for (int j = 0; j < count.length; j++) {
            for (int k = j + 1; k < count.length; k++) {
                if (count[j] > count[k]) {
                    int temp = count[j];
                    count[j] = count[k];
                    count[k] = temp;
                    temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                } else if (count[j] == count[k]) {
                    if (arr[j] > arr[k]) {
                        int temp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = temp;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BinaryListSort bls = new BinaryListSort();
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] result = bls.sortByBits(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
