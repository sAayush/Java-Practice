public class ArrayQtr {
    public int findSpecialInteger(int[] arr) {
        // int len = arr.length;
        // int qtr = len / 4;
        // for (int i = 0; i < len; i++) {
        // if (arr[i] == arr[i + qtr]) {
        // return arr[i];
        // }
        // }
        // return -1;
        if (arr.length == 1) {
            return arr[0];
        } else {
            int len = arr.length;
            int qtr = len / 4;
            int count = 1;
            for (int i = 1; i < len - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                    if (count > qtr) {
                        return arr[i];
                    }
                } else {
                    count = 1;
                }

            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        ArrayQtr aq = new ArrayQtr();
        int[] arr = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };
        System.out.println(aq.findSpecialInteger(arr));
    }
}
